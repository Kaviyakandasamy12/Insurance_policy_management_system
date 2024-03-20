package Insurance_policy;
import java.util.*;
public class Purchased_detail {
    ArrayList<Purchase> purchased = new ArrayList<>();
    public Purchased_detail(){

    }
    public void add(Purchase purchase){
        purchased.add(purchase);
    }
    public void display(){
        if(purchased.size()==0){
            System.out.println("No policies purchase");
        }
        else{
            for(Purchase p : purchased){
                System.out.println("User id : "+p.getUserid()+" Policy id :"+p.getPolicyid());
            }
        }
    }
    public void find(int a){
        if(purchased.size()==0){
            System.out.println("No policies purchase");
        }
        else{
            int f =0;
            for(Purchase p : purchased){
                if(p.getUserid() == a){
                    System.out.println("User id : "+p.getUserid()+" Policy id :"+p.getPolicyid());
                }
            }
        }

    }
}
