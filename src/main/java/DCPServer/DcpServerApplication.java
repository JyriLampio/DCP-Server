package DCPServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import DCPServer.domain.Customer;
import DCPServer.domain.CustomerRepo;
import DCPServer.domain.Event;
import DCPServer.domain.EventRepo;
import DCPServer.domain.Video;
import DCPServer.domain.VideoRepo;



@SpringBootApplication
public class DcpServerApplication {
	private static final Logger log = LoggerFactory.getLogger(DcpServerApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DcpServerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(VideoRepo videorepository, CustomerRepo customerRepository, EventRepo eventRepository) {
		return (args) -> {
			log.info("test");
			
			customerRepository.save(new Customer("Jack the Example", "Address 2222", 00100, "Helsinki", "Finland", "+3580400123456"));
			
			eventRepository.save(new Event("Expo event example", "22.12.2022", "Example address 22", 00100, "Helsinki", "Finland", "+358400123456", customerRepository.findByName("Jack the Example")));
			
			videorepository.save(new Video("Product video", "44444444444444444", "https://example.com", "French", customerRepository.findByName("Jack the Example"), eventRepository.findByName("Expo event example")));
			
		};
	}

}
