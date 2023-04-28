package CaseStudy;

public class Product {

	final int productID;
	private String productName;
	private float productPrice;
	private String productCat;
	
	Product(int pID, String pName, float pPrice, String pCat) {
		
		this.productID = pID;
		this.productName = pName;
		this.productPrice = pPrice;
		this.productCat = pCat;
	}
	
	void update(String pName, float pPrice, String pCat) {
		this.productName = pName;
		this.productPrice = pPrice;
		this.productCat = pCat;
		
		StringBuilder result = new StringBuilder("Product [productID=");
		result.append(productID);
		result.append(", productName="); result.append(productPrice);
		result.append(", ProductCategory="); result.append(productCat);
		result.append("]");
		
		System.out.println("Updated: " + result);
		
	}
	
	String GetProduct() {
		StringBuilder result = new StringBuilder("Product [productID=");
		result.append(productID);
		result.append(", productName="); result.append(productPrice);
		result.append(", ProductCategory="); result.append(productCat);
		result.append("]");
		
		return result.toString();
	}
	
	String GetProduct(int startRange, int endRange) {
		StringBuilder result = new StringBuilder();
		if (productPrice > startRange && productPrice <= endRange) {
			result.append("Product [productID=");
			result.append(productID);
			result.append(", productName="); result.append(productName);
			result.append(", ProductPrice="); result.append(productPrice);
			result.append(", ProductCategory="); result.append(productCat);
			result.append("]");
		}
		
		return result.toString();
	}
	
	String GetProduct(String Cat) {
		StringBuilder result = new StringBuilder();
		if (productCat.equals(Cat)) {
			result.append("Product [productID=");
			result.append(productID);
			result.append(", productName="); result.append(productName);
			result.append(", ProductPrice="); result.append(productPrice);
			result.append(", ProductCategory="); result.append(productCat);
			result.append("]");
		}
		
		return result.toString();
	}
	
	String GetProduct_name(String pName) {
		StringBuilder result = new StringBuilder();
		if (this.productName.equals(pName)) {
			result.append("Product [productID=");
			result.append(productID);
			result.append(", productName="); result.append(productName);
			result.append(", ProductPrice="); result.append(productPrice);
			result.append(", ProductCategory="); result.append(productCat);
			result.append("]");
		}
		
		return result.toString();
	}
}
