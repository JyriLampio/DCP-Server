package DCPServer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import DCPServer.domain.CustomerRepo;
import DCPServer.domain.EventRepo;
import DCPServer.domain.VideoRepo;

@Controller
public class VideoController {
	
	@Autowired
	private VideoRepo videoRepo;
	@Autowired
	private EventRepo eventRepo;
	@Autowired
	private CustomerRepo customerRepo;

	
	// Show a page with all movies
	@GetMapping("/")
	public String videoList(Model model) {
		String subject = "All videos";
		model.addAttribute("subject", subject);
		model.addAttribute("videos", videoRepo.findAll());
		return "videoList";
	}
}
