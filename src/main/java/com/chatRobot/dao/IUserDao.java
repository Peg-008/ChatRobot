/**
 * Copyright (C), 2018-2018
 * FileName: IUserDao
 * Author:   sky丶风
 * Date:     2018/8/13 15:45
 * Description: dao
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chatRobot.dao;

/**
 * 〈一句话功能简述〉<br> 
 * 〈dao〉
 *
 * @author sky丶风
 * @create 2018/8/13
 * @since 1.0.0
 */

import com.chatRobot.model.User;

public interface IUserDao {

    User selectUser(long id);

}