import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, ArrayList grades){
        this.name=name;
        this.grades=grades;
    }
    public void addGrade(int grade){
        if(grade<2||grade>5){
            throw new IllegalArgumentException("The grade must be at least 2 and no higher than 5");
        }
        grades.add(grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade<2||grade>5){
            throw new IllegalArgumentException("The grade must be at least 2 and no higher than 5");
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        for (Integer grade: grades){
            if(grade<2||grade>5){
                throw new IllegalArgumentException("The grade must be at least 2 and no higher than 5");
            }
        }
        this.grades = grades;
    }

    @Override
    public String toString() {
        return String.format("%s %s", name,grades);
    }
}
