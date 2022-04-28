package Coin.Blockchain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Coin.Blockchain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
 User findByEmail(String email);
}