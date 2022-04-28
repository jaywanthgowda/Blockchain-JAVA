package Coin.Blockchain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Coin.Blockchain.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}