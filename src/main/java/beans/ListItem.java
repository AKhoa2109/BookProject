package beans;
import java.io.Serializable;
public class ListItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private BookBean product;
	private int quantity;
	public ListItem() {
		
	}
	
	
	public ListItem(BookBean product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}


	public BookBean getProduct() {
		return product;
	}
	public void setProduct(BookBean product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
