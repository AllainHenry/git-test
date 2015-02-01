

public class objectIntoTest {

	public static void main(String[] args){

		//String x = "Hello!!";
		objectIntro waterBottle = new objectIntro(0);// new water bottle with 0 water in it
		waterBottle.addWater(100);//add 100 liters of water
		//waterBottle.drinkWater(20);//drink 20 liters of water
		waterBottle.drinkWater(80);
		System.out.println("Your remaining water level is : " + waterBottle.getWater() + " liters");
	}
}
