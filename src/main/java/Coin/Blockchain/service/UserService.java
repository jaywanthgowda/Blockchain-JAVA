package Coin.Blockchain.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import Coin.Blockchain.model.User;
import Coin.Blockchain.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
List < User > getuser();
 User save(UserRegistrationDto registrationDto);
}