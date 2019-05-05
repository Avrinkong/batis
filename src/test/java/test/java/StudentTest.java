package test.java;

import com.it.pojo.Student;
import com.it.service.Study;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;
import java.util.List;

public class StudentTest {

    ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
    Study study = (Study) applicationContext.getBean("studyImpl");
   Student student = new Student();
   //添加学生
   @Test
   public void add(){

      student.setStudent_Name("蓝4");
      student.setLaerning_Number(418);
      int i = study.addStudent(student);
      System.out.println(i);
   }

   //删除学生
   @Test
   public void delete(){
      boolean delete = study.delete(101010);
      System.out.println(delete);
   }

   //修改学生信息
   @Test
   public void update(){
       student.setStudent_Id(10);
       student.setStudent_Name("老黑");
       student.setLaerning_Number(222);
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
      student.setStudent_Name("老黑");
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

   //批量插入
    @Test
    public void addAll2(){
        long start=System.currentTimeMillis();
       for (int j= 0; j <1000 ; j++) {

          List<Student> list = new LinkedList<Student>();
          for (int i = 0; i <1000 ; i++) {
             Student student1=new Student();
             student1.setStudent_Name("测试"+ i);
             student1.setLaerning_Number(i);
             list.add(student1);
          }
          boolean b = study.addAll1(list);

       }
       long end =System.currentTimeMillis();
       System.out.println("插入100万条数据需要"+(end - start)/1000+"秒");
    }

    @Test
    public void add2(){

        study.update(student);
    }
}
