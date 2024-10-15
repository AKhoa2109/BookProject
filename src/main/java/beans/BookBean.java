package beans;
import java.io.Serializable;
public class BookBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String code;
	private String description;
	private double price;
	
	public BookBean() {
		super();
		this.code ="";
		this.description ="";
		this.price=0;
	}
	
	public BookBean(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public BookBean getProductInfo(String code)
	{
		
		if(code.equals("1")) {
			this.setCode(code);
			this.setDescription("Harry Potter");
			this.setPrice(450000);
		}
		if(code.equals("2")) {
			this.setCode(code);
			this.setDescription("Nhà giả kim");
			this.setPrice(95000);
		}
		if(code.equals("3")) {
			this.setCode(code);
			this.setDescription("Không Phải Sói Nhưng Cũng Đừng Là Cừu");
			this.setPrice(130000);
		}
		if(code.equals("4")) {
			this.setCode(code);
			this.setDescription("Nghìn lẻ một đêm");
			this.setPrice(230000);
		}
		return this;
	}
	

}
