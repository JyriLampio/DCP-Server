package DCPServer.domain;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String date;
	private String address;
	private int postalCode;
	private String city;
	private String country;
	private String phone;
	
	@jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.PERSIST, mappedBy = "event")
	private List<Video> videos;

	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customer;
	
	public Event() {
	};

	
	public Event(String name, String date, String address, int postalCode, String city, String country, String phone, Customer customer) {
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.customer = customer;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

//	public List<Customer> getCustomers() {
//		return customers;
//	}
//
//	public void setCustomers(List<Customer> customers) {
//		this.customers = customers;
//	}
	
	

}
