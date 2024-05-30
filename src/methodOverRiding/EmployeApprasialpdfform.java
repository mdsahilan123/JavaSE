package methodOverRiding;
 //this class created as Enhancement for downloading Employee form as PDP
public class EmployeApprasialpdfform extends EmployeApprasialForm  {
    @Override
	public String getEmployeform() {
		return super.getEmployeform();
	}
    public String getTypeForm() {
    	return "type of form";
    }
}
