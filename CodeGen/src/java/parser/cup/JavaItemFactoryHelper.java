/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */
package uml.java.parser.cup;


// TODO: Auto-generated Javadoc
/**
 * The Class JavaItemFactoryHelper.
 */
public final class JavaItemFactoryHelper {

	/** The LITERALS. */
	private static int[] LITERALS =
	{
			Sym.BOOLEAN_LITERAL,
			Sym.STRING_LITERAL,
			Sym.INTEGER_LITERAL,
			Sym.CHARACTER_LITERAL,
			Sym.FLOATING_POINT_LITERAL
	};
	
	/** The PRIMITIVES. */
	private static int[] PRIMITIVES =
	{
			Sym.BOOLEAN,
			Sym.BYTE,
			Sym.SHORT,
			Sym.INT,
			Sym.LONG,
			Sym.CHAR,
			Sym.FLOAT,
			Sym.DOUBLE
	};
	
	/** The PRIMITIVE s_ string. */
	private static String[] PRIMITIVES_STRING =
	{
			"",
			"",
			"Boolean",
			"byte",
			"short",
			"int",
			"long",
			"char",
			"float",
			"double"
	};
	
	/**
	 * Primitive to string.
	 *
	 * @param sym the sym
	 * @return the string
	 */
	public static String primitiveToString (int sym)
	{
		if (sym<PRIMITIVES_STRING.length)
		{
			return PRIMITIVES_STRING[sym];
		}
		return null;
	}

	/**
	 * Checks if is literal.
	 *
	 * @param sym the sym
	 * @return the boolean
	 */
	public static Boolean isLiteral(int sym)
	{
		for (int i : LITERALS) {
			if (i==sym)
				return true;
		}
		return false;
	}
	
	/**
	 * Checks if is primitive.
	 *
	 * @param sym the sym
	 * @return the boolean
	 */
	public static Boolean isPrimitive(int sym)
	{
		for (int i : PRIMITIVES) {
			if (i==sym)
				return true;
		}
		return false;
	}
	
}
