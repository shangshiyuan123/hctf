package com.javakc.cms.modules.customer.dao;



import com.javakc.cms.modules.copyright.entity.Copyright;
import com.javakc.cms.modules.customer.entity.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerDao {
    public List<Customer> query(Map<String,Object> param);
    public long queryByCount(Map<String,Object> param);
    public Customer get(String id);
    public int insert(Customer entity);
    public int update(Customer entity);
    public int delete(String id);
    public int batch(String[] ids);
    public List<Copyright> queryCopyright();
}
