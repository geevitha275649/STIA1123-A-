
	public class ProtonX50 extends ProtonX70{

		private String park;


		ProtonX50(){
		this.park= "Auto Park";

		}

		public void parking() {
		System.out.println("Auto Parking assists\n" + park);
		}

		//getter method for park
				public String getpark () {
					return park;
				}
				
				//setter method for park
				public void setpark (String park) {
					this.park = park;
				}
				
		
		
		
		
	}

