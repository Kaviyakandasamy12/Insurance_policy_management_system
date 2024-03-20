package Insurance_policy;
import java.util.*;
public class Person {
    private int id;
    private String name;
    private String email;
    private int mobNo;
    public Person(int id,String name,String email,int mobNo){
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobNo = mobNo;
    }
    public int getId(){
        return id;
    }
}
