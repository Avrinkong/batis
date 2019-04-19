package com.it.serviceImpl;

import com.it.dao.StudentMapper;
import com.it.service.Study;
import com.it.domain.Student;
import com.it.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

    public class StudyImpl implements Study {

        /**
         * 添加学生
         * @param student
         * @return 学生ID
         */
        public int addStudent(Student student){
            SqlSession sqlSession = null;
            boolean b = false;
            try {
                sqlSession = MybatisUtil.createSqlSession();
                //添加数据进数据库
                sqlSession.getMapper(StudentMapper.class).addStudent(student);
                System.out.println(student.getStudent_Id());
                sqlSession.commit();
            }catch (Exception e){
                e.printStackTrace();
                sqlSession.rollback();
            }finally {
                MybatisUtil.closeSqlSession(sqlSession);
            }
            return student.getStudent_Id();
        }


        /**
         * 根据学生ID删除学生 true or false
         * @param i
         * @return true or false
         */
        public boolean delete(int i){
            SqlSession sqlSession = null;
            boolean b =false;
            try {
                sqlSession = MybatisUtil.createSqlSession();
                b = sqlSession.getMapper(StudentMapper.class).deleteStudent(i);
                sqlSession.commit();
                System.out.println(b);

            }catch (Exception e){
                e.printStackTrace();
                sqlSession.rollback();
            }finally {
                MybatisUtil.closeSqlSession(sqlSession);
            }
            return b;
        }

        /**
         * 根据学生ID修改学生信息
         * @param student
         * @return 修改是否成功
         */
        public boolean update(Student student) {
            SqlSession sqlSession = null;
            boolean b =false;
            try {
                sqlSession = MybatisUtil.createSqlSession();
                b = sqlSession.getMapper(StudentMapper.class).updateStudent(student);
                sqlSession.commit();

            }catch (Exception e){
                e.printStackTrace();
                sqlSession.rollback();
            }finally {
                MybatisUtil.closeSqlSession(sqlSession);
            }
            return b;
        }


        /**
         * 查询所有学生信息
         * @return List<Student>
         */
        public List<Student> findAll() {
                //SqlSession对象
                SqlSession sqlSession = null;
                List<Student> list = null;
                try {
                    sqlSession = MybatisUtil.createSqlSession();
                    //查询Student表中数据所有信息
                    list = sqlSession.getMapper(StudentMapper.class).queryAll();
                    sqlSession.commit();
                }catch (Exception e){
                    e.printStackTrace();
                    sqlSession.rollback();
                }finally {
                    //释放资源
                    MybatisUtil.closeSqlSession(sqlSession);
                }
            return list;
        }

        /**
         * 根据学生姓名查询学生信息
         * @param s
         * @return List<Student>
         */
        public List<Student> findByName(String s) {
            SqlSession sqlSession = null;
            List<Student> list = null;
            try {
                sqlSession = MybatisUtil.createSqlSession();
                list = sqlSession.getMapper(StudentMapper.class).queryByName(s);
                sqlSession.commit();
            }catch (Exception e){
                e.printStackTrace();
                sqlSession.rollback();
            }finally {
                MybatisUtil.closeSqlSession(sqlSession);
            }
            return list;
        }

        /**
         * 根据学号查询学生信息
         * @param i
         * @return
         */
        public List<Student> findByLearnNumber(int i) {
            SqlSession sqlSession = null;
            List<Student> list = null;
            try {
                sqlSession = MybatisUtil.createSqlSession();
                list = sqlSession.getMapper(StudentMapper.class).queryByLearnNumber(i);
                sqlSession.commit();
            }catch (Exception e){
                e.printStackTrace();
                sqlSession.rollback();
            }finally {
                MybatisUtil.closeSqlSession(sqlSession);
            }
            return list;
        }


    }
