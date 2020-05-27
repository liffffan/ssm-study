package com.kuang.dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);


    @Test
    public void test() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        // 方式一
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user :   userList) {
            System.out.println(user);
        }

        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        // 方式一
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);

        // 关闭 SqlSession
        sqlSession.close();
    }


    @Test
    public void testLog4j() {
        logger.info("info:进入了 testLog4j");
        logger.debug("debug:进入了 testLog4j");
        logger.error("error:进入了 testLog4j");
    }
}
