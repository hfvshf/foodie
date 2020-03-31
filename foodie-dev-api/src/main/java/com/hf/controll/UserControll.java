package com.hf.controll;

import com.hf.pojo.Users;
import com.hf.service.UserService;
import com.hf.utils.IMOOCJSONResult;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControll {

    @Autowired
    private UserService userService;

    @RequestMapping("/UserNameIsExist")
    public IMOOCJSONResult checkUserNameExsits(String userName){

        if(userName == null || "".equals(userName)){
            return  IMOOCJSONResult.errorMsg("用户名不可为空！");
        }

        Users users = userService.checkUserNameIsExsits(userName);

        if(users != null){
            return IMOOCJSONResult.errorMsg("用户名已存在！");
        }

        return  IMOOCJSONResult.ok();
    }
}
