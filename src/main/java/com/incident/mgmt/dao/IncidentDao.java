package com.incident.mgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.incident.mgmt.entity.Ticket;

public interface IncidentDao extends CrudRepository<Ticket,Long > {
	

	@Query(value="select * from Ticket t where (t.merchant_id=?1 OR t.creater_user_id=?2) LIMIT ?3 OFFSET ?4", nativeQuery = true)
	List<Ticket> findListTickets(@Param("merchantId") Long merchantId,
			@Param("createrUserId") Long createrUserId,
			@Param("LIMIT") int LIMIT,
			@Param("OFFSET") int OFFSET);
	
	@Query(value="select * from Ticket t where t.creater_user_id=?1 LIMIT ?2 OFFSET ?3", nativeQuery = true)
	List<Ticket> findListTicketsForUser(@Param("createrUserId") Long createrUserId,
			@Param("LIMIT") int LIMIT,
			@Param("OFFSET") int OFFSET);
	


}
