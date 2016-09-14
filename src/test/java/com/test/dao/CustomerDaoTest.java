package com.test.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easyui.dao.CustomerDao;
import com.easyui.entity.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class CustomerDaoTest {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Test
	public void testfindAll(){
		List<Customer> list = customerDao.findAll();
		for (Customer customer : list) {
			System.out.println(customer);
		}
	}
	
	@Test
	public void testinset(){
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("王五");
		customer.setAddress("美国");
		customer.setZipcode("0571");
		customer.setFax("0575");
		customerDao.insert(customer);
	}
	
	@Test
	public void testdelete(){
		customerDao.deleteById(1);
	}
	
	@Test
	public void testupdate(){
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("王五");
		customer.setAddress("中国");
		customer.setZipcode("0571");
		customer.setFax("0575");
		customerDao.update(customer);
	}

}
