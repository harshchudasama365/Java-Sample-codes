package net.javaguides.springboot.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.Vote;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.repository.VoteRepository;
import net.javaguides.springboot.web.dto.VoteSelectedDto;

@Controller
public class MainController {
	
	@Autowired
	VoteRepository voteRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home(HttpSession httpSession, Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth.getName().equals("admin@gmail.com")) {
			List<Vote> voteList = voteRepo.findAll();
			model.addAttribute(voteList);
			return "adminHome";
		}
		
		User user = userRepo.findByEmail(auth.getName());
		
		if (!user.getVoteStatus()) {
			List<Vote> voteList = voteRepo.findAll();
			httpSession.setAttribute("voteList", voteList);
			model.addAttribute("voteSelectedDto", new VoteSelectedDto());
//			model.addAttribute("voteSelectedDto", new VoteSelectedDto());
			return "index";
		}
		else {
			return "thankyou";
		}
	
		
		
	}
	
	
}
