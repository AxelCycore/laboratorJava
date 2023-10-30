package lab4;

public class Laborator4 {
    public static void main(String[] args){
        Person person=new Person();
        Professor professor=new Professor();
        Student student=new  Student();

        person.setAge(10);
        person.setName("Alex");
        person.setEmail("ceva@yahpp.com");
    }
    public static void pro(String cuvant){
        int lungime = cuvant.length();

        if(lungime%2==0){
            System.out.println(cuvant.charAt(lungime/2-1));
            System.out.println(cuvant.charAt(lungime/2));
        }
        else
            System.out.println(cuvant.charAt(lungime/2));


    }

    private static void doi(int nr){
        while (nr>0){
            System.out.println(nr%10);
            nr=nr/10;
        }
    }
}