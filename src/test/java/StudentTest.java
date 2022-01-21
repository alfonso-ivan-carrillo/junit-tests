import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class StudentTest {
    private String expectedName;
    private long expectedId;
    private Student student;


    @Before
    public void setup(){
        this.expectedName = "ethan";
        this.expectedId = 121212;
        this.student = new Student("ethan", 121212);
        this.student.grades.add(90);
        this.student.grades.add(90);
        this.student.grades.add(90);
    }

    @Test
    public void testForGetName(){
//        Student ethan = new Student("ethan", 121212);
////        System.out.println(ethan.toString());
//        this.student.grades.add(90);
//        this.student.grades.add(80);
//        this.student.grades.add(90);
        Assert.assertEquals(this.expectedName, this.student.getName());
    }

    @Test
    public void testForGetId(){
//        Student ethan = new Student("ethan", 121212);
//        System.out.println(ethan.toString());
//        ethan.grades.add(90);
//        ethan.grades.add(80);
//        ethan.grades.add(90);
        Assert.assertEquals(this.expectedId, this.student.getId());
    }

    @Test
    public void testForGetGrades(){
        ArrayList<Integer> grades = this.student.getGrades();
        Assert.assertEquals(grades, this.student.getGrades());
    }

    @Test
    public void testForAddGrade(){
        Assert.assertEquals(3, this.student.getGrades().size());
        this.student.addGrade(100);
        Assert.assertEquals(4, this.student.getGrades().size());
    }

    @Test
    public void testForGetGradeAverage(){
        Assert.assertEquals(90, this.student.getGradeAverage(), 0);
        this.student.addGrade(100);
        Assert.assertEquals(92.5, this.student.getGradeAverage(), 0);
    }






}
