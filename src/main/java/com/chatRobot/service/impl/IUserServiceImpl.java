/**
 * Copyright (C), 2018-2018
 * FileName: IUserServiceImpl
 * Author:   sky丶风
 * Date:     2018/8/13 16:00
 * Description: /实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈/实现〉
 *
 * @author sky丶风
 * @create 2018/8/13
 * @since 1.0.0
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}