package com.chenyu.demo;

import com.chenyu.demo.test01.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    /*
    * 枚举的基本用法
    *
    * */
    @Test
    void  test01(){

        //1.创建一个枚举对象
        UserRole role01 = UserRole.ROLE_ROOT_ADMIN;
        UserRole role02 = UserRole.ROLE_ORDER_ADMIN;
        UserRole role03 = UserRole.ROLE_NORMAL;
        System.out.println(role01);

        System.out.println("-----------------------------");

        //2.values()方法：返回所有枚举常量的数组集合
        for (UserRole role:UserRole.values()) {
            System.out.println(role);
        }

        System.out.println("-----------------------------");
        //3. ordinal()方法：返回枚举常量的序数
        System.out.println(role01.ordinal());
        System.out.println(role02.ordinal());

        System.out.println("-----------------------------");


        // compareTo()方法：枚举常量间的比较
        System.out.println( role01.compareTo(role02) ); //打印-1
        System.out.println( role02.compareTo(role03) ); //打印-1
        System.out.println( role01.compareTo(role03) ); //打印-2

        // name()方法：获得枚举常量的名称
        System.out.println( role01.name() ); // 打印ROLE_ROOT_ADMIN
        System.out.println( role02.name() ); // 打印ROLE_ORDER_ADMIN
        System.out.println( role03.name() ); // 打印ROLE_NORMAL


        // valueOf()方法：返回指定名称的枚举常量
        UserRole role_root_admin = UserRole.valueOf("ROLE_ROOT_ADMIN");

    }

}
