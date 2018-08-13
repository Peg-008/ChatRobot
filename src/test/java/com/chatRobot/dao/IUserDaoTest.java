/**
 * Copyright (C), 2018-2018
 * FileName: IUserDaoTest
 * Author:   sky丶风
 * Date:     2018/8/13 16:27
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chatRobot.dao;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author sky丶风
 * @create 2018/8/13
 * @since 1.0.0
 */
import com.chatRobot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

}