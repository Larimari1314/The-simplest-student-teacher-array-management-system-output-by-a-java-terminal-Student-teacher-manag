package com.heima.operate_manage;

import com.heima.Storage_class.Storage_class;

import java.util.Scanner;

public class Check_all {
    public static Storage_class[] newcheck_all(Storage_class[] list) {
        if (list.length == 0) {
            System.out.println("当前未存在数值，请添加数据后重试！！！");
            return list;
        } else {
            System.out.println("请输入你选择修改的ID");
            Scanner sc = new Scanner(System.in);
            int ID = sc.nextInt();
            int a = compare.compare_id(ID, list);
            if (a == 0) {
                System.out.println("您输入的ID不存在，请检查后输入！！");
                return list;
            } else {
                System.out.println("请输入您要修改的姓名：");
                //String name=sc.next();
                list[a].setName(sc.next());
                System.out.println("请输入您要修改的年龄：");
                // int age=sc.nextInt();
                list[a].setAge(sc.nextInt());
                System.out.println("请输入您要修改的生日：");
                //Stirng brithday=sc.next();
                list[a].setBrithday(sc.next());
            }
            return list;
        }
    }
}
