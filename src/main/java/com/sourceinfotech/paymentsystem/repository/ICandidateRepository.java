package com.sourceinfotech.paymentsystem.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.sourceinfotech.paymentsystem.entity.Candidate;

/**
 * @author Ketan
 *
 */
public interface ICandidateRepository extends Repository<Candidate, Integer>{
	public Candidate save(Candidate candidate);
	public List<Candidate> findAll();
	boolean existsByCandidateName(String candidateName);
	public Candidate findByCandidateId(int id);
	
}