package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

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
        User user = userMapper.getUserById(41);
        System.out.println(user);

        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void addUser() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        // 方式一
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(52, "小张");
        int number = userMapper.addUser(user);
        System.out.println(number);
        sqlSession.commit();
        if (number > 0) {
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        User userResult = userMapper.getUserById(52);
        System.out.println(userResult);

        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        // 方式一
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(51);
        user.setUsername("小刘");
        user.setSex("小");
        int number = userMapper.updateUser(user);
        System.out.println(number);
        sqlSession.commit();
        if (number > 0) {
            System.out.println("更新成功");
        }else {
            System.out.println("更新失败");
        }
        User userResult = userMapper.getUserById(51);
        System.out.println(userResult);

        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        // 获得 SqlSession 对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        // 方式一
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int number = userMapper.deleteUser(52);
        System.out.println(number);
        sqlSession.commit();
        if (number > 0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        User userResult = userMapper.getUserById(51);
        System.out.println(userResult);

        // 关闭 SqlSession
        sqlSession.close();
    }
}
