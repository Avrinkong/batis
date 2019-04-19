package com.it.main;

import com.it.domain.Student;
import com.it.serviceImpl.StudyImpl;
import org.junit.Test;

import java.util.List;

public class StudentTest {

   StudyImpl study = new StudyImpl();
   Student student = new Student();
   //添加学生
   @Test
   public void add(){
      student.setStudent_Name("蓝腮");
      student.setLaerning_Number(418);
      int i = study.addStudent(student);
      System.out.println(i);
   }

   //删除学生
   @Test
   public void delete(){
      boolean delete = study.delete(6);
      System.out.println(delete);
   }

   //修改学生信息
   @Test
   public void update(){
      student.setStudent_Id(5);
      student.setStudent_Name("蓝腮");
      student.setLaerning_Number(510);
      boolean update = study.update(student);
      System.out.println(update);
   }

   //查找所有学生信息
   @Test
   public void findAll(){
      List<Student> all = study.findAll();
      for (Student s :all){
         System.out.println(s);
      }
   }

   //通过学生姓名查找学生信息
   @Test
   public void findByStuN(){
      student.setStudent_Name("蓝腮");
      List<Student> byName = study.findByName(student.getStudent_Name());
      for (Student s:byName){
         System.out.println(s);
      }
   }

   //通过学生学号查找学生信息
   @Test
   public void findByLN(){
      student.setLaerning_Number(510);
      List<Student> byLearnNumber = study.findByLearnNumber(student.getLaerning_Number());
      for (Student s :byLearnNumber){
         System.out.println(s);
      }
   }
}
