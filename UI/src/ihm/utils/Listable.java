package ihm.utils;

/**
 * Interface pour collections.
 * @author Benoit BRIATTE
 * @version 1.0
 * @date Janvier 2011
 */
public interface Listable<ItemType>
{
    public abstract int count();
    public abstract boolean isEmpty();
    public abstract boolean containsObject(ItemType value);
}
