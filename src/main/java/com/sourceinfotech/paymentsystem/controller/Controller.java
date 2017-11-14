package com.sourceinfotech.paymentsystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sourceinfotech.paymentsystem.constants.URI;
import com.sourceinfotech.paymentsystem.entity.Candidate;
import com.sourceinfotech.paymentsystem.entity.Commission;
import com.sourceinfotech.paymentsystem.entity.Employee;
import com.sourceinfotech.paymentsystem.entity.PrimeVendor;
import com.sourceinfotech.paymentsystem.entity.SubVendor;
import com.sourceinfotech.paymentsystem.entity.Transactions;
/**
 * @author Ketan
 *
 */
import com.sourceinfotech.paymentsystem.service.IService;


@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping(value=URI.API)
public class Controller {
	private IService service;
	
	public Controller(IService service) {
		this.service=service;
	}

	@RequestMapping(method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String welcome(){
		return "Welcome";
	}
	@RequestMapping(value=URI.EMPLOYEES, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Employee> getEmployees(){
		return service.getEmployees();
	}	
	@RequestMapping(value=URI.GETEMPLOYEEBYROLE, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Employee> getEmployeeByRole(@PathVariable("role") String role){
		return service.getEmployeeByRole(role);
	}	
	@ResponseBody
	@RequestMapping(value=URI.ADDEMPLOYEE, method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Employee addEmployee(@RequestBody Employee employee){
		return service.storeEmployee(employee);
	}
	@RequestMapping(value=URI.CANDIDATES, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Candidate> getCandidates(){
		return service.getCandidates();
	}	
	@ResponseBody
	@RequestMapping(value=URI.ADDCANDIDATE, method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Candidate addCandidate(@RequestBody Candidate candidate){
		return service.storeCandidate(candidate);
	}
	
	@ResponseBody
	@RequestMapping(value=URI.UPDATECANDIDATE, method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Candidate updateCandidate(@RequestBody Candidate candidate) {		
		return service.updateCandidate(candidate);
	}
	
	@RequestMapping(value=URI.SUBVENDORS, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<SubVendor> getSubVendors(){
		return service.getSubVendors();
	}
	
	@ResponseBody
	@RequestMapping(value=URI.UPDATESUBVENDOR, method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public SubVendor updateSubVendor(@RequestBody SubVendor subVendor) {		
		return service.updateSubVendor(subVendor);
	}
	
	
	@RequestMapping(value="/addtransactionsbyid/{id}",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public int addtransactions(@RequestBody Transactions transactions,@PathVariable("id") int id){
		return service.addtransactionsbyid(transactions, id);
	}
	
	
	@RequestMapping(value="/gettransactions/{candidateid}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Transactions> gettransactions(@PathVariable("candidateid") int candidateid) {
		return service.getTransactions(candidateid);
	}
	
	@RequestMapping(value="/getrecenttransactions/{candidateid}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Transactions> getrecenttransactions(@PathVariable("candidateid") int candidateid) {
		return service.getRecentTransactions(candidateid);
	}
	
	@RequestMapping(value="/updatetransactions/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public Transactions testtransactions(@PathVariable("id") int id,@RequestBody Map<String, Object> test){
		
		ObjectMapper m = new ObjectMapper();
		Transactions transactions = m.convertValue(test, Transactions.class);	
		System.out.println(test);
		System.out.println(test.get("totalHours"));
		return service.updatetransactions(test,id,transactions);
		}
	
	@RequestMapping(value="/paidtab/{id}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Transactions> paidtab(@PathVariable("id") int id){
				
			return service.paidtab(id);
		
	}
	
}