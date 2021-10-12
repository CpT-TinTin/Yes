import java.util.ArrayList;
import java.util.List;

public class Job {
    private int jobNumber;
    private Adress location;
    private String description;
    private List<Equipment> requiredEquipement;
    private Date plannedDate;
    static int jobTotal=0;
    public Job(Adress location,String description,List<Equipment> requiredEquipement,Date plannedDate ){
        this.location=location;
        this.description=description;
        this.requiredEquipement=new ArrayList<Equipment>() ;
        this.plannedDate=plannedDate;
        jobTotal++;
        this.jobNumber=jobTotal;
    }
    public int getJobNumber() {
        return jobNumber;
    }
    public Adress getLocation(){
        return location;
    }
    public String getDescription(){
        return description;
    }
    public List<Equipment> getRequiredEquipement(){
        return requiredEquipement;
    }
    public Date getPlannedDate(){
        return plannedDate;
    }
    public int getJobTotal(){
        return jobTotal;
    }
    public String toString(){
        ///return "Number: "+jobNumber+" At: "+location.getNumber()+" "+" "+location.getStreet()+" "+location.getZipCode()+" "+location.getCity()+" You have to do "+description+" With the "+requiredEquipement+"at the "+plannedDate;
        return "Number: "+jobNumber+" At: "+location.toString()+" You have to do "+description+" With the "+requiredEquipement+"at the "+plannedDate;
    }
    public boolean equals(Object Other){
        if (Other instanceof Job){
            Job that= (Job) Other;
            return this.jobNumber==that.getJobNumber() &&
                    this.description.equals(that.description) &&
                    this.requiredEquipement.equals(that.requiredEquipement)&&
                    this.plannedDate.equals(that.plannedDate) &&
                    this.jobTotal==that.getJobTotal();
        }
        return false;
    }



}
