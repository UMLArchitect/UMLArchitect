package ihm.utils;

/**
 * Interface pour collections.
 * @author Benoit BRIATTE
 * @version 1.0
 * @date Janvier 2011
 */
public interface Listable<ItemType>
{
	/**
	 * Count a listable.
	 * @return the number of element in the list.
	 */
    public abstract int count();
    
    /**
     * Method use to check if a list is empty. 
     * @return true if the list is empty, otherwise false.
     */
    public abstract boolean isEmpty();
    
    /**
     * Method use to check if an item is in a list.
     * @param value the item.
     * @return true if the item is in the list, otherwise false.
     */
    public abstract boolean containsObject(ItemType value);
}
