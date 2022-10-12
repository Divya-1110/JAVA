package com.nissan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.dto.UserLocationPost;
import com.nissan.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {
	
	//Custom JPQL query which is retrieving
	//userid,username.location name,
	
	@Query("SELECT new com.nissan.dto.UserLocationPost "
	+ "(u.userId,u.userName,l.locationName,p.postDetails) "
	+ "FROM User u INNER JOIN u.location l "
	+ "INNER JOIN u.posts p ORDER BY u.userId")
	
	List<UserLocationPost> getAllUsersLocPosts();

}
