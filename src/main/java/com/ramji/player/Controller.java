package com.ramji.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private Service1 serve;
	
	@PostMapping("addPlayer")
	public Player addPlayer(@RequestBody Player p)
	{
		return serve.addPlayer(p);
	}

}
