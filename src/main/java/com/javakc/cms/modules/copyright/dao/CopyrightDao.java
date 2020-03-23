package com.javakc.cms.modules.copyright.dao;


import com.javakc.cms.modules.copyright.entity.Copyright;

import java.util.List;

public interface CopyrightDao {
    /**
     * 添加记录到系统
     * @param entity
     * @return
     */
    public int insert(Copyright entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    public int update(Copyright entity);

    /**
     * 删除数据（一般为逻辑删除，更新del_flag字段为1）
     * @param id
     * @see public int delete(T entity)
     * @return
     */
//	@Deprecated
    public int delete(String id);

    /**
     * 删除数据 (批量删除数据)
     * @param ids
     * @return
     */
    public int batch(String[] ids);


    /**
     * 获取单条数据
     * @param id
     * @return
     */
    public Copyright get(String id);


    /**
     * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
     * @param entity
     * @return
     */
    public List<Copyright> findList(Copyright entity);


    /**
     * 查询所有数据列表
     * @see public List<T> findAllList(T entity)
     * @return
     */
    public List<Copyright> findAllList();


}
