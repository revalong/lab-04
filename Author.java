package unl.cse.library;
/**
 * Models an author of a book
 *
 */
	public class Author {
	
	private String firstName;   
	private String lastName;
	public Author(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public Author() {
		String firstName="";
		String lastName="";
	}

	public String getFirstName() {
		return this.firstName;
		}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		}
	public String getFirstLastName() {
		return this.lastName + "," + this.firstName;
	}
}
