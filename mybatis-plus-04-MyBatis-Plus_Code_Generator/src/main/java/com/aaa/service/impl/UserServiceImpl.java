package com.aaa.service.impl;

import com.aaa.domain.User;
import com.aaa.dao.UserDao;
import com.aaa.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Heima programmer
 * @since 2023-07-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
