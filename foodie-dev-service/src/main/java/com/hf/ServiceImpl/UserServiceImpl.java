package com.hf.ServiceImpl;

import com.hf.enums.Sex;
import com.hf.mapper.StuMapper;
import com.hf.mapper.UsersMapper;
import com.hf.pojo.BO.UsersBO;
import com.hf.pojo.Stu;
import com.hf.pojo.Users;
import com.hf.service.StuService;
import com.hf.service.UserService;
import com.hf.utils.DateUtil;
import com.hf.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sid sid;

    private static final String USER_FACE = "http://122.152.205.72:88/group1/M00/00/05/CpoxxFw_8_qAIlFXAAAcIhVPdSg994.png";

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users checkUserNameIsExsits(String userName) {

        Example example = new Example(Users.class);

        Example.Criteria criteria = example.createCriteria().andEqualTo("username",userName);

        Users users = usersMapper.selectOneByExample(example);

        return  users;
    }

    @Transactional
    @Override
    public Users catStuById(UsersBO usersBO) {

        Users user = new Users();
        user.setUsername(usersBO.getUsername());
        try {
            user.setPassword(MD5Utils.getMD5Str(usersBO.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        user.setNickname(usersBO.getUsername());
        user.setCreatedTime(DateUtil.getCurrentDateTime());
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        user.setSex(Sex.secret.type);
        user.setId(sid.nextShort());
        user.setFace(USER_FACE);

        return user;
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
