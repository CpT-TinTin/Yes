public class ConcreteMixer extends Equipment {
   public ConcreteMixer(String requirments){
        super(requirments);
   }
   public String toString(){
       return "It is "+requirment;
   }
   public String getS()
   {
       return requirment;
   }
    public boolean equals(Object Other){
       if (Other instanceof ConcreteMixer){
           ConcreteMixer that=(ConcreteMixer) Other;
           return this.requirment.equals(that.requirment);
       }
       return false;
    }

}
