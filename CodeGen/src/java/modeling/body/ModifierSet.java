/*
 * UML ARCHITECT GENCODE (Equipe R. Mogos)
 * Auteur: Thomas Raynal (AL4 Alt)
 * Date:24/03/2012
 * Contact: thomas.raynal2@gmail.com
 */

package uml.java.modeling.body;

import java.lang.reflect.Modifier;

import uml.java.parser.cup.Sym;


// TODO: Auto-generated Javadoc
/**
 * Represent a set of modifiers
 */
public final class ModifierSet{

    /** The Constant PUBLIC. */
    public static final int PUBLIC = Modifier.PUBLIC;

    /** The Constant PRIVATE. */
    public static final int PRIVATE = Modifier.PRIVATE;

    /** The Constant PROTECTED. */
    public static final int PROTECTED = Modifier.PROTECTED;

    /** The Constant STATIC. */
    public static final int STATIC = Modifier.STATIC;

    /** The Constant FINAL. */
    public static final int FINAL = Modifier.FINAL;

    /** The Constant SYNCHRONIZED. */
    public static final int SYNCHRONIZED = Modifier.SYNCHRONIZED;

    /** The Constant VOLATILE. */
    public static final int VOLATILE = Modifier.VOLATILE;

    /** The Constant TRANSIENT. */
    public static final int TRANSIENT = Modifier.TRANSIENT;

    /** The Constant NATIVE. */
    public static final int NATIVE = Modifier.NATIVE;

    /** The Constant ABSTRACT. */
    public static final int ABSTRACT = Modifier.ABSTRACT;

    /** The Constant STRICTFP. */
    public static final int STRICTFP = Modifier.STRICT;

    /**
     * Adds the modifier.
     *
     * @param modifiers the modifiers
     * @param mod the mod
     * @return the int
     */
    public static int addModifier(int modifiers, int mod) {
        return modifiers | mod;
    }
    
    /**
     * Checks if is access modifier.
     *
     * @param sym the sym
     * @return true, if is access modifier
     */
    public static boolean isAccessModifier(int sym)
    {
    	if 
    	(
    		(sym== isModifier(Sym.NEW) ||
    		sym== isModifier(Sym.PUBLIC) ||
    		sym== isModifier(Sym.PRIVATE) ||
    		sym== isModifier(Sym.PROTECTED))
    			
    	)
    	{
    		return true;
    	}
    	
    	return false;
    	
    }
    
    /**
     * Checks if is modifier.
     *
     * @param sym the sym
     * @return the int
     */
    public static int isModifier (int sym)
    {
    	switch (sym)
    	{
    	
    	case 24:
    		//PUBLIC
    		return PUBLIC;
    		
    	case 26:
    		//PRIVATE
    		return PRIVATE;
    
    	case 25:
    		//PROTECTED
    		return PROTECTED;
    		
    	case 27:
    		//STATIC
    		return STATIC;	

    	case 29:
    		//FINAL
    		return FINAL;	

    	case 31:
    		//SYNCHRONIZED
    		return SYNCHRONIZED;	
    		
    	case 33:
    		//VOLATILE
    		return VOLATILE;	
    		
    	case 32:
    		//TRANSIENT
    		return TRANSIENT;	

    	case 30:
    		//NATIVE
    		return NATIVE;
    		
    	case 28:
    		//ABSTRACT
    		return ABSTRACT;
 
    	case 100:
    		//STRICTFP
    		return STRICTFP;
    	}
    	
    	return 0;
    }
    
    /**
     * Return the String representation of a modifier (java sdk constants).
     *
     * @param modifiers the modifiers
     * @return the string
     */
    public static String modifierToString (int modifiers)
    {
    	String  r="";
		
		if (isPublic(modifiers))
			r+="public ";
		if (isPrivate(modifiers))
			r+="private ";
		if (isStatic(modifiers))
			r+="static ";
		if (isSynchronized(modifiers))
			r+="synchronized ";
		if (isNative(modifiers))
			r+="native ";
		if (isAbstract(modifiers))
			r+="abstract ";
		if (isFinal(modifiers))
			r+="final ";
		if (isProtected(modifiers))
			r+="protected ";
		if (isTransient(modifiers))
			r+="transient ";
		if (isStrictfp(modifiers))
			r+="scrictfp ";
													
		return r;
    }

    /**
     * Checks for modifier.
     *
     * @param modifiers the modifiers
     * @param modifier the modifier
     * @return true, if successful
     */
    public static boolean hasModifier(int modifiers, int modifier) {
        return (modifiers & modifier) != 0;
    }

    /**
     * Checks if is abstract.
     *
     * @param modifiers the modifiers
     * @return true, if is abstract
     */
    public static boolean isAbstract(int modifiers) {
        return (modifiers & ABSTRACT) != 0;
    }

    /**
     * Checks if is final.
     *
     * @param modifiers the modifiers
     * @return true, if is final
     */
    public static boolean isFinal(int modifiers) {
        return (modifiers & FINAL) != 0;
    }

    /**
     * Checks if is native.
     *
     * @param modifiers the modifiers
     * @return true, if is native
     */
    public static boolean isNative(int modifiers) {
        return (modifiers & NATIVE) != 0;
    }

    /**
     * Checks if is private.
     *
     * @param modifiers the modifiers
     * @return true, if is private
     */
    public static boolean isPrivate(int modifiers) {
        return (modifiers & PRIVATE) != 0;
    }

    /**
     * Checks if is protected.
     *
     * @param modifiers the modifiers
     * @return true, if is protected
     */
    public static boolean isProtected(int modifiers) {
        return (modifiers & PROTECTED) != 0;
    }

    /**
     * Checks if is public.
     *
     * @param modifiers the modifiers
     * @return true, if is public
     */
    public static boolean isPublic(int modifiers) {
        return (modifiers & PUBLIC) != 0;
    }

    /**
     * Checks if is static.
     *
     * @param modifiers the modifiers
     * @return true, if is static
     */
    public static boolean isStatic(int modifiers) {
        return (modifiers & STATIC) != 0;
    }

    /**
     * Checks if is strictfp.
     *
     * @param modifiers the modifiers
     * @return true, if is strictfp
     */
    public static boolean isStrictfp(int modifiers) {
        return (modifiers & STRICTFP) != 0;
    }

    /**
     * Checks if is synchronized.
     *
     * @param modifiers the modifiers
     * @return true, if is synchronized
     */
    public static boolean isSynchronized(int modifiers) {
        return (modifiers & SYNCHRONIZED) != 0;
    }

    /**
     * Checks if is transient.
     *
     * @param modifiers the modifiers
     * @return true, if is transient
     */
    public static boolean isTransient(int modifiers) {
        return (modifiers & TRANSIENT) != 0;
    }

    /**
     * Checks if is volatile.
     *
     * @param modifiers the modifiers
     * @return true, if is volatile
     */
    public static boolean isVolatile(int modifiers) {
        return (modifiers & VOLATILE) != 0;
    }

    /**
     * Removes the modifier.
     *
     * @param modifiers the modifiers
     * @param mod the mod
     * @return the int
     */
    public static int removeModifier(int modifiers, int mod) {
        return modifiers & ~mod;
    }

    /**
     * Instantiates a new modifier set.
     */
    private ModifierSet() {
    }
}