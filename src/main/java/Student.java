import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades = grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade : this.grades){
            sum += grade;
        }
        return sum/this.grades.size();
    }

    public static void main(String[] args) {
        Student ethan = new Student("ethan", 121212);
        ethan.grades.add(90);
        ethan.grades.add(80);
        ethan.grades.add(90);
        ethan.addGrade(100);

        System.out.println(ethan.getId());
        System.out.println(ethan.getName());
        System.out.println(ethan.getGrades());
        System.out.println(ethan.getGradeAverage());
    }
}
