package com.irctc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.entity.Passanger;
import com.irctc.entity.Tickect;
import com.irctc.service.TickectService;

@RestController
public class TickectController {

	@Autowired
	private TickectService service;

	@PostMapping("/ticket")
	public ResponseEntity<Tickect> bookTickect(@RequestBody Passanger p) {

		Tickect t = service.bookTicket(p);

		return new ResponseEntity<Tickect>(t, HttpStatus.CREATED);
	}

	@GetMapping("/tockets")
	public ResponseEntity<Collection<Tickect>> getTicketsAll() {

		Collection<Tickect> t = service.getAllTickects();

		return new ResponseEntity<Collection<Tickect>>(t, HttpStatus.OK);

	}

}
