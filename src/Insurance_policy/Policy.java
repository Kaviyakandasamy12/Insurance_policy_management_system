package Insurance_policy;
import java.util.*;
public class Policy {
    private int p_id;
    private String p_name;
    private double pre_amount;
    private String coverage;
    private int duration;
    public Policy(int p_id,String p_name,double pre_amount,String coverage,int duration){
        this.p_id = p_id;
        this.p_name = p_name;
        this.pre_amount = pre_amount;
        this.coverage = coverage;
        this.duration = duration;
    }
    public int getP_id(){
        return p_id;
    }
    public String getP_name(){
        return p_name;
    }
    public double getPre_amount(){
        return pre_amount;
    }
    public String getCoverage(){
        return coverage;
    }
    public int getDuration(){
        return duration;
    }

}
