public class ScaffoldingTower extends Equipment{
    public ScaffoldingTower(String requirment) {
        super(requirment);
    }
    public String getS(){
        return requirment;
    }
    public String toString(){
        return "It     s gets"+requirment;
    }

    public boolean equals(Object Other){
        if (Other instanceof ScaffoldingTower)
        {
            ScaffoldingTower that= (ScaffoldingTower) Other;
            return this.requirment.equals(that.requirment);
        }
        return false;
    }
}
