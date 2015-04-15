package ie.dit;


public class Main {
	
	public static boolean runGame;

	public static void main(String[] args){
		
		Frame f = new Frame();
		
		if (runGame == true){
			
			Menu m = new Menu();
			f.add(m);
			f.addMouseListener(m);
			
		}
		else 
		{
			
			Duck d = new Duck();
			f.add(d);
			f.addMouseListener(d);
			
		}
		
	}//end main method

}//end class Main()
