package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		
		Email E1 = new Email("Nabin" ,"Dhakal");
		//E1.setAlternativeEmail("js@gmail.com");
		//System.out.println(E1.getAlternativeEamail());
		E1.ChangePassword("12345");
		System.out.println(E1.showinfo());
		
		
		
	}

}
