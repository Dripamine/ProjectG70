//------------------------------------------------
// ProjectB, Programming 2
// © Boudribila
// Written by: Boudribila, Mohamed Amine / 1665604
//  This Java file defines the Employee class with attributes and also introduces getters, setters, and a toString method.
//------------------------------------------------

package projectB;

public class Employee {
	// initializing instance variables
	private String name;
	private int id;
	private Date hiredDate;
	private String position;

	// parameter constructor
	public Employee(String name, int id, Date hiredDate, String position) {
		this.name = name;
		this.id = id;
		this.hiredDate = hiredDate;
		this.position = position;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	//method to return employee info in a string
	@Override
	public String toString() {
		return "Name: " + name + ", ID: " + id + ", Hired Date: " + hiredDate + ", Position: " + position;
	}
}
