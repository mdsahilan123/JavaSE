package methodOverRiding;

//This is the initial form to be rendered in browser
public class EmployeApprasialForm {
	public String typeofform = "Employe HTML apprasial From";

	// Defining the logic to prepare the employee in browser window
	public String getEmployeform() {
		return "EmployeApprasialForm  using HTML code";
	}

	public void display() {
		System.out.println("Display::");
	}

	public String geTypeofForm() {
		return "type of form";
	}
}
