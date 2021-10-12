import java.util.ArrayList;
import java.util.List;

public class JobCatalog {
    List<Job> jobs;
    public JobCatalog(){

        this.jobs= new ArrayList<Job>();
    }
    public String toString(){
        return jobs.toString();
    }
    public boolean equals(Object Other){
        if (Other instanceof JobCatalog){
            JobCatalog that =(JobCatalog) Other;
            return this.jobs.equals(that.jobs);
        }
        return false;
    }

}
