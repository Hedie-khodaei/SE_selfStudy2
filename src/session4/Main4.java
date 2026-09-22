package session4;

public class Main4 {
    public static void main(String[] args) throws Exception {
        Student a = new Student();
        a.code =1;
        a.name = "ali";
        a.family = "alipour ";

        Student b = a;
        Student c = b;



        a.name ="mohsen";
        b.family = "mesbah";
        c.family = "Aaaaaa";
        
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
