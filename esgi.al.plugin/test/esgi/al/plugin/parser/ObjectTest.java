package esgi.al.plugin.parser;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import esgi.al.plugin.platform.interfaces.IObject;
import esgi.al.plugin.platform.model.Object;

public class ObjectTest {
	
	RealObject obj;
	
	protected class RealObject extends Object
	{
		public RealObject(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		Stack<IObject> subs = new Stack<IObject>();
		
		@Override
		public void add(IObject object) {
			subs.add(object);
		}
		
		public Stack<IObject> getAll()
		{
			return subs;
		}
	}

	@Before
	public void setUp() throws Exception {
		obj = new RealObject("Hello");
	}

	@Test
	public void testParent() {
		Object parent = new Object("Test") {
			
			@Override
			public void add(IObject object) {
				
			}
		};
		
		assertNull(obj.getParent());
		
		obj.setParent(parent);
		
		assertEquals(parent, obj.getParent());
	}
}
