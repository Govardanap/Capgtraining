interface LibraryUser{
	void registerAccount();
	void requestBook();
}
class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have sucessfully registered under a Kids Account ");
			
		}
		else {
			System.out.println("Sorry,Age must be less than 12 to register as a kid ");
		}
	}
	public void requestBook() {
		if(bookType=="Kids") {
			System.out.println("Book issued succesfully, please return the book within 10 days ");
		}
		else {
			System.out.println("Oops,you are allowed to take only kids books ");
		}
	}
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount() {
		if(age>12) {
			System.out.println("Ypu have successfully registered under an Adult Account ");
			
		}
		else {
			System.out.println("Sorry,Age must be greater than 12 to register as an adult ");
		}
	}
	public void requestBook() {
		if(bookType=="Fiction") {
			System.out.println("Book issued successfully,please return the book within 7 days ");
		}
		else {
			System.out.println("Oops,you are allowed to take only adult Fiction books ");
		}
	}
}
public class LibraryInterfaceDemo {
	public static void main(String args[]) {
		KidUsers k = new KidUsers();
		k.age=10;
		k.registerAccount();
		k.age=18;
		k.registerAccount();
		k.bookType="Kids";
		k.requestBook();
		k.bookType="Fiction";
		k.requestBook();
		AdultUser a=new AdultUser() ;
		a.age=5;
		a.registerAccount();
		a.age=23;
		a.registerAccount();
		a.bookType="Kids";
		a.requestBook();
		a.bookType="Fiction";
		a.requestBook();	
	}

}
