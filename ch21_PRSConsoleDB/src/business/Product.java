package business;

public class Product {
	private int id;
	private String vendorId;
	private int partNumber;
	private String pName;
	private double price;
	private int unit;
	private String photoPath;
	public Product() {
		super();
	}
	public Product(int id, String vendorid, int partnumber, String pname, double price, int unit, String photopath) {
		super();
		this.id = id;
		this.vendorId = vendorid;
		this.partNumber = partnumber;
		this.pName = pname;
		this.price = price;
		this.unit = unit;
		this.photoPath = photopath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVendorid() {
		return vendorId;
	}
	public void setVendorid(String vendorid) {
		this.vendorId = vendorid;
	}
	public int getPartnumber() {
		return partNumber;
	}
	public void setPartnumber(int partnumber) {
		this.partNumber = partnumber;
	}
	public String getPname() {
		return pName;
	}
	public void setPname(String pname) {
		this.pName = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getPhotopath() {
		return photoPath;
	}
	public void setPhotopath(String photopath) {
		this.photoPath = photopath;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorid=" + vendorId + ", partnumber=" + partNumber + ", pname=" + pName
				+ ", price=" + price + ", unit=" + unit + ", photopath=" + photoPath + "]";
	}
	
}
