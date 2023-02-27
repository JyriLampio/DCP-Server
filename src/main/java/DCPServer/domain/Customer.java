package DCPServer.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
	private int postalCode;
	private String city;
	private String country;
	private String phone;
	
	@jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.PERSIST, mappedBy = "customer")
	private List<Video> videos;

	@jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.PERSIST, mappedBy = "customer")
	private List<Event> events;
	

	public Customer() {
	};

	public Customer(String name, String address, int postalCode, String city, String country, String phone) {
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
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

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}


//	@jakarta.persistence.PreRemove
//	private void preRemove() {
//		events.forEach(event -> movie.setGenre(null));
//	}

}
