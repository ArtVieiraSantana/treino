
public class Main{
    
    public static void main(String[]args){

        var male = new Person("João");
        male.incAge();

        var female = new Person("Maria");
        female.incAge();
        
        System.out.println("Male name: " + male.getName() + " male age: " + male.getAge());
        System.out.println("female name: " + female.getName() + " female age: " + female.getAge());
    }
}