
public class newMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//biodata

	
		 biodata b1 = new biodata();
		 cgpa     obj1 = new cgpa();
		
		
		 b1.printbiodata();
		 obj1.printcgpa();
		
		
		
		
		
		
		//Workskills
		
		workSkills1 obj3 = new workSkills1();
		System.out.println ("Work Experience : " + obj3.experience);
		System.out.println ("Skills : " + obj3.skills);
	
		workSkills1 obj4 = new workSkills1("1) Active listener \n        2) Can make standard academic video");	
	    System.out.println("Talent :"  + obj4.talents);
	
	}

}
