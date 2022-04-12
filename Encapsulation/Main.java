package Java.Encapsulation;

// Encapsulamento é uma maneira de atribuir variáveis a uma classe
// Passando as mesmas de maneira segura e dinamica para os métodos
// O encapsulamento é feito atravéz de métodos getters e setters

public class Main {
    
    public static void main(String[] args) {
        
        Student list = new Student();

        list.setAge(24);
        list.setName("Enzo");
        
        System.out.println("Student Name: " + list.getName());
        System.out.println("Student Age: " + list.getAge());
    }
}
