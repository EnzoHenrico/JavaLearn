package JavaLearn.Encapsulamento;

public class Student {

    private String name;
    private int age;

    // Getters
    public String getName(){
        
        return name;
    }
    public int getAge(){

        return age;
    }

    public void setName(String newName){

        name = newName;
    }

    // Setters
    public void setAge(int newAge){

        age = newAge;
    }    
}
