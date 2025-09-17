
public class Main{
    
    public static void main(String[]args){
        
        var male = new Person();
        male.name = "João";
        male.age = 12;

        var female = new Person();
        female.name = "Maria";
        female.age = 11;

        System.out.println("Male name: " + male.getName() + "male age: " + male.teste());
        System.out.println("female name: " + female.getName() + "female age: " + female.getAge());
    }
}