package com.sourceinfotech.paymentsystem.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sourceinfotech.paymentsystem.entity.Transactions;


public interface ITransactionsRepository extends CrudRepository<Transactions, Integer> {
	public List<Transactions> findAllByCandidateCandidateId(int id);
	public Transactions findByTransactionId(int id);
	public Date findMaxEnddateByCandidateCandidateId(int candidateid);
	public List<Transactions> findTop1ByCandidateCandidateIdOrderByStartdateDesc(int id);
	public List<Transactions> findAllBySubvendorpaidstatusAndCandidateCandidateId(String paid,int id);
	
}
