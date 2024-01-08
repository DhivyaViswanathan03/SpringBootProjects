package in.ineuron.BO;

public class ProductBO {
	
	private Integer id;
	private String pname;
	private Integer price;
	private Integer qty;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "ProductBO [id=" + id + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
