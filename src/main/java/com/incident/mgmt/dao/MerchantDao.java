package com.incident.mgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.incident.mgmt.entity.Merchant_details;

public interface MerchantDao extends CrudRepository<Merchant_details,Long > {
	
	@Query("from Merchant_details m  where m.merchant_name=:merchant_name")
	List<Merchant_details> findMerchantrByName(@Param("merchant_name") String merchant_name);
//
	@Query("from Merchant_details m where m.merchant_name=:merchant_name  AND m.merchant_id!=:merchant_id")
	List<Merchant_details> findMerchantrByNameWithUserId(@Param("merchant_name") String merchant_name, @Param("merchant_id") Long merchant_id);
	
	@Transactional
	@Modifying
	@Query("update Merchant_details u set u.merchant_name = :merchant_name where u.merchant_id=:merchant_id")
	void upadteMerchantrName(@Param("merchant_name") String merchant_name, @Param("merchant_id") Long merchant_id);
	
//	@Query("from Merchant_details m where m.user_id=:user_id")
//	List<Merchant_details> findMerchantrById(@Param("user_id") long user_id);
	

}
