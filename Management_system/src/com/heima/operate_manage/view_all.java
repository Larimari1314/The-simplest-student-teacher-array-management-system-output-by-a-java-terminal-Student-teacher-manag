package com.heima.operate_manage;

import com.heima.Storage_class.Storage_class;

public class view_all {
    public static void view_alls(Storage_class[] list) {
        if (list.length == 0) {
            System.out.println("当前不存在数据，请添加数据后重试！！！");
            return;
        } else {
            System.out.println("您想查看的数据如下：");
            System.out.println("ID" + "\t\t\t" + "name" + "\t\t" + "age" + "\t\t" + "brithday");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i].getID() + "\t" + list[i].getName() + "\t" + list[i].getAge() + "\t" + list[i].getBrithday());
            }
        }
    }
}
