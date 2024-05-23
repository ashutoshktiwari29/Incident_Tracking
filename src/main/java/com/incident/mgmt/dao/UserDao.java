package com.incident.mgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.incident.mgmt.entity.User;

public interface UserDao extends CrudRepository<User, Long>   {
	@Query("from User u where u.mobile=:mobile OR u.email=:email")
	List<User> findUserByEmailORMobile(@Param("mobile") String mobile, @Param("email") String email);

	@Query("from User u where (u.mobile=:mobile OR u.email=:email) AND u.id!=:id")
	List<User> findUserByEmailORMobileWithUserId(@Param("mobile") String mobile, @Param("email") String email, @Param("id") Long id);
	
	@Query("from User u where u.mobile=:mobile AND u.password=:password")
	Optional<User> loginWithMobile(String mobile, String password);
	
	@Query("from User u where u.email=:email AND u.password=:password")
	Optional<User> loginWithEmail(String email, String password);


//	@Modifying
//	@Query("update User u set u.mobile = :mobile where u.lastLoginDate < :date")
//	List<User> updateUserRecord(@Param("mobile") String mobile, @Param("email") String email);
//
//	@Modifying
//	@Query("update User u set u.active = false where u.lastLoginDate < :date")
//	void deactivateUsersNotLoggedInSince(@Param("date") LocalDate date);	
}
