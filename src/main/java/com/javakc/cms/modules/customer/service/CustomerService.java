package com.javakc.cms.modules.customer.service;

import com.javakc.cms.modules.customer.dao.CustomerDao;
import com.javakc.cms.modules.customer.entity.Customer;
import org.apache.commons.lang3.StringUtils;
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
    @Transactional(readOnly = false)
    public void save(Customer entity){
        entity.setCustomerId(UUID.randomUUID().toString().replace("-",""));
        customerDao.insert(entity);
    }

    @Transactional(readOnly = false)
    public void update(Customer entity) {
        customerDao.update(entity);
    }

    @Transactional(readOnly = false)
    public void delete(String id) {
        customerDao.delete(id);
    }

    @Transactional(readOnly = false)
    public void batch(String[] ids) {
        customerDao.batch(ids);
    }

    public Customer get(String id) {
        return customerDao.get(id);
    }



    public List<Customer> query(Customer entity,int start,int size){
        Map<String,Object> param=new HashMap<>();
        param.put("start",start);
        param.put("size",size);
        param.put("name",entity.getName());
        if(entity.getCopyright()!=null){
            param.put("copyrightName",entity.getCopyright().getCopyrightName());
            System.out.println(entity.getCopyright().getCopyrightName());
        }

        return customerDao.query(param);
    }
    public long queryByCount(Customer entity){
        Map<String,Object> param=new HashMap<>();
        param.put("name",entity.getName());
        if(entity.getCopyright()!=null){
            param.put("copyrightName",entity.getCopyright().getCopyrightName());
        }
        return customerDao.queryByCount(param);
    }



}
