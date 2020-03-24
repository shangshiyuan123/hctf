package com.javakc.cms.modules.customer.service;

import com.javakc.cms.modules.customer.dao.CustomerDao;
import com.javakc.cms.modules.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    public void save(Customer entity){
        entity.setCustomerId(UUID.randomUUID().toString().replace("-",""));
        customerDao.insert(entity);
    }

    public List<Customer> query(Customer entity,int start,int size){
        Map<String,Object> param=new HashMap<>();
        param.put("start",start);
        param.put("size",size);
        return customerDao.query(param);
    }
    public long queryByCount(Customer entity){
        Map<String,Object> param=new HashMap<>();
        return customerDao.queryByCount(param);
    }


}
