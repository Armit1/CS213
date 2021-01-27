

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
    public Date() {
        
    }
    public boolean isValid() {
        
    }

}
