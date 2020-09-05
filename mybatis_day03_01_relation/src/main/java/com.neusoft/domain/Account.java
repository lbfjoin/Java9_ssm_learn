package com.neusoft.domain;

/**
 * @author lbf
 * @date 2020/9/5 8:54
 */
public class Account {
    private int id;
    private int uid;
    private int money;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //从表实体中注入一个实体对象
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
