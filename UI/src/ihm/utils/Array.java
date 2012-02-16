package ihm.utils;

import java.util.Arrays;

/**
 * Classe représentant une Array dynamique.
 * @author Benoit BRIATTE
 * @version 1.0
 * @date Janvier 2011
 * @param <ItemType> Le type des Objets contenus dans l'Array, mettre Object pour n'importe quoi.
 */
public class Array<ItemType> implements Cloneable, Listable<ItemType>
{
    /**
     * Nombre d'allocation d'espace supplémentaire. A chaque fois que l'Array sera pleine,
     * la capacité de stockage de celle ci sera augmentée par la valeur de cette variable.
     */
    public static final int kDeltaCapacity = 10;

    /**
     * Capacité actuelle de l'Array.
     * Nombre d'élément qu'elle peut stocker au maximum.
     */
    private int capacity = 0;

    /**
     * Nombre d'élément de l'Array.
     */
    private int size = 0;

    /**
     * Tableau représentant tout les éléments de l'Array.
     */
    private Object[] elements;


    /**
     * Constructeur d'une Array vide.
     * Initialisée avec une capacité iniatiale étant de la valeur de la variable kDeltaCapacity.
     */
    public Array()
    {
        this(Array.kDeltaCapacity);
    }

    /**
     * Constructeur d'une Array vide.
     * @param initialCapacity Capacité initial de stockage souhaitée de l'Array.
     */
    public Array(int initialCapacity)
    {
        this.capacity = initialCapacity;
        this.elements = new Object[this.capacity];
    }

    /**
     * Constructeur d'une Array avec ajout d'un élément.
     * Initialisée avec une capacité iniatiale étant de la valeur de la variable kDeltaCapacity.
     * @param o L'élément que l'on souhaite ajouter.
     */
    public Array(ItemType o)
    {
        this(Array.kDeltaCapacity);
        this.elements[0] = o;
        this.size++;
    }

    /**
     * Constructeur d'une Array avec ajout d'un tableau d'élément.
     * Initialisée avec une capacité iniatiale étant la taille du tableau.
     * @param t Le tableau d'élément que l'on souhaite mettre dans l'Array.
     */
    public Array(ItemType[] t)
    {
        this(t.length);
        System.arraycopy(t, 0, this.elements, 0, t.length);
        this.size = t.length;
    }

    /**
     * Méthode permettant d'ajouter en fin de l'Array un élément.
     * @param o L'élément que l'on souhaite ajouter.
     */
    public void addObject(ItemType o)
    {
        int oldSize = this.size;
        this.size++;
        if(oldSize == this.capacity)
            this.elements = Arrays.copyOf(this.elements, (this.capacity = this.capacity+kDeltaCapacity));
        this.elements[oldSize] = o;
    }

    /**
     * Méthode permettant d'ajouter en fin de l'Array une autre Array.
     * @param arr L'Array que l'on souhaite ajouter a l'Array en cours.
     */
    public void addObjectsFromArray(Array<ItemType> arr)
    {
        if(arr != null)
            for(int i=0; i<arr.size; i++)
                this.addObject((ItemType) arr.elements[i]);
    }

    /**
     * Méthode permettant d'ajouter un élément à un index précis.
     * @throws IndexOutOfBoundsException En cas d'index négatif ou supérieur à la taille de l'Array.
     * @param o L'élément que l'on souhaite ajouter.
     * @param i L'index a laquel on veut mettre l'élément.
     */
    public void insertObjectAtIndex(ItemType o, int i)
    {
        if(i >= 0 && i < this.size)
        {
            int oldSize = this.size;
            this.size++;
            if(oldSize == this.capacity)
                this.elements = Arrays.copyOf(this.elements, (this.capacity = this.capacity+kDeltaCapacity));
            System.arraycopy(this.elements, i, this.elements, i+1, oldSize-i);
            this.elements[i] = o;
        }
        else if(i == this.size)
            this.addObject(o);
        else
	    throw new ArrayIndexOutOfBoundsException("Index: "+i+", Size: "+this.size);
    }

    /**
     * Méthode permettant de supprimer tous les éléments d'une Array.
     */
    public void removeAllObjects()
    {
        for(int i=0; i<this.size;i++)
            this.elements[i] = null;
        this.size = 0;
    }

    /**
     * Méthode permettant de supprimer le dernière élément de l'Array.
     * @throws ArrayIndexOutOfBoundsException En cas d'Array vide.
     */
    public void removeLastObject()
    {
        if(!this.isEmpty())
        {
            this.elements[this.size-1] = null;
            this.size--;
        }
        else
            throw new ArrayIndexOutOfBoundsException("Empty Array, Size: "+this.size);
    }

    /**
     * Méthode permettant de supprimer toutes les occurences de l'élément passé en paramètre.
     * Utilisation de la fonction equals de l'élément.
     * @param o L'élément dont on veut tester l'éxistance.
     */
    public void removeObject(ItemType o)
    {
        int i = 0;
        while(i<this.size)
        {
            if(this.elements[i].equals(o))
                this.removeObjectAtIndex(i);
            else
                i++;
        }
    }

