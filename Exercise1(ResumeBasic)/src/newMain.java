
public class newMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		biodata b = new biodata(); //create new object from personal class
		cgpa q = new cgpa();
		results r = new results();
		talents t = new talents();
		workSkills s = new workSkills();
		workExperiences e = new workExperiences();
		
	//System.out.println("My name is " + p.name);
	b.printName();
	
	q.printCGPA();
	
	r.printresults();
	
	t.printtalents();
	
	s.printworkSkills();
	
	e.printworkExperiences();
	
	q.printGPA();
	System.out.println("Final CGPA " + q.calculateCGPA());
	
	

	}

}
