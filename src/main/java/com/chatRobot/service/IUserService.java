/**
 * Copyright (C), 2018-2018
 * FileName: IUserService
 * Author:   sky丶风
 * Date:     2018/8/13 16:06
 * Description: 接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chatRobot.service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈接口〉
 *
 * @author sky丶风
 * @create 2018/8/13
 * @since 1.0.0
 */

import com.chatRobot.model.User;

public interface IUserService {

    public User selectUser(long userId);

}