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

    @RequestMapping("queryCopyright")
    public String queryCopyright(Copyright entity, Page page,ModelMap model){
        page.setList(copyrightService.findList(entity,page.getStart(),page.getSize()));
        page.setCount(copyrightService.queryByCount(entity));
        model.put("page", page);
        return "copyright/list";
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

