package exercise11d;

public class Date {
    private int year;
    private int month;
    private int day;

 // Constructor - no parameters
    public Date(){
        this.year = 1960;
        this.month = 3;
        this.day = 7;
    }
 // Constructor - parameters
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

}
