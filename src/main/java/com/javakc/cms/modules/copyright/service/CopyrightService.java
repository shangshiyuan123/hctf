package com.javakc.cms.modules.copyright.service;


import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.copyright.dao.CopyrightDao;
import com.javakc.cms.modules.copyright.entity.Copyright;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
     * @param id
     */
    @Transactional(readOnly = false)
    public void delete(String[] id) {
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
    public Page findList(Copyright entity,Page page){
        entity.setPage(page);
        List<Copyright> list = dao.findList(entity);
        page.setList(list);
        return page;
    }
    /**
     * 查询所有数据
     * @return
     */
    public List<Copyright> findAllList(){
        return  dao.findAllList();
    }

}
