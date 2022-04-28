package Coin.Blockchain.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import Coin.Blockchain.model.Transaction;
import Coin.Blockchain.repository.TransactionRepository;
import java.util.Date;
@Service
public class TransServiceImpl implements TransService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public List < Transaction > getAllPosts() {
        return transactionRepository.findAll();
    }

    @Override
    public void savePost(Transaction transaction) {
    	transaction.message= passwordEncoder.encode(transaction.getMessage());
    	transaction.timestamp = new Date().getTime();
        this.transactionRepository.save(transaction);
    }

}