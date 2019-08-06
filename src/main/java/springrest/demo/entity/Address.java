package springrest.demo.entity;

public class Address {

	private String address;
	private String city;
	private int zipcode;
	private String country;

	public Address() {
	}

	public Address(String address, String city, int zipcode, String country) {
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", zipcode=" + zipcode + ", country=" + country + "]";
	}

}
