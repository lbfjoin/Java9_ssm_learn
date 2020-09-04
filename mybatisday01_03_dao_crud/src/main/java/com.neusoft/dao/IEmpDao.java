package com.neusoft.dao;

import com.neusoft.domain.Emp;
import com.neusoft.domain.User;

import java.util.List;

public interface IEmpDao {
      /*
      查询全部
       */
      List<Emp> findAll();
      /*
      查询特定id
       */
     Emp findById(int EMPNO);
      /*
       * 保存用户
       * */
       int saveEmpno(Emp emp);

      /*
       * 更新用户
       * */
       int updateEmpno(Emp emp);

      /*
       * 删除用户
       * */
       int deleteEmpno(int EMPNO);

      /**
       * 根据姓名进行模糊查询
       */
       List<Emp> findByName(String ENAME);

      /**
       * 查询总记录数
       */
      int totalCount();
}
