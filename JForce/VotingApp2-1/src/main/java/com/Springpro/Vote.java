package com.Springpro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Vote")
public class Vote {
	
	@Id
	String candidate;
	int voteCount;
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	
	

}
