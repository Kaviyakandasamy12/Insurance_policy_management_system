package Insurance_policy;
import java.util.*;
public class Users {
    ArrayList<Person> users = new ArrayList<>();
    public Users(){
        Person p1 = new Person(1,"Jhon","jhon@gmail.com",1234556);
        Person p2 = new Person(2,"alex","alex@gmail.com",124556);
        Person p3 = new Person(3,"Robert","robert@gmail.com",12334556);
        users.add(p1);
        users.add(p2);
        users.add(p3);
    }
}
