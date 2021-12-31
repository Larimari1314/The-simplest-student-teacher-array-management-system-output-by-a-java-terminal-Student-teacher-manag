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
                            Add_to.Add_all(Student);
                        case 2:
                            delete.delete_all(Student);
                        case 3:
                            Check_all.newcheck_all(Student);
                        case 4:
                            view_all.view_alls(Student);
                        case 5:
                            break;
                        default:
                            System.out.println("请按照提示输入信息！！！");
                    }

                case 2:
                    switch (front_page.Teacher_page()) {
                        case 1:
                            Add_to.Add_all(Teacher);
                        case 2:
                            delete.delete_all(Teacher);
                        case 3:
                            Check_all.newcheck_all(Teacher);
                        case 4:
                            view_all.view_alls(Teacher);
                        case 5:
                            break;
                        default:
                            System.out.println("请按照提示输入信息！！！");
                    }

                case 3:
                    System.exit(0);
                default:
                    System.out.println("请按照提示输入信息！！！");
            }
        }
    }
}
