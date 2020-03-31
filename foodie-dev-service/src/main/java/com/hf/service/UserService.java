package com.hf.service;

import com.hf.pojo.BO.UsersBO;
import com.hf.pojo.Users;

public interface UserService {

    public Users checkUserNameIsExsits(String userName);

    public Users catStuById(UsersBO usersBO);

    public void saveStu(Users users);

    public void  updateStu(Integer id, Users users);

    public void delStu(Integer id);
}
