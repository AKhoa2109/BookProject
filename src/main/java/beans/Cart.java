package beans;
import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<ListItem> items;
	public Cart() {
		items = new ArrayList<ListItem>();
	}
	

	public Cart(ArrayList<ListItem> items) {
		super();
		this.items = items;
	}

	public ArrayList<ListItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<ListItem> items) {
		this.items = items;
	}

	public void addItem(ListItem item)
	{
		String code = item.getProduct().getCode();
		for(int i=0;i<items.size();i++)
		{
			ListItem lineItem = items.get(i);
			if(lineItem.getProduct().getCode().equals(code))
			{
				int quantity = lineItem.getQuantity() + item.getQuantity();
				lineItem.setQuantity(quantity);
				return;
			}
		}
		
		items.add(item);
	}
	
	public void removeItem(ListItem item)
	{
		String code = item.getProduct().getCode();
		for(int i=0;i<items.size();i++)
		{
			ListItem lineItem = items.get(i);
			if(lineItem.getProduct().getCode().equals(code))
			{
				items.remove(i);
				return;
			}
		}
	}
	
}
