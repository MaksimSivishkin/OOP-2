import java.util.ArrayList;


public class Start {
    public static void main(String[] args) {
        ArrayList<Integer> grades=new ArrayList<>();
        Student student=new Student("Max", grades);
        grades.add(1);
        grades.add(0);
        grades.add(21);
        grades.remove(1);
        student.addGrade(5);
        student.addGrade(5);
        student.addGrade(5);
        student.addGrade(5);


        System.out.println(student);
    }
}