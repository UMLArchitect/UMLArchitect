package esgi.al.plugin.parser;

import static org.junit.Assert.*;

import java.util.Enumeration;
import org.junit.Before;
import org.junit.Test;

import esgi.al.plugin.platform.interfaces.IModel;
import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.model.Model;
import esgi.al.plugin.platform.model.Package;
import esgi.al.plugin.platform.model.type.Class;
import esgi.al.plugin.platform.parser.Parser;
import esgi.al.plugin.platform.parser.Resultable;

public class ParserTest {
	
	Parser p;

	@Before
	public void setUp() throws Exception {
		p = new Parser("file:C:\\Users\\TheGold\\Documents\\ESGI\\Cours\\4ème année\\Génie Logiciel\\Projet\\esgi.al.plugin\\Class Diagram\\JD.xmi");
	
		addActions();
	}

	private void addActions() {
		
		p.addAction("Model", new Resultable() {
			
			@Override
			public IObject run() {
				
				System.out.println("{");
				
				Enumeration<String> keys = attributes.keys();
				
				while(keys.hasMoreElements())
				{
					String next = keys.nextElement();
					System.out.println("\t" + next + " = " + attributes.get(next));
				}
				
				System.out.println("}");
				
				return new Model(attributes.get("id"), attributes.get("name"));
			}
		});
		
		p.addAction("Package", new Resultable() {
			
			@Override
			public IObject run() {
				
				System.out.println("{");
				
				Enumeration<String> keys = attributes.keys();
				
				while(keys.hasMoreElements())
				{
					String next = keys.nextElement();
					System.out.println("\t" + next + " = " + attributes.get(next));
				}
				
				System.out.println("}");
				
				return new Package(attributes.get("id"), attributes.get("name"));
			}
		});

		p.addAction("Class", new Resultable() {
			
			@Override
			public IObject run() {
				
				System.out.println("{");
				
				Enumeration<String> keys = attributes.keys();
				
				while(keys.hasMoreElements())
				{
					String next = keys.nextElement();
					System.out.println("\t" + next + " = " + attributes.get(next));
				}
				
				System.out.println("}");
				
				return new Class(attributes.get("id"), attributes.get("name"));
			}
		});
	
		
	}

	@Test
	public void testParse() {
		IObject head;
		assertNotNull(head = p.parse());
		assertEquals(true, head instanceof IModel);
	}
}
