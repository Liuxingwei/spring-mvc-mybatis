package cn.liuxingwei.spring.mvc.maven.web;

import cn.liuxingwei.spring.mvc.maven.orm.domain.UserMyBatisDao;
import cn.liuxingwei.spring.mvc.maven.service.UserMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMyBatisService userMyBatisService;


    @RequestMapping(value = "/appbymybatis", method = RequestMethod.GET)
    public String addUserByMybatis() {
        UserMyBatisDao userMyBatisDao = new UserMyBatisDao();
        userMyBatisDao.setUserName("wangwu");
        userMyBatisService.addUser(userMyBatisDao);
        return "user/add";
    }

}
