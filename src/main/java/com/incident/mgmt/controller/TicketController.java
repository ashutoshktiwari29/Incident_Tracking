package com.incident.mgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incident.mgmt.entity.Ticket;
import com.incident.mgmt.service.IncidentService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private IncidentService incidentService;


	@PostMapping("/add")
	public ResponseEntity<?> addTicket(@RequestBody Ticket ticket) {
		String res=incidentService.addTicket(ticket);
		return new ResponseEntity<>(res, HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateTicket(@RequestBody Ticket ticket) {
		String res=incidentService.updateTicket(ticket);
		return new ResponseEntity<>(res, HttpStatus.OK);

	}

	@GetMapping("/getTicketPage")
	public ResponseEntity<List<Ticket> > getTicketPage(@RequestParam(name ="limit",defaultValue = "20") int limit,
			@RequestParam(name ="skip",defaultValue = "0") int skip,
			@RequestHeader(name ="userId") Long userId,
			@RequestHeader(name ="merchantId") Long merchantId) {
		List<Ticket> tickets=incidentService.getTicketPage(limit,skip,userId,merchantId);
		return ResponseEntity.ok(tickets);

	}

}
