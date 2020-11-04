
public class biodata {
	String name, gender, birthday, citizenship, marital_status, address, phone;
	int age;
	
	
	biodata(){
		
		this.gender= "Female";
		this.birthday= "28th October 1998";
		this.age = 22;
		this.citizenship = "Malaysian";
		this.marital_status= "Single";
		this.address= "No.95 Taman Maharani, 36000 teluk Intan, Perak";
		this.phone = "014-6256553";
	}
	
	public biodata(String n){
		
		this.name=n;
		
	}
	
	public void printbiodata(){
	
		biodata n = new biodata("Geevitha Batumalai");
		
		
		System.out.println("\nName         : "+n.name);
		System.out.println("Gender       : "+gender);
		System.out.println("Date of Birth: "+birthday);
		System.out.println("Age          :"+age);
		System.out.println("Citizenship  : "+citizenship);
		System.out.println("Marital Status: "+marital_status);
		System.out.println("Address: " +address);
		System.out.println("Hand Phone   : "+phone);
		
	}

}