    /**
     * Méthode permettant de supprimer l'élément à l'index passé en paramètre.
     * @throws IndexOutOfBoundsException En cas d'index négatif ou bien d'index supérieur ou égal à la taille de l'Array.
     * @param i L'index à laquel on veut supprimer l'élément.
     */
    public void removeObjectAtIndex(int i)
    {
        if(i >= 0 && i < this.size)
        {
            if(i == this.size-1)
                this.removeLastObject();
            else
            {
                ItemType tmp = (ItemType) this.elements[i];
                System.arraycopy(this.elements, i+1, this.elements, i, --this.size-i);
                tmp = null;
            }
        }
        else
	    throw new ArrayIndexOutOfBoundsException("Index: "+i+", Size: "+this.size);
    }

    /**
     * Méthode permettant d'échanger un élément à un index avec l'élément passé en paramètre cette fonction.
     * @throws IndexOutOfBoundsException En cas d'index négatif ou bien d'index supérieur ou égal à la taille de l'Array.
     * @param i L'index à laquelle on souhaite faire l'échange.
     * @param repl L'élément de substitution.
     */
    public void replaceObjectAtIndexWithObject(int i, ItemType repl)
    {
        if(i >= 0 && i < this.size)
        {
            ItemType tmp = (ItemType) this.elements[i];
            this.elements[i] = repl;
            tmp = null;
        }
        else
	    throw new ArrayIndexOutOfBoundsException("Index: "+i+", Size: "+this.size);
    }

    /**
     * Méthode permettant de récupérer un élément a l'index passé en paramètre.
     * @throws ArrayIndexOutOfBoundsException En cas d'index négatif ou bien d'index supérieur ou égal a la taille de l'Array.
     * @param i L'index de l'élément que l'on souhaite récupérer.
     * @return L'élément de l'Array à l'index.
     */
    public ItemType  objectAtIndex(int i)
    {
        if(i>=0 && i<this.size)
            return (ItemType) this.elements[i];
        else
            throw new ArrayIndexOutOfBoundsException("Index: "+i+", Size: "+this.size);
    }

    /**
     * Méthode permettant de récupérer le premier élément de l'Array.
     * @throws ArrayIndexOutOfBoundsException En cas d'Array vide.
     * @return L'élément de l'Array à l'index 0.
     */
    public ItemType firstObject()
    {
        if(!this.isEmpty())
            return (ItemType) this.elements[0];
        else
            throw new ArrayIndexOutOfBoundsException("Empty Array, Size: "+this.size);
    }

    /**
     * Méthode permettant de récupérer le dernier élément de l'Array.
     * @throws ArrayIndexOutOfBoundsException En cas d'Array vide.
     * @return Le dernier élément de l'Array.
     */
    public ItemType lastObject()
    {
        if(!this.isEmpty())
            return (ItemType) this.elements[this.size-1];
        else
            throw new ArrayIndexOutOfBoundsException("Empty Array, Size: "+this.size);
    }

    /**
     * Méthode permettant de récupérer la taille de l'Array.
     * @return La taille de l'Array.
     */
    public int count()
    {
        return this.size;
    }

    /**
     * Méthode permettant de savoir si une Array est vide.
     * @return True en cas d'Array vide, sinon false.
     */
    public boolean isEmpty()
    {
        return (this.size == 0);
    }

    /**
     * Méthode permettant de récupérer l'index d'un élément passer en paramètre.
     * Utilisation de la fonction equals de cette élément.
     * @param o L'élément dont on veut tester l'éxistance.
     * @return L'index de l'élément ou -1 si inexistant.
     */
    public int indexOfObject(ItemType o)
    {
        for(int i=0; i<this.size;i++)
            if(this.elements[i].equals(o))
                return i;
        return -1;
    }

    public void switchObjectAtIndexWithObjectAtIndex(int index1, int index2)
    {
        if( (index1 >= 0 && index2 >=0) && (index1 < this.size && index2 < this.size))
        {
            if(index1 != index2)
            {
                Object o = this.elements[index1];
                this.elements[index1] = this.elements[index2];
                this.elements[index2] = o;
            }
            else
                throw new IllegalArgumentException("Index1 == Index2");
        }
        else
            throw new ArrayIndexOutOfBoundsException("Index1: "+index1+" Index2: "+index2+", Size: "+this.size);
    }

    /**
     * Méthode permettant de savoir si un élément est compris dans l'Array.
     * Utilisation de la fonction equals de cette élément.
     * @param o L'élément dont on veut tester l'éxistance.
     * @return True si existant, false sinon.
     */
    public boolean containsObject(ItemType value)
    {
        return (this.indexOfObject(value) != -1);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Array {\n");
        for(int i =0; i<this.size; i++)
        {
            sb.append(i);
            sb.append("] ");
            sb.append(this.elements[i]);
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Array)
        {
            Array arr = (Array) o;
            if(this.size == arr.size)
            {
                for(int i=0; i<this.size; i++)
                    if(!this.containsObject((ItemType) arr.elements[i]))
                        return false;
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public Object clone()
    {
        try
        {
            Object o = super.clone();
            Array<ItemType> arr = (Array<ItemType>) o;
            arr.elements = Arrays.copyOf(this.elements, this.capacity);
            return arr;
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
}
