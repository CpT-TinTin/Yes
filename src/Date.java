public class Date {
    int day;
    int month;
    int year;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;

    }
    public String toString() {
        return day+"/"+month+"/"+year;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }


    public boolean equals(Object Other){
        if (Other instanceof Date){
            Date that=(Date) Other;
            return this.day==that.getDay()&&this.month==that.getMonth()&&this.year==that.getYear();
        }
        return false;
    }



}
