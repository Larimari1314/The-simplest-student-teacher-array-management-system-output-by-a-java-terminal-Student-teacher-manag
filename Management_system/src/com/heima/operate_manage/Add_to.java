package com.heima.operate_manage;

import com.heima.Storage_class.Storage_class;

import java.util.Scanner;

public class Add_to {
    public static Storage_class[] Add_all(Storage_class[] list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入ID");
        int ID = sc.nextInt();
        if ((compare.compare_id(ID, list)) != 0) {
            System.out.println("您输入的ID重复，请重新输入！！！");
            return list;
        } else {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入生日：");
            String brithday = sc.next();
            Storage_class[] newlist = new Storage_class[list.length + 1];
            for (int i = 0; i < newlist.length; i++) {
                newlist[i] = list[i];
            }
            newlist[list.length + 1].setID(ID);
            newlist[list.length + 1].setName(name);
            newlist[list.length + 1].setAge(age);
            newlist[list.length + 1].setBrithday(brithday);
            return newlist;
        }
    }
}
