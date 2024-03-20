package Insurance_policy;
import java.util.*;
public class Home {
    public static void main(String args[]){
        int option =0;
        Scanner sc = new Scanner(System.in);
        Purchase purchase ;
        Purchased_detail purd = new Purchased_detail() ;
        Policy_Details pd = new Policy_Details();
        do{
            menu();
            option = sc.nextInt();
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    pd.display_Policies();
                    break;
                case 4:
                    System.out.println("Enter user Id: ");
                    int uid = sc.nextInt();
                    System.out.println("Enter Policy id: ");
                    int pid = sc.nextInt();
                    System.out.println("Enter payment id :");
                    int payid = sc.nextInt();
                    purchase = new Purchase(uid,pid,payid);
                    purd.add(purchase);
                    System.out.println("Purchased succesfully");

                    break;
                case 5:
                    System.out.println("Enter the  user id :");
                    int a = sc.nextInt();
                    purd.find(a);
                    break;
                case 10:
                    System.out.println("Thankyou for visiting...Good Bye!");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }while(option!=10);
    }
    public static void menu(){
        System.out.println("Enter 1 to Login as existing user");
        System.out.println("Enter 2 to register a new user");
        System.out.println("Enter 3 to display all the policies");
        System.out.println("Enter 4 to purchase a Policy");
        System.out.println("Enter 5 to see the purchased policies");
        System.out.println("Enter 10 to exit");
        System.out.println("Enter your choice: ");
    }
}
