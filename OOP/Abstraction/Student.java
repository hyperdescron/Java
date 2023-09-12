package OOP.Abstraction;

public class Student extends Human{
   

    public Student(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void study() {
        System.out.println(name + " is studying");
        
    }

    @Override
    public void sleep(){
        System.out.println(name +" is sleeping");
    }




  

    
}
