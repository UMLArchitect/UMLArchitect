package uml.test;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

	public enum TestIHaveFunWithEnums 
	{
	     WAITING(0),
	     READY(1),
	     SKIPPED(-1),
	     COMPLETED(5);

	     private static final Map<Integer,TestIHaveFunWithEnums> lookup 
	          = new HashMap<Integer,TestIHaveFunWithEnums>();

	     static {
	          for(TestIHaveFunWithEnums s : EnumSet.allOf(TestIHaveFunWithEnums.class))
	               lookup.put(s.getCode(), s);
	     }

	     private int code;

	     private TestIHaveFunWithEnums(int code) {
	          this.code = code;
	     }

	     public int getCode() { return code; }

	     public static TestIHaveFunWithEnums get(int code) { 
	          return lookup.get(code); 
	     }
	}
