public class JackHammer extends Equipment{
    public JackHammer(String requirment){
        super(requirment);
    }
    public String toString(){
        return "Its this "+requirment;
    }
    public String get(){
        return requirment;
    }
    public boolean equals(Object Other){
        if (Other instanceof JackHammer)
        { JackHammer that =(JackHammer) Other;
            return  this.requirment.equals(that.requirment);
        }
        return false;

    }


}
