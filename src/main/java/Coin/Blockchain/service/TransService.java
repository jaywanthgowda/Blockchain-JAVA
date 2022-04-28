package Coin.Blockchain.service;

import java.util.List;

import Coin.Blockchain.model.Transaction;

public interface TransService {
    List < Transaction > getAllPosts();
    void savePost(Transaction transaction);
}