package ua.comp.crud;


import java.util.Collection;

import ua.core.exceptions.ItemNotFound;


public interface Crud <Item extends WithId>{

	public boolean		contains (long id);
	public boolean		contains (Item item);
	public Item			create (Item item);
	public void			delete (long id) throws ItemNotFound;
	public void			delete (Item item) throws ItemNotFound;
	public Item			retrieve (long id) throws ItemNotFound;
	public Collection<Item>	retrieveAll();
	public void			update (Item item) throws ItemNotFound;
}
