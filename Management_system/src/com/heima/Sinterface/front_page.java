package com.heima.Sinterface;

import com.heima.Input_class.input;

class front_page {
    public static int front_page() {
        System.out.println("————————欢迎来到二胖培训管理系统————————");
        System.out.println("请输入您的选择：1.学生管理系统   2.教师管理系统   3.退出");
        int a = input.newintput();
        return a;
    }

    public static int Student_page() {
        System.out.println("————————欢迎来到<学生>管理系统————————");
        System.out.println("请输入您的选择：1.添加学生   2.删除学生    3.修改学生    4.查看学生   5.退出");
        int a = input.newintput();
        return a;
    }

    public static int Teacher_page() {
        System.out.println("————————欢迎来到<教师>管理系统————————");
        System.out.println("请输入您的选择：1.添加教师   2.删除教师    3.修改教师    4.查看教师   5.退出");
        int a = input.newintput();
        return a;
    }

}
