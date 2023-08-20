package com.ramji.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

	@Autowired
	private PlayerRepo repo;
	
	public Player addPlayer(Player p) {
		
		
		return repo.save(p);
		
		
	}

	
	
	
}
