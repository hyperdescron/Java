package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marve", 13, 85, 8, 1);
        Student student2 = new Student("Dave", 10, 65, 5, 2);
        Student student3 = new Student("Jackson", 8, 45, 2, 3);
        student.sleep(); // We declared sleep method in Human class
        // Override it in Student class



    }
}
