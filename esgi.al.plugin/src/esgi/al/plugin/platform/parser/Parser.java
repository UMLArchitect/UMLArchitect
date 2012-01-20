package esgi.al.plugin.platform.parser;

import java.io.IOException;
import java.util.Hashtable;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.LocatorImpl;
import org.xml.sax.helpers.XMLReaderFactory;

import esgi.al.plugin.platform.interfaces.IObject;

public class Parser implements ContentHandler {
	
	@SuppressWarnings("unused")
	private Locator locator;
	private XMLReader saxReader;
	private String uri;
	protected IObject head = null, prev = null, current = null;
	protected Hashtable<String, Resultable> actions = new Hashtable<String, Resultable>();
	protected Resultable runner = null;
	protected Hashtable<String,String> valid = new Hashtable<String,String>();
	
	int cptSpaces = 0;
	
	public Parser(String uri) throws SAXException, IOException {
		super();
		
		locator = new LocatorImpl();
		
		saxReader = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		saxReader.setContentHandler(this);
		
		this.uri = uri;
	}
	
	public IObject getHead() {
		return head;
	}
	
	public IObject parse()
	{
		try {
			saxReader.parse(uri);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return head;
	}

	public boolean addAction(String name, Resultable action)
	{
		return null != actions.put(name, action);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {}

	@Override
	public void endDocument() throws SAXException {
		System.out.println(head);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (valid.contains(localName))
		{
			cptSpaces--;
			for(int i = 0; i<cptSpaces; i++)
				System.out.print('-');
			System.out.println("O : "+localName);
			try
			{
				if (null != current)
					current = current.getParent();
			}
			catch(Exception e){}
			
			//valid.remove(localName);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("Head: "+head);
		System.out.println("Previous: "+prev);
		System.out.println("Current: "+current);
		System.out.println("--------------------------------------------------");
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {}

	@Override
	public void setDocumentLocator(Locator locator) {
		this.locator = locator;
	}

	@Override
	public void skippedEntity(String name) throws SAXException {}

	@Override
	public void startDocument() throws SAXException {}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		boolean ok = (localName.startsWith("uml:"));
		String str = null;
		
		if (!ok)
		{
			l:for (int index = 0; index < attributes.getLength(); index++)
			{
				ok = attributes.getLocalName(index).equals("type") && attributes.getValue(index).startsWith("uml:");
				if (ok) 
				{
					str = attributes.getValue(index).substring(4);
					break l;
				}
			}
		}
		else str = localName.substring(4);
				
		if (ok && actions.containsKey(str))
		{
			for(int i = 0; i<cptSpaces; i++)
				System.out.print('-');
			
			System.out.println("I : "+localName + " - name : " +str);
						
			if (null != (runner = actions.get(str)))
			{
				for (int index = 0; index < attributes.getLength(); index++)
				{
					runner.setAttribute(attributes.getLocalName(index), attributes.getValue(index));
				}
	
				prev = current;
				current = runner.run();
				
				if (null != current)
				{
					if (null == prev)
						head = current;
					else
					{
						current.setParent(prev);
						prev.add(current);
					}
				}
			} else System.out.println("Sonovabitch !!!!!!!!");
			
			valid.put(localName, localName);
			cptSpaces++;
		}
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {}
}
