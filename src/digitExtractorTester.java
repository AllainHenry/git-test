import java.util.Scanner;
//import javax.print.DocFlavor.INPUT_STREAM;

public class digitExtractorTester {

	static Scanner input = new Scanner(System.in);// java needs this line 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Welcome to the digit extractor!! Please enter 5 digits ");
		String in = input.nextLine();
		System.out.println("Mathematically");
		digitExtractor demath = new digitExtractor(Integer.parseInt(in));
		demath.returnInvertedOrderByMath();
		System.out.println("Using String / Conceptually: ");
		digitExtractor deconceptual = new digitExtractor(in);
		deconceptual.returnInvertedOrderByString();
		
		System.out.println("Well done !!!! changed in repo");
		
	}

}
