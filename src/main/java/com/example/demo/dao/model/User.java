package com.example.demo.dao.model;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private Integer sex;

    private Integer age;

    private String idCard;

    private Date createTime;

    public User(Integer id, String name, Integer sex, Integer age, String idCard, Date createTime) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idCard = idCard;
        this.createTime = createTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}