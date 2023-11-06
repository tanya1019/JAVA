package july25.maps;

import java.util.Date;

public class Products {

	Integer productId;
	String productname;
	Float productprice;
	Date manufacturing_Date;
	Date expiryDate;
	
	
	
	public Products(Integer productId, String productname, Float productprice) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.productprice = productprice;
	}

	// getters and setters
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Float getProductprice() {
		return productprice;
	}

	public void setProductprice(Float productprice) {
		this.productprice = productprice;
	}

	public Date getManufacturing_Date() {
		return manufacturing_Date;
	}

	public void setManufacturing_Date(Date manufacturing_Date) {
		this.manufacturing_Date = manufacturing_Date;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	// toString
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productname=" + productname + ", productprice=" + productprice
				+ ", manufacturing_Date=" + manufacturing_Date + ", expiryDate=" + expiryDate + "]";
	}
	
}

