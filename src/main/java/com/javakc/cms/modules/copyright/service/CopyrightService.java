package com.javakc.cms.modules.copyright.service;


import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.copyright.dao.CopyrightDao;
import com.javakc.cms.modules.copyright.entity.Copyright;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional(readOnly =true)
public class CopyrightService {
    @Autowired
   private CopyrightDao dao;


    /**
     * 保存数据（插入）
     * @param entity
     */
    @Transactional(readOnly = false)
    public void save(Copyright entity) {
        entity.setCopyrightId(UUID.randomUUID().toString().replace("-",""));
        dao.insert(entity);
    }

    /**
     * 保存数据（更新）
     * @param entity
     */
    @Transactional(readOnly = false)
    public void update(Copyright entity) {
        dao.update(entity);
    }

    /**
     * 删除数据 (批量删除数据)
     * @param ids
     */
    @Transactional(readOnly = false)
    public void batch(String[] ids) {
        dao.batch(ids);
    }

    /**
     * 删除数据 (批量删除数据)
     * @param id
     */
    @Transactional(readOnly = false)
    public void delete(String id) {
        dao.delete(id);
    }


    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public Copyright get(String id) {
        return dao.get(id);
    }


    /**
     * 查询列表数据
     * @param entity
     * @return
     */
    public List<Copyright> findList(Copyright entity,int start,int size){
        Map<String,Object> param=new HashMap<>();
        param.put("start",start);
        param.put("size",size);
        param.put("copyrightName",entity.getCopyrightName());
        param.put("company",entity.getCompany());
        param.put("remarks",entity.getRemarks());
        return dao.findList(param);
    }

    public long queryByCount(Copyright entity){
        Map<String,Object> param=new HashMap<>();
        param.put("copyrightName",entity.getCopyrightName());
        param.put("company",entity.getCompany());
        param.put("remarks",entity.getRemarks());
        return dao.queryByCount(param);
    }
    /**
     * 查询所有数据
     * @return
     */
    public List<Copyright> findAllList(){
        return  dao.findAllList();
    }

}
