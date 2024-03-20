package Insurance_policy;
import java.util.*;
public class Purchase {

    private int userid;
    private int policyid;
    private int payment_id;
    public Purchase(int userid,int policyid,int payment_id){
        this.userid = userid;
        this.policyid = policyid;
        this.payment_id = payment_id;
    }

    public int getUserid(){
        return userid;
    }
    public int getPolicyid(){
        return policyid;
    }
}
