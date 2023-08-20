package com.ramji.player;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Player")
public class Player {

	@Id
	private Integer pid;
	
	private String name;
	
	private String playerRole;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerRole() {
		return playerRole;
	}

	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
	
	
	
	
	
}
