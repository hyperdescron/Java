package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Abstraction is hiding details from users and showing only important data
        Student student = new Student("Kagan");
        Student student2 = new Student("Aleyna");
        Student student3 = new Student("Adam");
        

        student.study();
        student2.study();
        student3.study();
        student.sleep();

        // We cannot instantiate Human class because it is an abstract class
        // This is the point of Abstraction
        // We don't want users to create Humans we want them to create Students

        // A vehicle example has the same logic
        // We wouldn't search for vehicles we would search for cars or boats or bicycles etc.
        // They all would extend the vehicle class so that we don't have to specify
        // same common attributes thus avoiding duplicate code
        // It is important to know when to use abstraction



       
    }
}
