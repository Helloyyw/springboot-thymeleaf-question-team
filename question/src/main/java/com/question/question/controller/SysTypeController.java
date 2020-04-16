package com.question.question.controller;


import com.question.question.bean.SysType;
import com.question.question.service.SysTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yyw
 * @since 2020-04-11
 */
@Controller
@RequestMapping("/sysType")
public class SysTypeController {
    @Resource
    SysTypeService sysTypeService;

    @RequestMapping(value = "/hello1")
    public String index()
    {
        return "index";
    }
    @RequestMapping(value = "/getData")
    @ResponseBody
    public Object getData()
    {
        List<SysType> typeList = new ArrayList<>();
        SysType user = new SysType();
        user.setTypeName("OA系统");
        SysType user1 = new SysType();
        user1.setTypeName("电子商务系统");
        SysType user2 = new SysType();
        user2.setTypeName("工业控制系统");
        SysType user3 = new SysType();
        user3.setTypeName("信息管理系统");


        typeList.add(user);
        typeList.add(user1);
        typeList.add(user2);
        typeList.add(user3);

        return typeList;
    }

}
