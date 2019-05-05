package com.it.pojo;

public class Student {
    private Integer student_Id;
    private Long create_At;
    private Long update_At;
    private String student_Name;
    private Integer student_Qq;
    private String student_Type;
    private Long learning_Time;
    private String School;
    private Integer laerning_Number;
    private String learning_Url;
    private String Dream;
    private String Teacher;



    public Integer getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(Integer student_Id) {
        this.student_Id = student_Id;
    }

    public Long getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Long create_At) {
        this.create_At = create_At;
    }

    public Long getUpdate_At() {
        return update_At;
    }

    public void setUpdate_At(Long update_At) {
        this.update_At = update_At;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public Integer getStudent_Qq() {
        return student_Qq;
    }

    public void setStudent_Qq(Integer student_Qq) {
        this.student_Qq = student_Qq;
    }

    public String getStudent_Type() {
        return student_Type;
    }

    public void setStudent_Type(String student_Type) {
        this.student_Type = student_Type;
    }

    public Long getLearning_Time() {
        return learning_Time;
    }

    public void setLearning_Time(Long learning_Time) {
        this.learning_Time = learning_Time;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public Integer getLaerning_Number() {
        return laerning_Number;
    }

    public void setLaerning_Number(Integer laerning_Number) {
        this.laerning_Number = laerning_Number;
    }

    public String getLearning_Url() {
        return learning_Url;
    }

    public void setLearning_Url(String learning_Url) {
        this.learning_Url = learning_Url;
    }

    public String getDream() {
        return Dream;
    }

    public void setDream(String dream) {
        Dream = dream;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Id=" + student_Id +
                ", create_At=" + create_At +
                ", update_At=" + update_At +
                ", student_Name='" + student_Name + '\'' +
                ", student_Qq=" + student_Qq +
                ", student_Type='" + student_Type + '\'' +
                ", learning_Time=" + learning_Time +
                ", School='" + School + '\'' +
                ", laerning_Number=" + laerning_Number +
                ", learning_Url='" + learning_Url + '\'' +
                ", Dream='" + Dream + '\'' +
                ", Teacher='" + Teacher + '\'' +
                '}';
    }
}
