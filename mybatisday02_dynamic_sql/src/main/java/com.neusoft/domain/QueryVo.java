package com.neusoft.domain;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/4 16:36
 */
public class QueryVo {
    private User user;
    private Emp emp;
    private List<Integer> empnos;
    private List<Integer> ids;

    public QueryVo() {
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Integer> getEmpnos() {
        return empnos;
    }

    public void setEmpnos(List<Integer> empnos) {
        this.empnos = empnos;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
