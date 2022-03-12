package beans;

public class AddressBean {
	private String area, city;
	private int pincode;
	public AddressBean() {
		System.out.println("constructrorrerrewe");
	}
	@Override
	public String toString() {
		return "AddressBean [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
