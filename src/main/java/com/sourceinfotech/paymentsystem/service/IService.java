/**
 * 
 */
package com.sourceinfotech.paymentsystem.service;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.sourceinfotech.paymentsystem.entity.Candidate;
import com.sourceinfotech.paymentsystem.entity.Employee;
import com.sourceinfotech.paymentsystem.entity.SubVendor;
import com.sourceinfotech.paymentsystem.entity.Transactions;

/**
 * @author Ketan
 *
 */

public interface IService {
	public List<Employee> getEmployeeByRole(String role);
	List<Employee> getEmployees();
	public Employee storeEmployee(@RequestBody Employee employee);
	List<Candidate> getCandidates();
	public Candidate storeCandidate(@RequestBody Candidate candidate);
	public Candidate updateCandidate(@RequestBody Candidate candidate);	
	List<SubVendor> getSubVendors();
	public SubVendor updateSubVendor(@RequestBody SubVendor subVendor);
	public List<Transactions> getTransactions(int candidateid);
	public int addtransactionsbyid(Transactions transactions, int id);
	public List<Transactions> getRecentTransactions(int candidateid);
	public Transactions updatetransactions(Map<String, Object> test, int id, Transactions transactions);
	public List<Transactions> paidtab(int id);
}