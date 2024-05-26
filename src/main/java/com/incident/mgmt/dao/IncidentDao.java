package com.incident.mgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.incident.mgmt.entity.Ticket;

public interface IncidentDao extends CrudRepository<Ticket,Long > {
	

	@Query(value="select * from Ticket t where (t.merchantId=?1 OR t.createrUserId=?2) LIMIT ?3 OFFSET ?4", nativeQuery = true)
	List<Ticket> findListTickets(@Param("merchantId") Long merchantId,
			@Param("createrUserId") Long createrUserId,
			@Param("LIMIT") int LIMIT,
			@Param("OFFSET") int OFFSET);
	


}
