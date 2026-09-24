package session8.mft5;

public class Main {
    public static void main(String[] args) {
        Person person = Person
                .builder()
                .id(1)
                .name("ali")
                .family("alipour")
                .email("sa@GMAIL")
                .phone("0919521")
                .address("Trhran")
                .nationalId("1234")
                .build();

     //   person.setNationalId("1234");

//        person.setId(1);
//        person.setFamily("A");
//        person.setEmail("a@a.c");
//        person.setPhone("138-555-5555");
//        person.setName("N");
//        person.setAddress("SAdat abad");
//        System.out.println(person);




//        person.setId(1);
//        person.setName("ali");
//        person.setFamily("alipour");
//        person.setEmail("gmail.com");

//        Person person = new Person();
//
//        //Design----> Builder
//        person
//                .setId(1)
//                .setFamily("alipour")
//                .setEmail("gmail.com")
//                .setName("alli");
//
//        //pretty format = alt+ctrl+l
//
    }
}
