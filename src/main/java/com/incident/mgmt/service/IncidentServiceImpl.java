package com.incident.mgmt.service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incident.mgmt.dao.IncidentDao;
import com.incident.mgmt.dao.MerchantDao;
import com.incident.mgmt.dao.UserDao;
import com.incident.mgmt.entity.Merchant_details;
import com.incident.mgmt.entity.Ticket;
import com.incident.mgmt.entity.User;

@Service
public class IncidentServiceImpl implements IncidentService{

	@Autowired
	private IncidentDao dao;
	
	@Autowired
	private UserDao user;
	
	@Autowired
	private MerchantDao merchant_user;

	@Override
	public Object addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		//Check userId.
		Optional<User> userDeatial=user.findById(ticket.getCreaterUserId());
		if(!userDeatial.isPresent()) {
			return "User not present, invalid user id";
		}
		Optional<Merchant_details> merchent=merchant_user.findById(ticket.getMerchantId());
		if(!merchent.isPresent()) {
			return "Merchant not present, invalid merchent id";
		}
		return dao.save(ticket);
	}

	@Override
	public Object updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		//Check userId.
		Optional<Ticket> dbTicket=dao.findById(ticket.getTicketId());
		if(!dbTicket.isPresent()) {
			return "Ticket id not present, Please provide valid ticket id";
		}
		Optional<User> userDeatial=user.findById(ticket.getCreaterUserId());
		if(!userDeatial.isPresent()) {
			return "User not present, invalid user id";
		}
		Optional<Merchant_details> merchent=merchant_user.findById(ticket.getMerchantId());
		if(!merchent.isPresent()) {
			return "Merchant not present, invalid merchent id";
		}
		Ticket oldticket=dbTicket.get();
		oldticket.setDescription(ticket.getDescription());
		oldticket.setTitle(ticket.getTitle());
		oldticket.setStatus(ticket.getStatus());

		return dao.save(oldticket);
	}

	@Override
	public List<Ticket> getTicketPage(int limit, int skip, Long userId, Long merchantId) {
		// TODO Auto-generated method stub
		if(merchantId==null ) {
			return dao.findListTicketsForUser(userId, limit, skip);
		}
		return dao.findListTickets(merchantId, userId, limit, skip);
		
	}


	


}
