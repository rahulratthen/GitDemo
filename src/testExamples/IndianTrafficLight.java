package testExamples;

public class IndianTrafficLight implements CentralTraffic 
{

	public static void main(String[] args) 
	{
		CentralTraffic signal = new IndianTrafficLight();
		signal.greenGo();
		signal.redStop();
		signal.flashYellow();

	}

	@Override
	public void greenGo() 
	{
		System.out.println("Green Go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("Red stop implementation");
	}

	@Override
	public void flashYellow() {
		System.out.println("Flash Yellow implementation");
		
	}

}
