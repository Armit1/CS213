

public class Book {
    private String number;
    private String name;
    private boolean checkedOut;
    private Date datePublished;
    private int serial = 10000;

    public Book() {

    }

    public Book(String name, Date datePublished) {
        serial++;
        this.number = "Book#" + serial;
        this.name = name;
        this.checkedOut = false;
        this.datePublished = datePublished;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        // check whether book is checked out or not when returning string
        if (checkedOut == false)
            return "Book#" + number + "::" + name + "::" + datePublished + "::is available.";
        else
            return "Book#" + number + "::" + name + "::" + datePublished + "::not available.";
    }

    // getters and setters

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the checkedOut
     */
    public boolean isCheckedOut() {
        return checkedOut;
    }

    /**
     * @param checkedOut the checkedOut to set
     */
    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    /**
     * @return the datePublished
     */
    public Date getDatePublished() {
        return datePublished;
    }

    /**
     * @param datePublished the datePublished to set
     */
    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

}
