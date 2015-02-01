public class objectIntro {

	int tWater = 0; // this is how much water in water bottle
	
	public objectIntro(){
		//default constructor
	}

	public objectIntro(int waterAmount){
		tWater = waterAmount;
	}
	
	
	public void addWater(int amount){
		tWater = tWater + amount;
	}
	
	public void drinkWater(int amount){
		tWater = tWater - amount;
	}
	
	public int getWater(){
		return tWater;
	}
}
