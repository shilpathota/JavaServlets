package com.servletmavenapplication.dao;

import com.servletmavenapplication.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		Alien alien = new Alien();
		alien.setAid(101);
		alien.setAname("name");
		alien.setTech("Java");
		
		return alien;
	}

}
