package com.study.springboot.mybatisplus.user.serviceImpl;

import com.study.springboot.mybatisplus.user.entity.User;
import com.study.springboot.mybatisplus.user.mapper.UserDao;
import com.study.springboot.mybatisplus.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author number-47
 * @since 2019-06-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
