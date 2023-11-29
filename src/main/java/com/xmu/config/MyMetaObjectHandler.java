package com.xmu.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Mybatis数据填充器
 *
 * @author Ove
 * @date 2023-11-28 17:05
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final String CREATE_TIME = "createTime";
    private static final String CREATE_User_NAME = "createUserName";
    private static final String CREATE_User_Id = "createUserId";
    private static final String Modify_TIME = "ModifyTime";
    private static final String Modify_User_NAME = "ModifyUserName";
    private static final String Modify_User_Id = "ModifyUserId";
    @Override
    public void insertFill(MetaObject metaObject) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        if(metaObject.hasSetter("email")){
//            this.setFieldValByName("email","")
            this.strictInsertFill(metaObject, "email", String.class, "Mr_VanGogh"+number+"@yaeh.net");
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        if(metaObject.hasSetter("email")){
//            this.setFieldValByName("email","")
            this.strictInsertFill(metaObject, "email", String.class, "Mr_VanGogh"+number+"@yaeh.net");
        }

        if(metaObject.hasSetter("modifyTime")){
            this.strictInsertFill(metaObject,"modifyTime", LocalDateTime.class,LocalDateTime.now());
        }

    }
}
