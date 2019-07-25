package exercise2c;

public class Main {

    public static void main(String[] args) {
        int hour , minute, second;
        double secTotal, secRem, percent ;
        int currenthour, currentminute, currentsecond, timespentH, timespentM, timespentS;
        hour = 21 ;
        minute = 20 ;
        second = 50 ;
        secTotal = (hour * 60 * 60) + (minute * 60) + second; // calculate seconds since midnight

        secRem = (24 * 60 * 60) - secTotal ; // calculate seconds remaining in day

        percent = ((secTotal - secRem)/secTotal)*100.0 ;

        System.out.println("Number of seconds since midnight:" + (int)(secTotal));
        System.out.println("Number of seconds remaining in the day:" + (int)(secRem));
        System.out.print("Percentage of day that has passed:");
        System.out.printf("%.2f" , percent);
        System.out.println(" %");

        currenthour = 21 ;
        currentminute = 46 ;
        currentsecond = 10 ;
        timespentH = currenthour - hour ;
        timespentM = Math.abs(currentminute - minute) ;
        timespentS = Math.abs(currentsecond - second) ;
        System.out.println("Time spent on this exercise is " + timespentH +
                " hours " + timespentM + " minutes and " + timespentS + " seconds");

    }
}

