package com.heima.operate_manage;

import com.heima.Storage_class.Storage_class;

public class compare {
    public  static int compare_id(int a,Storage_class[] list){
        int b=-1;
        for (int i = 0; i < list.length; i++) {
            if(a==list[i].getID()){
                b=i;
                return b;
            }
        }
        return b;
    }
}
