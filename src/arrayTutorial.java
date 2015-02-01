
public class arrayTutorial {

	public static void main(String[] args){
			
		int arrInt[] = new int[15];
		arrInt[0] = 1;
		
		int i = 0;
		while (i <= 14){
			System.out.println(i);
			arrInt[i] = i++;
		}
		
	}
}
