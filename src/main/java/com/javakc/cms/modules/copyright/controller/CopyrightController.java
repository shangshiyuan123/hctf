package com.javakc.cms.modules.copyright.controller;


import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.copyright.entity.Copyright;
import com.javakc.cms.modules.copyright.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("copyright")
public class CopyrightController {
    @Autowired
    CopyrightService copyrightService;
    /**
     * 根据条件进行分页查询测试信息数据
     * @param entity
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("queryCopyright")
    public ModelAndView queryCopyright(Copyright entity, HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView("copyright/list");
        Page page= copyrightService.findList(entity,new Page(request,response));
        modelAndView.addObject("page",page);
        return modelAndView;
    }
    }

