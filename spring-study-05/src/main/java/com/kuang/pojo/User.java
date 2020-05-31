package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 组件，等价于在   <bean id="user" class="com.kuang.pojo.User" />
@Component
public class User {

    @Value("狂神")
    public String name ;
}
