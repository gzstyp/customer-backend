package com.fwtai.controller;

import com.fwtai.bean.PageFormData;
import com.fwtai.service.CustomerService;
import com.fwtai.tool.ToolClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 仓库货位号管理
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-14 14:34
 * @QQ号码 444141300
 * @Email service@yinlz.com
 * @官网 <url>http://www.yinlz.com</url>
*/
@RestController
@RequestMapping("api")
@CrossOrigin
public class ApiController{

    @Autowired
    private HttpServletRequest request;

    @Resource
    private CustomerService service;

    // http://127.0.0.1:83/api/getListData?pageSize=2&start=1
    @GetMapping("getListData")
    public final void getListData(final HttpServletResponse response){
        final PageFormData pageFormData = new PageFormData(request);
        final String json = service.getListData(pageFormData);
        ToolClient.responseJson(json,response);
    }

    // http://127.0.0.1:83/api/update?name=www&id=1
    @PostMapping("update")
    public final void update(final HttpServletResponse response){
        final String json = service.update(new PageFormData(request));
        ToolClient.responseJson(json,response);
    }
}