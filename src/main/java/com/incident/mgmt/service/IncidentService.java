package com.incident.mgmt.service;

import java.util.List;

import com.incident.mgmt.entity.Ticket;

public interface IncidentService {

	public Object addTicket(Ticket ticket);

	public Object updateTicket(Ticket ticket);

	public List<Ticket> getTicketPage(int limit, int skip, Long userId, Long merchantId);

}
