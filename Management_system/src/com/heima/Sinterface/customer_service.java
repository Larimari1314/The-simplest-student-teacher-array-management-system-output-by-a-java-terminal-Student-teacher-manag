package com.heima.Sinterface;

import com.heima.Storage_class.Storage_class;
import com.heima.operate_manage.Add_to;
import com.heima.operate_manage.Check_all;
import com.heima.operate_manage.delete;
import com.heima.operate_manage.view_all;

public class customer_service {
    public static void main(String[] args) {
        Storage_class[] Student = new Storage_class[0];
        Storage_class[] Teacher = new Storage_class[0];
        while (true) {
            switch (front_page.front_page()) {
                case 1:
                    switch (front_page.Student_page()) {
                        case 1:
                            Student = Add_to.Add_all(Student);
                            break;
                        case 2:
                            Student = delete.delete_all(Student);
                            break;
                        case 3:
                            Student = Check_all.newcheck_all(Student);
                            break;
                        case 4:
                            view_all.view_alls(Student);
                            break;
                        case 5:
                            System.out.println("感谢您对学生管理系统的使用，再见！");
                            break;
                        default:
                            System.out.println("请按照提示输入信息！！！");
                    }
                    break;
                case 2:
                    switch (front_page.Teacher_page()) {
                        case 1:
                            Teacher = Add_to.Add_all(Teacher);
                            break;
                        case 2:
                            Teacher = delete.delete_all(Teacher);
                            break;
                        case 3:
                            Teacher = Check_all.newcheck_all(Teacher);
                            break;
                        case 4:
                            view_all.view_alls(Teacher);
                            break;
                        case 5:
                            System.out.println("感谢您对教师管理系统的使用，再见！");
                            break;
                        default:
                            System.out.println("请按照提示输入信息！！！");
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("请按照提示输入信息！！！");
            }
        }
    }
}
