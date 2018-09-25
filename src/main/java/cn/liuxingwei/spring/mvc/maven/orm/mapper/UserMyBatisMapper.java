package cn.liuxingwei.spring.mvc.maven.orm.mapper;

import cn.liuxingwei.spring.mvc.maven.orm.domain.UserMyBatisDao;
import org.springframework.stereotype.Component;

@Component
public interface UserMyBatisMapper {
    UserMyBatisDao getUser(Long userId);
    Integer addUser(UserMyBatisDao userMyBatisDao);
}
