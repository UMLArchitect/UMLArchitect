package ihm.utils;

/**
 * Classe permettant de sauvegarder des éléments en associant à chaque élément une clé unique.
 * @author Benoit BRIATTE
 * @version 1.0
 * @date Janvier 2011
 * @param <ItemType> Le type des Objets contenus dans le dictionnaire, mettre Object pour n'importe quoi.
 * @param <KeyType> Le type des clés contenues dans le dictionnaire, mettre Object pour n'importe quoi.
 */
public class Dictionary<ItemType, KeyType> implements Cloneable, Listable<ItemType>
{
    /**
     * Liste chainée contenant tous les éléments du dictionnaire.
     */
    private DictionaryItem<ItemType, KeyType> items;
    private int size = 0;

    public Dictionary() {}

    public Dictionary(ItemType value, KeyType key)
    {
        this.items = new DictionaryItem<ItemType, KeyType>(value, key);
        this.size++;
    }

    public Dictionary(Array<ItemType> values, Array<KeyType> keys)
    {
        int count = values.count();
        if(count == keys.count())
        {
            if(count > 0)
            {
                ItemType value = values.objectAtIndex(0);
                KeyType key = keys.objectAtIndex(0);
                DictionaryItem<ItemType, KeyType> current = null;
                DictionaryItem<ItemType, KeyType> previous = null;
                this.items = new DictionaryItem<ItemType, KeyType>(value, key);
                this.size = 1;
                for(int i=1; i<count; i++)
                {
                    current = this.items;
                    previous = current;
                    value = values.objectAtIndex(i);
                    key = keys.objectAtIndex(i);
                    boolean find = false;
                    while(current != null)
                    {
                        if(current.getKey().equals(key))
                        {
                            current.setValue(value);
                            find = true;
                            break;
                        }
                        previous = current;
                        current = current.getNext();
                    }
                    if(!find)
                    {
                        previous.setNext(new DictionaryItem<ItemType, KeyType>(value, key));
                        this.size++;
                    }
                }
            }
        }
    }

