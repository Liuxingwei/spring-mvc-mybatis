package cn.liuxingwei.spring.mvc.maven.service;

import cn.liuxingwei.spring.mvc.maven.orm.domain.UserMyBatisDao;
import cn.liuxingwei.spring.mvc.maven.orm.mapper.UserMyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMyBatisService {

    @Autowired
    private UserMyBatisMapper userMyBatisMapper;

    public boolean addUser(UserMyBatisDao userMyBatisDao) {
        return userMyBatisMapper.addUser(userMyBatisDao) == 1;
    }

}
