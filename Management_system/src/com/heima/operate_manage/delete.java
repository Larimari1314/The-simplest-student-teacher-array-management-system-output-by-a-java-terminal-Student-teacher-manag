package com.heima.operate_manage;

import com.heima.Storage_class.Storage_class;

import java.util.Scanner;

public class delete {
    public static Storage_class[] delete_all(Storage_class[] list){
        if(list.length==0){
            System.out.println("当前不存在数据，请添加数据后重试！！！");
            return list;
        }
        else {
            System.out.println("请输入你删除的id：");
            Scanner sc = new Scanner(System.in);
            int a=compare.compare_id(sc.nextInt(), list);
            if (a == 0) {
                System.out.println("您查找的ID不存在请检查输入后重试！！");
                return list;
            } else {
                Storage_class[] newlist = new Storage_class[list.length - 1];
                for (int i = 0; i < newlist.length; i++) {
                    if(i<a){
                        newlist[i]=list[i];
                    }
                    else {
                        newlist[i]=list[i+1];
                    }
                }
                return newlist;
            }
        }
    }
}
