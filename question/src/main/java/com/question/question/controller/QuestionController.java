package com.question.question.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.question.question.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yyw
 * @since 2020-04-11
 */
@Controller
@RequestMapping("/question")
public class QuestionController {
    @Resource
    QuestionService questionService;

    @RequestMapping(value = "/getQuestion")
    @ResponseBody
    public Object getQuestion(@RequestBody String jsondata)
    {
        JSONObject jsonObject = JSON.parseObject(jsondata);
        String bsm = jsonObject.get("bsm").toString();
    
        questionService.listMaps(bsmMap)
        return typeList;
    }

}
