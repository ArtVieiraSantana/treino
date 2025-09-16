
public class cursoclasse{
    public static void main(String[]args){
        

        var male = new person();
        male.setName("João");
        male.setAge(12);

        var female = new person();
        female.setName("Maria");
        female.setAge(10);

        System.out.printf("Male name:", male.getName());
        System.out.printf("Male age:", male.getAge());
        System.out.printf("female name: ", female.getName());
        System.out.printf("female", female.getAge());
    }
}