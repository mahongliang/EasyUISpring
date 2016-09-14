package com.easyui.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.easyui.dto.DataGrid;
import com.easyui.dto.Json;
import com.easyui.dto.PageHelper;
import com.easyui.entity.Customer;
import com.easyui.service.CustomerService;


/**
 * @author zh
 */
@Controller()
@RequestMapping("/customer")
public class CustomerController {
	
	private final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;

	/**
	 * 表格
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/datagrid", method = RequestMethod.POST)
	public DataGrid<Customer> datagrid(PageHelper page,Customer customer) {
		DataGrid<Customer> dg = new DataGrid<Customer>();
		long total = customerService.getTotalRows();
		List<Customer> list = customerService.getCustomerByPage(page);
		dg.setTotal(total);
		dg.setRows(list);
		return dg;
	}
	
	/**
	 * 新增
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/add",method = RequestMethod.POST)
    public Json add(Customer customer) {
		Json j = new Json();
		log.debug("穿过来的用户ID为："+customer.getId());
		try {
			customerService.addCustomer(customer);
            j.setSuccess(true);
            j.setMsg("用户新增成功！");
            j.setObj(customer);
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
    }
	
	/**
     * 修改
     * 
     * @return
     */
	@ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public Json editUser(Customer customer) {
        Json j = new Json();
        log.debug("穿过来的用户ID为："+customer.getId());
        try {
        	customerService.editCustomer(customer);
            j.setSuccess(true);
            j.setMsg("编辑成功！");
            j.setObj(customer);
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
    }
	
	/**
	 * 删除某个
	 * @param out
	 */
	@ResponseBody
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public Json delete(Customer customer) {
		Json j = new Json();
        log.debug("穿过来的用户ID为："+customer.getId());
        try {
        	customerService.deleteCustomer(customer.getId());
			j.setSuccess(true);
	        j.setMsg("删除成功！");
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
	}
}
