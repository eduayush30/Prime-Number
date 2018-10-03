class Game
{	
	void type()
	{
		System.out.println("Indoor game or Outdoor game");
	}
}

class Cricket extends Game
{
	void type()
	{
		System.out.println("Cricket is a Outdoor Game");
	}
}
public class PolyExp {

	public static void main(String[] args) {
		Game gm = new Game();
		Cricket ck = new Cricket();
		gm.type();
		ck.type();
		gm = ck;
		gm.type();

	}

}
