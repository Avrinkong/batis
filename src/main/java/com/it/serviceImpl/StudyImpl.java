package com.it.serviceImpl;

import com.it.mapper.StudentMapper;
import com.it.pojo.Student;
import com.it.service.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
    public class StudyImpl implements Study {
    @Autowired
        private StudentMapper studentMapper;


        /**
         * 添加学生
         * @param student
         * @return 学生ID
         */
        public int addStudent(Student student){

            int i = studentMapper.addStudent(student);
            return student.getStudent_Id();
        }


        /**
         * 根据学生ID删除学生 true or false
         * @param i
         * @return true or false
         */
        public boolean delete(int i){
            int a = studentMapper.deleteStudent(i);
            if (a==0){
                return false;
            }
            return true;
        }

        /**
         * 根据学生ID修改学生信息
         * @param student
         * @return 修改是否成功
         */
        public boolean update(Student student) {
           int i = studentMapper.updateStudent(student);
            if (i==0){return false;}
            return true;
        }


        /**
         * 查询所有学生信息
         * @return List<Student>
         */
        public List<Student> findAll() {
                //SqlSession对象

            List<Student> list = studentMapper.queryAll();
            return list;
        }

        /**
         * 根据学生姓名查询学生信息
         * @param s
         * @return List<Student>
         */
        public List<Student> findByName(String s) {
            List<Student> list = studentMapper.queryByName(s);
            return list;
        }

        /**
         * 根据学号查询学生信息
         * @param i
         * @return
         */
        public List<Student> findByLearnNumber(int i) {
            List<Student> list = studentMapper.queryByLearnNumber(i);
            return list;
        }

        public boolean addAll1(List<Student> list) {
            int i = studentMapper.addAll(list);
            if (i==0){
                return false;
            }
            return true;
        }


    }
