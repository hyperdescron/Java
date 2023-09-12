package OOP.Encapsulation;

public class Student {
    private int id; // Using private method to 
    private String name; // Hide these variables 
    private int age; // From other classes

    public Student() { // Empty constructor

    }

    public Student(int id, String name, int age) { // Constructor with parameters
        this.id = id;
        this.name = name;
        this.age = age;
    }


    // Here we are making these methods public
    // So that we can call these methods from another class
    // Here we are preventing user from changing data by assigning it to another variable
    // Instead we will call this setter method to achieve encapsulation
    public void setId(int id){ 
        this.id=id;
    }


    // Here we are making these methods public
    // So that we can call these methods from another class
    // Here we are preventing user from accessing data by name
    // Instead we will call this getter method to achieve encapsulation
    public int getId(){ 
        return id;
    }
     // Rest goes the same
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Here we are overriding a method to print the values of an object
    // If one observes the source code of toString method
    // You will see that it has another implementation it comes from Object class
    // Here we are overriding it and give it another meaning so that it prints the values we want to see
    // All objects extends Object class which is called another OOP principle Inheritance
    // That way we can see the methods of Object class when we create an object
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    

    
    

    
}
