package delectable.delectable;

public class Admin {
	
	int surcharge = 5;
	
	public Admin(){
		
	}
	
	public Admin(int surcharge){
		this.surcharge = surcharge;
	}
	
	
	
	public int getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(int surcharge) {
		this.surcharge = surcharge;
	}
}
