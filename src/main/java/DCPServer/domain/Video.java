package DCPServer.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Video {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// @Column annotation can be used to specify mapped column. Example:
	// @Column(name=”title_name”)
	private String title;
	private String videoHash;
    private String url;
	private String language;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "eventid")
	private Event event;

	public Video() {
	};

	public Video(String title, String videoHash, String url, String language, Customer customer, Event event) {
		this.title = title;
		this.videoHash = videoHash;
		this.url = url;
		this.language = language;
		this.customer = customer;
		this.event = event;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideoHash() {
		return videoHash;
	}

	public void setVideoHash(String videoHash) {
		this.videoHash = videoHash;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
}

