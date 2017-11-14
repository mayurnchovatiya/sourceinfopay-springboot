package com.sourceinfotech.paymentsystem.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.sourceinfotech.paymentsystem.entity.Candidate;
import com.sourceinfotech.paymentsystem.entity.Employee;
import com.sourceinfotech.paymentsystem.entity.SubVendor;

/**
 * @author Ketan
 *
 */
public interface ISubVendorRepository extends Repository<SubVendor, Integer>{

	public List<SubVendor> findAll();	
	public SubVendor save(SubVendor subVendor);	
}