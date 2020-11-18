public class ProtonX70 extends Proton{
		
		private String autoPilot;
		
		ProtonX70(){
			this.autoPilot = "Auto park";
		}
		
		public void pilot() {
			System.out.println("Auto parking assists\n" + autoPilot );
		}		
			

		//getter method for autopilot
		public String getautopilot () {
			return autoPilot;
		}
		
		//setter method for autopilot
		public void setautopilot (String myradio) {
			this.autoPilot = myradio;
		}
	}
		



