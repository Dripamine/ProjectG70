//------------------------------------------------
// ProjectB, Programming 2
// © Boudribila
// Written by: Boudribila, Mohamed Amine / 1665604
//  This Java file represents the date object and provides methods for validating and manipulating dates.
//------------------------------------------------

package projectB;

public class Date implements Comparable<Date> {
	// initializing instance variables
	private int month;
	private int day;
	private int year;

	// parameter constructor with DateOK method called
	public Date(int month, int day, int year) {
		if (dateOK(month, day, year)) {
			this.month = month;
			this.day = day;
			this.year = year;
		} else {
			this.month = 1;
			this.day = 1;
			this.year = 1900;
		}
	}

	// date checker method
	public boolean dateOK(int month, int day, int year) {
		if (year >= 1000 && year <= 9999 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
			return true;
		}
		return false;
	}

	// getters and setters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// method to return the date in a string format
	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	// method to compare and sort Date
	@Override
	public int compareTo(Date otherDate) {
		if (this.year < otherDate.year) {
			return -1;
		} else if (this.year > otherDate.year) {
			return 1;
		} else {
			if (this.month < otherDate.month) {
				return -1;
			} else if (this.month > otherDate.month) {
				return 1;
			} else {
				if (this.day < otherDate.day) {
					return -1;
				} else if (this.day > otherDate.day) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
}
