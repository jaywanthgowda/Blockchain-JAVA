package Coin.Blockchain.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Coin.Blockchain.model.Transaction;
import Coin.Blockchain.service.TransService;
import Coin.Blockchain.service.UserService;

@Controller
@SpringBootApplication
public class MainController {
	@Autowired
	private TransService transService;
	@Autowired
	private UserService userservice;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
    
    @GetMapping("/newtransaction")
    public String transaction(Model model) {
        // create model attribute to bind form data
    	Transaction transaction = new Transaction();
        model.addAttribute("trans", transaction);
        return "transaction";
    }

    @PostMapping("/savepost")
    public String savePost(@ModelAttribute("trans") Transaction transaction) {
        // save employee to database
        transService.savePost(transaction);
        return "redirect:/";
    }
    
    @GetMapping("/history")
    public String transhistory(Model model) {
    	model.addAttribute("listPosts", transService.getAllPosts());
        return "transhistory";
    }
}