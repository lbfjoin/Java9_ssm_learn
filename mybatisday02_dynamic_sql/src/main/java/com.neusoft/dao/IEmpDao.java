package com.neusoft.dao;

import com.neusoft.domain.Emp;
import com.neusoft.domain.QueryVo;

import java.util.List;

public interface IEmpDao {
    //根据传参条件 进行查询 有可能是用户名 有可能是性别，啥都可能
    List<Emp> findByCondition(Emp emp);

    //传入其他实体类对象类型
    List<Emp> findEmpByQueryVo(QueryVo vo);

    //根据empno集合进行用户查询
    List<Emp> findEmpByEmpnos(QueryVo vo);

}
