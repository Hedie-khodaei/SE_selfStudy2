package session6;

public class Student {

    private  int id;
    private String name;
    private String family;
    private  String  nationalCode;
    private String address;
    private String phone;
    private String email;
    private String username;
    private String password;

    public Student(int id, String name, String family, String nationalCode , String phone) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.phone = phone;
    }

    public Student(String name, String family) {
    }

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Student setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public Student setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Student setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //متد سازنده
    //counstractor no Argumant
    //public Student(){}
    
    //counstractor +parametr  or Argumant  or noArgumant
//    public Student (String name, String family){// داخل پانتز میگیم آرگومان
//      //  System.out.println("+++= Created"); //زمانی که درحافظه تعریف شد
//  //  public void getAllData(String n , String f ){
//      this.name   = name;
//        this.family = family;
//    }





    //Encapsulation
    //Fields ->private ->getter/ setter

//    String getName(){return name;}
//
//    void setName(String n){name = n;}
//
//    String getFamily(){return family;}
//    void setFamily(String f){family = f;}









//  //  String getFullName(){
//   //     return name + " " + family;
//  //  }
//
//    //بازنویسی متد
//    //@ Annotation  عملیات + توضیح  اجباری نیست
//    @Override
//     public String toString(){
//        return  name+" "+family;
//
//        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
//     }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("+++ Deleted"); //ازحافظه پاک شد

}
