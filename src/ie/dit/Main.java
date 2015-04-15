package ie.dit;


public class Main{
	
	public static boolean runGame = true;

	public static void main(String[] args){
		
		Frame f = new Frame();
		
		if (runGame == true){
			
			Duck d = new Duck();
			f.add(d);
			f.addMouseListener(d);
			
		}
		else
		{
			
			
		}
		
	}//end main method

}//end class Main()
