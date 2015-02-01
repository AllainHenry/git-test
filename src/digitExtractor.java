
public class digitExtractor {

	int tNumber = 0;
	String sNumber = "";
	
	public digitExtractor(int numberSequence) {
		// TODO Auto-generated constructor stub
		tNumber = numberSequence;
	}public digitExtractor(String numberSequence) {
		// TODO Auto-generated constructor stub
	
		sNumber = numberSequence;
	}
	
	public void returnInvertedOrderByMath(){
		
		int Integer1 = 0;
		int Integer2 = 0;
		int Integer3 = 0;
		int Integer4 = 0;
		int Integer5 = 0;
		Integer1 = (tNumber % 10);
		Integer2 = (tNumber % 100) / 10;
		Integer3 = (tNumber % 1000) / 100;
		Integer4 = (tNumber % 10000) / 1000;
		Integer5 = (tNumber % 100000) / 10000;
		
		System.out.println(Integer1 + "\n" + Integer2 + "\n" + Integer3 + "\n" + Integer4 + "\n" + Integer5 );
		
		/*
		 * input 12345
		 * return
		 * math round modulo%
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 
		 */
		
	}
	public void returnInvertedOrderByString(){
		char part1;
		char part2;
		char part3;
		char part4;
		char part5;
		
		//12345
		part1 = sNumber.charAt(4);
		part2 = sNumber.charAt(3);
		part3 = sNumber.charAt(2);
		part4 = sNumber.charAt(1);
		part5 = sNumber.charAt(0);
		
		System.out.println(part1 + "\n" + part2 + "\n" + part3 + "\n" + part4 + "\n" + part5);
		
	}
}
