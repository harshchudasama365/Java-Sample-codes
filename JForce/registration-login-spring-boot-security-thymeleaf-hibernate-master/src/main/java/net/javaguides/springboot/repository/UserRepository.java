package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.Vote;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("update User u set u.voteStatus = 1 where u.email = ?1")
	void updateVoteCount(String email);
	
	


	
}
