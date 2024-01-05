package com.irctc.service;

import java.util.Collection;

import com.irctc.entity.Passanger;
import com.irctc.entity.Tickect;

public interface TickectService {

	         public Tickect bookTicket(Passanger p);
	         public Collection<Tickect> getAllTickects();
}
