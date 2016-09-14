package com.easyui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyui.dao.CustomerDao;
import com.easyui.dto.PageHelper;
import com.easyui.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	
	public long getTotalRows(){
		return  customerDao.getTotalRows();
	}
	
	public List<Customer> getCustomerByPage(PageHelper page){
		page.setStart((page.getPage()-1)*page.getRows());
		page.setEnd(page.getPage()*page.getRows());
		return customerDao.findByPage(page);
	}
	
	public void addCustomer(Customer customer){
		customerDao.insert(customer);
	}
	
	public void editCustomer(Customer customer){
		customerDao.update(customer);
	}
	public void deleteCustomer(int id){
		customerDao.deleteById(id);	
	}

}
