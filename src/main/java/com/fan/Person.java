package com.fan;

/**
 * @description:
 * @author: fan
 * @date: 2022/3/21 9:34
 * @version: 1.0
 */
public class Person {

    private String name;

    private Integer age;

    private String address;

    private Work work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
