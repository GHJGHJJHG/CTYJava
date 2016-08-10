
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		
	}
	
	public Name(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public String getFirst() {return firstName;}
	public String getMiddle() {return middleName;}
	public String getLast() {return lastName;}
	
	public String lastFirstMiddle() {
		return lastName + ", " + firstName + ' ' + middleName;
	}
	
	public String initials() {
		return ((firstName.length() > 0) ? (firstName.charAt(0) + ". ") : "") +
				((middleName.length() > 0) ? (middleName.charAt(0) + ". ") : "") +
				((lastName.length() > 0) ? (lastName.charAt(0) + ". ") : "");
	}
	
	public int length() {
		return firstName.length() + middleName.length() + lastName.length();
	}
	
	public String toString() {
		return firstName + ' ' + middleName + ' ' + lastName;
	}
	
	public void setName(String first, String middle, String last)
	{
		firstName = first;
		middleName = middle;
		lastName = last;
	}

}
