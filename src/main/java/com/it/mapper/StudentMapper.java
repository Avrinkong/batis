package com.it.mapper;

import com.it.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {

    //增加学生
    int addStudent(Student student);

    //删除学生
    int deleteStudent(Integer i);

    //根据id修改学生信息
    int updateStudent(Student student);

    //查询student中的数据行数
    int queryCount();

    //查询数据表中所有学生的信息
    List<Student> queryAll();

    //根据学生姓名查询学生信息
    List<Student> queryByName(String s);

    //根据学生学号查询学生信息
    List<Student> queryByLearnNumber(Integer i);

    int addAll(List<Student> list);

}
