package com.javakc.cms.modules.customer.controller;

import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.customer.entity.Customer;
import com.javakc.cms.modules.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 添加方法
     * @param entity 实体对象
     * @return
     */
    @RequestMapping("create")
    public String create(Customer entity)
    {
        customerService.save(entity);
        return "redirect:/customer/query.do";
    }
    @RequestMapping("query")
    public String query(Customer entity, Page page, ModelMap model){
        page.setList(customerService.query(entity,page.getStart(),page.getSize()));
        page.setCount(customerService.queryByCount(entity));
        model.put("page", page);
        return "customer/list";
    }



}
