package Insurance_policy;
import java.util.*;
public class Policy_Details {
    ArrayList <Policy> pl = new ArrayList<>() ;
    public  Policy_Details(){
        Policy pl1 = new Policy(1,"Car_policy",1000.3,"car coverage",3);
        Policy pl2 = new Policy(2,"Health policy",2000.3,"health coverage",5);
        Policy pl3 = new Policy(3,"Bike_policy",500.3,"bike coverage",4);
        pl.add(pl1);
        pl.add(pl2);
        pl.add(pl3);
    }
    public void display_Policies(){
        for(Policy p : pl){
            System.out.println("Policy id :"+ p.getP_id()+" Policy name: "+p.getP_name()+" Premium amount: "+p.getPre_amount()+" Coverage: "+p.getCoverage()+" Duration: "+p.getDuration());
        }
    }

}
