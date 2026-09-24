package session8.mft5;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class Person {

    private int id;
    private String name;
    private String family;
    private String email;
    private String phone;
    private String address;


    @Setter(AccessLevel.NONE)
     private String nationalId;
}






//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", family='" + family + '\'' +
//                ", email='" + email + '\'' +
//                ", phone='" + phone + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

