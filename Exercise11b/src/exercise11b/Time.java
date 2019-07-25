package exercise11b;

public class Time {
    private int hour;
    private int minute;
    private double second;


    /**
     * Constructor: Construct a Time object with given values
     */
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Over-ride toString method:Returns a String representation of the time
     */
    public String toString(){
        return String.format("%02d:%02d:%04.1f\n",
                this.hour, this.minute, this.second);
    }

    /**
     * Exercise 11.2 - Adds the given number of seconds to this object (modifier)
     */
    public void increment(double seconds){
        this.second += seconds ;
        if (this.second >= 60.0){
            this.minute += ( (int) (this.second))/60  ;
            this.second = this.second % 60 ;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60 ;
            this.minute = this.minute % 60 ;
        }
    }

}
