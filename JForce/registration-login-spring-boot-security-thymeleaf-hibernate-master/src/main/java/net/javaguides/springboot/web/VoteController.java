package net.javaguides.springboot.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Vote;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.repository.VoteRepository;
import net.javaguides.springboot.web.dto.UserRegistrationDto;
import net.javaguides.springboot.web.dto.VoteSelectedDto;

@RestController
@RequestMapping("/voteSuccess")
public class VoteController {
	
	@Autowired
	VoteRepository voteRepo;
	
	@Autowired
	UserRepository userRepo;
	
//	@Autowired
//	VoteSelected vs;
	
//	@ModelAttribute("VoteSelected")
//    public VoteSelectedDto VoteSelected() {
//        return new VoteSelectedDto();
//    }
//	
//	@GetMapping()
//	public String voteSuccess() {
//		return "index";
//	}
//	@ModelAttribute("voteSelected")
	@PostMapping()
	public String voteSuccess( VoteSelectedDto vs) {
//		System.out.println(vs.getOptionSelected());
//		Optional<Vote> vote = voteRepo.findById(vs.getOptionSelected());
//		if(vote.isPresent()) {
//			System.out.println(vote.get());
//		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		voteRepo.updateVoteCount(vs.getOptionSelected());
		userRepo.updateVoteCount(auth.getName());
		Object obj = auth.getPrincipal();
		System.out.println(obj);
		
		
		return "done";
	}
}
