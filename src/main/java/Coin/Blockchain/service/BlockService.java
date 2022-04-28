package Coin.Blockchain.service;

public interface BlockService {
	void Block(String data,String previousHash);
	String applySha256(String input);
	String calculateHash();
	void mineBlock(int difficulty);
	
	
}
