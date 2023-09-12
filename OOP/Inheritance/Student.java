package OOP.Inheritance;

// Every student is derived from Human class
// Extends keyword implies that Student class inherits the methods and attributes from Human class
// This is called Inheritance
public class Student extends Human{
    private int grade;
    private int id;


    public Student(String name, int age, int weight, int grade, int id) {
        // Since we inherited from Human class we can use Human classes constructor
        super(name, age, weight); // Super keyword is a reference to human constructor
        this.grade = grade;
        this.id = id;
    }


    public int getGrade() {
        return grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student [grade=" + grade + ", id=" + id + "]";
    }

    @Override
    public void sleep(){
        System.out.println("Student is sleeping");
    }


    


    



}
