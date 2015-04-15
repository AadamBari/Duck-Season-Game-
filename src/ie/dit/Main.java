package ie.dit;


public class Main{
	
	public static boolean runGame = true;

	public static void main(String[] args){
		
		Frame f = new Frame();
		
		if (runGame == false){
			
			Duck d = new Duck();
			f.add(d);
			f.addMouseListener(d);
			
		}
		else
		{
			
			Menu m = new Menu();
			f.add(m);
			
		}
		
	}//end main method

}//end class Main()
