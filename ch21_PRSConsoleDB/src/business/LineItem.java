package business;

public class LineItem {
	private int id;
	private String requestId;
	private String productId;
	private String quantity;
	public LineItem() {
		super();
	}
	public LineItem(int id, String requestid, String productid, String quantity) {
		super();
		this.id = id;
		this.requestId = requestid;
		this.productId = productid;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRequestid() {
		return requestId;
	}
	public void setRequestid(String requestid) {
		this.requestId = requestid;
	}
	public String getProductid() {
		return productId;
	}
	public void setProductid(String productid) {
		this.productId = productid;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", requestid=" + requestId + ", productid=" + productId + ", quantity=" + quantity
				+ "]";
	}
	
	
}
