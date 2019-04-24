package com.it.service;

import com.it.domain.Student;

import java.util.List;

public interface Study {
    /**
     * 添加学生
     * @param student
     * @return 学生ID
     */
    public int addStudent(Student student);

    //根据学生ID删除学生 返回 true/false
    public boolean delete(int i);

    //根据学生ID修改学生信息 返回true/false
    public boolean update(Student student);

    //查询所有学生信息 返回list集合
    public List findAll();

    //根据学生姓名查询学生信息，返回List集合
    public List findByName(String s);

    //根据学生学号查询学生信息并返回 List集合
    public List findByLearnNumber(int i);

    //批量插入学生
    public boolean addAll1(List<Student> list);


}
