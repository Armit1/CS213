
public class Date {
	// the attributes are restricted to those given in the project documents
	private String year;
	private String month;
	private String day;

	public Date(String date) {
		String[] dateSegments = date.split("/");

		this.month = dateSegments[0];
		this.day = dateSegments[1];
		this.year = dateSegments[2];
	}

	public Date() {

	}

	public boolean isValid() {
		int dayToInt = Integer.parseInt(day);
		int monthToInt = Integer.parseInt(month);
		int yearToInt = Integer.parseInt(year);

		if ((month.length() == 2 && day.length() == 2 && year.length() == 4) && (monthToInt <= 12 && monthToInt >= 1)
				&& (dayToInt <= 31 && dayToInt >= 1) && (yearToInt <= 2021 && yearToInt > 999))
			return true;

		return false;
	}

}
