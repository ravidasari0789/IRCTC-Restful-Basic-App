package com.irctc.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.irctc.entity.Passanger;
import com.irctc.entity.Tickect;


@Service
public class TickectServiceImp implements TickectService{
	
	         private Map<Integer, Tickect> db=new HashMap<>();

	@Override
	public Tickect bookTicket(Passanger p) {
		// TODO Auto-generated method stub
		Tickect t=new Tickect();
		
        Random random=new Random();
      int id=  random.nextInt(50)+1;
        
        t.setTickectId(id);
		BeanUtils.copyProperties(p, t);
		
		t.setStatus("Ticket Conformed");
		
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Tickect> getAllTickects() {
		// TODO Auto-generated method stub
		return db.values();
	}

}
