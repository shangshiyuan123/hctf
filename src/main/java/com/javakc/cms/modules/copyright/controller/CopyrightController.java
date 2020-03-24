package com.javakc.cms.modules.copyright.controller;


import com.javakc.cms.base.page.Page;
import com.javakc.cms.modules.copyright.entity.Copyright;
import com.javakc.cms.modules.copyright.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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
    @RequestMapping("create")
        public String create(Copyright entity){
        copyrightService.save(entity);
        return "redirect:/copyright/queryCopyright.do";
    }

    @RequestMapping("delete/{copyrightId}")
    public String delete(@PathVariable String copyrightId){
        copyrightService.delete(copyrightId);
        return "redirect:/copyright/queryCopyright.do";
    }

    @RequestMapping("queryById/{copyrightId}")
    public String queryById(@PathVariable String copyrightId, ModelMap model){
       Copyright entity=copyrightService.get(copyrightId);
        model.put("entity",entity);
        return "copyright/update";
    }

    @RequestMapping("update")
    public String update(Copyright entity){
        copyrightService.update(entity);
        return "redirect:/copyright/queryCopyright.do";
    }
    }

