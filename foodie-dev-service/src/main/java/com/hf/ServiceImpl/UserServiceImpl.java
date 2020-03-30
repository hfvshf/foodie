package com.hf.ServiceImpl;

import com.hf.mapper.StuMapper;
import com.hf.mapper.UsersMapper;
import com.hf.pojo.Stu;
import com.hf.pojo.Users;
import com.hf.service.StuService;
import com.hf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users checkUserNameIsExsits(String userName) {

        Example example = new Example(Users.class);

        Example.Criteria criteria = example.createCriteria().andEqualTo("username",userName);

        Users users = usersMapper.selectOneByExample(example);

        return  users;
    }

    @Override
    public Users catStuById(Integer id) {
        return null;
    }

    @Override
    public void saveStu(Users users) {

    }

    @Override
    public void updateStu(Integer id, Users users) {

    }

    @Override
    public void delStu(Integer id) {

    }
}