    public int count()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return (this.size==0);
    }

    public boolean containsKey(KeyType key)
    {
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            if(current.getKey().equals(key))
                return true;
            current=current.getNext();
        }
        return false;
    }

    public boolean containsObject(ItemType value)
    {
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            if(current.getValue().equals(value))
                return true;
            current=current.getNext();
        }
        return false;
    }

    public boolean containsObjectForKey(ItemType value, KeyType key)
    {
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            if( (current.getValue().equals(value)) && (current.getKey().equals(key)) )
                return true;
            current=current.getNext();
        }
        return false;
    }

    public ItemType objectForKey(KeyType key)
    {
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            if(current.getKey().equals(key))
            {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public Array<KeyType> allKeys()
    {
        Array<KeyType> keys = new Array<KeyType>(this.size);
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            keys.addObject(current.getKey());
            current = current.getNext();
        }
        return keys;
    }

    public Array<KeyType> allKeysForObject(ItemType value)
    {
        Array<KeyType> keys = new Array<KeyType>();
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            if(current.getValue().equals(value))
                keys.addObject(current.getKey());
            current = current.getNext();
        }
        return keys;
    }

    public Array<ItemType> allValues()
    {
        Array<ItemType> values = new Array<ItemType>(this.size);
        DictionaryItem<ItemType, KeyType> current = this.items;
        while(current != null)
        {
            values.addObject(current.getValue());
            current = current.getNext();
        }
        return values;
    }

    public void setDictionary(Dictionary<ItemType, KeyType> dico)
    {
        if(dico != null)
        {
            DictionaryItem<ItemType, KeyType> current = dico.items;
            while(current != null)
            {
                this.setObjectForKey(current.getValue(), current.getKey());
                current=current.getNext();
            }
        }
    }

     public void setObjectForKey(ItemType value, KeyType key)
    {
        if(this.items == null)
        {
            this.items = new DictionaryItem<ItemType, KeyType>(value, key);
            this.size++;
        }
        else
        {
            DictionaryItem<ItemType, KeyType> current = this.items;
            DictionaryItem<ItemType, KeyType> previous = current;
            boolean find = false;
            while(current != null)
            {
                if(current.getKey().equals(key))
                {
                    current.setValue(value);
                    find = true;
                    break;
                }
                previous = current;
                current = current.getNext();
            }
            if(!find)
            {
                previous.setNext(new DictionaryItem<ItemType, KeyType>(value, key));
                this.size++;
            }
        }
    }

     public void setObjectsForKeys(Array<ItemType> values, Array<KeyType> keys)
    {
        int count = values.count();
        if(count == keys.count())
        {
            for(int i=0; i<count; i++)
                this.setObjectForKey(values.objectAtIndex(i), keys.objectAtIndex(i));
        }
    }

    public void removeObjectForKey(KeyType key)
    {
        if(this.items != null)
        {
            if(this.items.getKey().equals(key))
            {
                DictionaryItem<ItemType, KeyType> tmp = this.items;
                this.items = tmp.getNext();
                tmp = null;
                this.size--;
            }
            else
            {
                DictionaryItem<ItemType, KeyType> previous = this.items;
                DictionaryItem<ItemType, KeyType> current = this.items.getNext();
                while(current != null)
                {
                    if(current.getKey().equals(key))
                    {
                        previous.setNext(current.getNext());
                        current = null;
                        current = previous;
                        this.size--;
                        break;
                    }
                    previous = current;
                    current = current.getNext();
                }
            }
        }
    }

    public void removeObjectForKeys(KeyType[] keys)
    {
        for(int i=0; i<keys.length; i++)
            this.removeObjectForKey(keys[i]);
    }

    public void removeAllObjects()
    {
        while(this.items != null)
        {
            DictionaryItem<ItemType, KeyType> previous = this.items;
            this.items = this.items.getNext();
            previous.setKey(null);
            previous.setValue(null);
            previous = null;
            this.size--;
        }
    }

    protected DictionaryItem<ItemType, KeyType> getItemsRef()
    {
        return this.items;
    }

    @Override
    public String toString()
    {
        if(this.items==null)
            return "Empty Dictionary.";
        else
        {
            StringBuilder sb = new StringBuilder();
            DictionaryItem<ItemType, KeyType> current = this.items;
            sb.append("Dictionary {\n");
            while(current != null)
            {
                sb.append(current).append("\n");
                current = current.getNext();
            }
            sb.append("}");
            return sb.toString();
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Dictionary)
        {
            Dictionary dico = (Dictionary) o;
            if(this.size == dico.size)
            {
                DictionaryItem<ItemType, KeyType> current = dico.items;
                while(current != null)
                {
                    if(!this.containsObjectForKey(current.getValue(),current.getKey()))
                        return false;
                    current=current.getNext();
                }
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
            Dictionary<ItemType, KeyType> d = (Dictionary<ItemType, KeyType>) o;
            d.items = (DictionaryItem<ItemType, KeyType>) this.items.clone();
            DictionaryItem<ItemType, KeyType> current = this.items;
            DictionaryItem<ItemType, KeyType> currentCopy = d.items;
            while(current.next != null)
            {
                currentCopy.next = (DictionaryItem<ItemType, KeyType>) current.next.clone();
                current = current.next;
                currentCopy = currentCopy.next;
            }
            return d;
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }
    
    protected class DictionaryItem<ItemType, KeyType> implements Cloneable
    {
        private ItemType value;
        private KeyType key;
        private DictionaryItem<ItemType, KeyType> next;

        protected DictionaryItem() {
            this(null, null);
        }

        protected DictionaryItem(ItemType value, KeyType key)
        {
            this.setKey(key);
            this.setValue(value);
            this.setNext(null);
        }

        protected ItemType getValue()
        {
            return this.value;
        }

        protected DictionaryItem<ItemType, KeyType> getNext()
        {
            return this.next;
        }

        protected KeyType getKey()
        {
            return this.key;
        }

        protected final void setValue(ItemType value)
        {
            this.value = value;
        }

        protected final void setKey(KeyType key)
        {
            this.key = key;
        }

        protected final void setNext(DictionaryItem<ItemType, KeyType> next)
        {
            this.next = next;
        }

        @Override
        public String toString()
        {
            return ("\""+this.key+"\" => "+this.value);
        }

        @Override
        public Object clone()
        {
            try
            {
                return super.clone();
            }
            catch(CloneNotSupportedException e)
            {
                return null;
            }
        }
    }
}