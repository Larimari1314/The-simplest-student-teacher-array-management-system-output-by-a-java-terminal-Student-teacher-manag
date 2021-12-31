package com.heima.Storage_class;

import java.util.Date;

public class Storage_class {
    private int ID;
    private String name;
    private int age;
    private String brithday;

    public Storage_class() {
    }
    public Storage_class(int ID, String name, int age, String brithday) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}
