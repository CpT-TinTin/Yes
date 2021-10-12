public class Torch extends Equipment{

    public Torch(String requirments)
    {
        super(requirments);
    }
    public String get(){
        return this.requirment;
    }
    public String toString()
    {
        return "Its gets "+this.requirment;
    }
    public boolean equals(Object Other){
        if (Other instanceof Torch){
            Torch that= (Torch) Other;
            return this.requirment.equals(that.requirment);

        }
        return false;
    }
}
