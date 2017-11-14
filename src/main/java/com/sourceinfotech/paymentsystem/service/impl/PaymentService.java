package com.sourceinfotech.paymentsystem.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transaction;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sourceinfotech.paymentsystem.Conflict;
import com.sourceinfotech.paymentsystem.entity.Candidate;
import com.sourceinfotech.paymentsystem.entity.Employee;
import com.sourceinfotech.paymentsystem.entity.SubVendor;
import com.sourceinfotech.paymentsystem.entity.Transactions;
import com.sourceinfotech.paymentsystem.repository.ICandidateRepository;
import com.sourceinfotech.paymentsystem.repository.IEmployeeRepository;
import com.sourceinfotech.paymentsystem.repository.ISubVendorRepository;
import com.sourceinfotech.paymentsystem.repository.ITransactionsRepository;
import com.sourceinfotech.paymentsystem.service.IService;

/**
 * @author Ketan
 *
 */

@Service
public class PaymentService implements IService{

	private ICandidateRepository candidateRepository;
	private IEmployeeRepository employeeRepository;
	private ISubVendorRepository subVendorRepository;
	private ITransactionsRepository transactionsRepository;
	
	@Autowired
	public PaymentService(ICandidateRepository candidateRepository, IEmployeeRepository employeeRepository,ISubVendorRepository subVendorRepository,ITransactionsRepository transactionsRepository) {
		this.employeeRepository=employeeRepository;
		this.candidateRepository=candidateRepository;
		this.subVendorRepository=subVendorRepository;
		this.transactionsRepository=transactionsRepository;
	}
	
	@Transactional
	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@Transactional
	@Override
	public List<Employee> getEmployeeByRole(String role) {
		return employeeRepository.findByRole(role);
	}
	
	@Transactional	
	@Override
	public Employee storeEmployee(Employee employee) {
		if(employeeRepository.existsByNameAndRole(employee.getName(), employee.getRole()))
			throw new Conflict("Employee with "+employee.getName()+" and "+employee.getRole()+" is already present");
		return employeeRepository.save(employee);
	}
	
	@Transactional
	@Override
	public Candidate storeCandidate(Candidate candidate) {
		if(candidateRepository.existsByCandidateName(candidate.getCandidateName()))
			throw new Conflict("Candidate with "+candidate.getCandidateName()+" is already present");
		return candidateRepository.save(candidate);
	}
	
	@Transactional
	@Override
	public List<Candidate> getCandidates() {
		return candidateRepository.findAll();
	}
	
	@Transactional
	@Override
	public Candidate updateCandidate(Candidate candidate) {
		return candidateRepository.save(candidate);				   
	}
	
	@Transactional
	@Override
	public List<SubVendor> getSubVendors(){
		return subVendorRepository.findAll();
	}
	
	@Transactional
	@Override
	public SubVendor updateSubVendor(SubVendor subVendor) {
		return subVendorRepository.save(subVendor);				   
	}
	
	@Transactional
	
	@Override
	public int addtransactionsbyid(Transactions transactions, int id) {
		Candidate candidate = candidateRepository.findByCandidateId(id);
		transactions.setCandidate(candidate);
		System.out.println(candidate.getCandidateId());
		transactions.setPrimevendorid(candidate.getPrimeVendor());
		transactions.setSubvendorid(candidate.getSubVendor());
		transactionsRepository.save(transactions);
		return transactions.getTransactionId();
		
	}
	
	 @Override
	public List<Transactions> getTransactions(int candidateid) {
		return  transactionsRepository.findAllByCandidateCandidateId(candidateid);		
	}
		
	
	@Override
	public List<Transactions> getRecentTransactions(int candidateid) {
		
		return transactionsRepository.findTop1ByCandidateCandidateIdOrderByStartdateDesc(candidateid);
	}

	@Override
	public Transactions updatetransactions(Map<String, Object> test, int id,Transactions transactions) {
		Set keys = test.keySet();
		
		System.out.println("\n"+keys+"\n");
		transactions.setTransactionId(id);		
		Transactions t = transactionsRepository.findByTransactionId(id);
		
		if(keys.contains("startdate")) {
				
			t.setStartdate(transactions.getStartdate());
		}
		
		if(keys.contains("enddate")) {
			t.setEnddate(transactions.getEnddate());
		}
		
		if(keys.contains("primevendorpaiddate")) {
			t.setPrimevendorpaiddate(transactions.getPrimevendorpaiddate());
		}
		
		if(keys.contains("primevendorrate")) {
			t.setPrimevendorrate(transactions.getPrimevendorrate());
		}
		
		if(keys.contains("totalHours")) {
			
			t.setTotalHours(transactions.getTotalHours());
		}
		
		if(keys.contains("deductions")) {
			t.setDeductions(transactions.getDeductions());
		}
		
		if(keys.contains("primevendorExpectedAmount")) {
			t.setPrimevendorExpectedAmount(transactions.getPrimevendorExpectedAmount());
		}
		
		if(keys.contains("primevendorActualPayment")) {
			t.setPrimevendorActualPayment(transactions.getPrimevendorActualPayment());
		}
		
		if(keys.contains("deductionstobepassedtosubvendor")) {
			t.setDeductionstobepassedtosubvendor(transactions.getDeductionstobepassedtosubvendor());
		}
		
		if(keys.contains("primevendorpaidstatus")) {
			t.setPrimevendorpaidstatus(transactions.getPrimevendorpaidstatus());
		}
		
		if(keys.contains("primevendorinvoicenumber")) {
			t.setPrimevendorinvoicenumber(transactions.getPrimevendorinvoicenumber());
		}
		
		if(keys.contains("primevendorcomments")) {
			t.setPrimevendorcomments(transactions.getPrimevendorcomments());
		}
		
		if(keys.contains("subvendorrate")) {
			t.setSubvendorrate(transactions.getSubvendorrate());
		}
		
		if(keys.contains("subvendoramount")) {
			t.setSubvendoramount(transactions.getSubvendoramount());
		}
		
		if(keys.contains("subvendorpaiddate")) {
			t.setSubvendorpaiddate(transactions.getSubvendorpaiddate());
		}
		
		if(keys.contains("subvendorpaidstatus")) {
			t.setSubvendorpaidstatus(transactions.getSubvendorpaidstatus());
		}
		
		if(keys.contains("sub_vendorinvoicenumber")) {
			t.setSub_vendorinvoicenumber(transactions.getSub_vendorinvoicenumber());
		}
		
		if(keys.contains("subvendordeductions")) {
			t.setSubvendordeductions(transactions.getSubvendordeductions());
		}
		
		if(keys.contains("subvendorcomments")) {
			t.setSubvendorcomments(transactions.getSubvendorcomments());
		}
		
		transactionsRepository.save(t);
		return t;
	}

	@Override
	public List<Transactions> paidtab(int id) {
		
		return transactionsRepository.findAllBySubvendorpaidstatusAndCandidateCandidateId("paid",id);
	}
	
}