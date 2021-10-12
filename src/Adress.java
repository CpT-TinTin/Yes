public class Adress {
    String street;
    int number;
    String zipCode;
    String city;
    public Adress(String street, int number, String zipCode, String city)
    {
        this.street=street;
        this.number=number;
        this.zipCode=zipCode;
        this.city=city;

    }
    public String toString()
    {
        return "The street is " + street + " at the number " + number +" Zipcode "+zipCode+" City " +city;

    }
    public int getNumber()
    {
        return this.number;
    }
    public String getStreet(){
        return this.street;
    }
    public String getZipCode(){
        return this.zipCode;
    }
    public String getCity(){
        return this.city;
    }
    public boolean equals(Object Other)
    {
        if (Other instanceof Adress)
        {
            Adress that= (Adress) Other;
            return this.street.equals(that.street)&&this.number==that.number&&this.zipCode.equals(that.zipCode)&&this.city.equals(that.city);
        }
        return false;
    }

}
