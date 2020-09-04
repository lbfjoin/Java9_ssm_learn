package com.neusoft.domain;

/**
 * @author lbf
 * @date 2020/9/4 16:04
 */
public class Dept {
    private int d_deptno;
    private String d_dname;
    private String d_loc;

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "d_deptno=" + d_deptno +
                ", d_dname='" + d_dname + '\'' +
                ", d_loc='" + d_loc + '\'' +
                '}';
    }

    public int getD_deptno() {
        return d_deptno;
    }

    public void setD_deptno(int d_deptno) {
        this.d_deptno = d_deptno;
    }

    public String getD_dname() {
        return d_dname;
    }

    public void setD_dname(String d_dname) {
        this.d_dname = d_dname;
    }

    public String getD_loc() {
        return d_loc;
    }

    public void setD_loc(String d_loc) {
        this.d_loc = d_loc;
    }
}
