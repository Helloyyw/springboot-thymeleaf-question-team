package com.question.question;

import com.question.question.bean.SysType;
import com.question.question.service.SysTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class QuestionApplicationTests {

    @Resource
    SysTypeService typeService;

    @Test
    void contextLoads() {
    }
    /**
     * <p>
     *     insert 插入测试
     * </p>
     */

    @Test
    public void insertLoads() {
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
     

        boolean b = typeService.saveBatch(typeList);
        System.out.println("return insert value = " + b);
    }

}
