package com.neusoft.domain;

import java.util.List;

/**
 * @author lbf
 * @date 2020/9/4 22:46
 */
public class QueryVo {
    private List<Integer> deptnos;
    private Dept dept;

    public QueryVo() {
    }

    public QueryVo(List<Integer> deptnos, Dept dept) {
        this.deptnos = deptnos;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "deptnos=" + deptnos +
                ", dept=" + dept +
                '}';
    }

    public List<Integer> getDeptnos() {
        return deptnos;
    }

    public void setDeptnos(List<Integer> deptnos) {
        this.deptnos = deptnos;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
