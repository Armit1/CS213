import java.util.Calendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(String date) {
        String[] dateSegments = date.split("/");
        this.month = Integer.parseInt(dateSegments[0]);
        this.day = Integer.parseInt(dateSegments[1]);
        this.year = Integer.parseInt(dateSegments[2]);
    }

    //return todays date
    public Date() {
        Calendar today = Calendar.getInstance();
        this.month = today.MONTH;
        this.day = today.DAY_OF_MONTH;
        this.year = today.YEAR;
    }
    /*
     * public boolean isValid() {
     * 
     * }
     */
    
    @Override
    public String toString() {
        
    }
    public static void main(String[] args) {

    }
}
