package session8.mft3;
//اینو نمیشه اینتر فیس کرد چون دارای پراپرتی و متد با بدنه هستش

public abstract class Person {

    private int id;
    private String name;
    private WeekDay day;

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public String toString() {
        return "man to string hastam";
    }

 //   @Override
   // protected void finalize() throws Throwable {
     //   super.finalize();

}
