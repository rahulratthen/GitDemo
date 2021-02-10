package testExamples;

public class JetSpice extends AirCraftGuidelines {

	public static void main(String[] args) 
	{
		
		JetSpice planeInfo = new JetSpice();
		planeInfo.safetyGuideline();
		planeInfo.engineSetting();
		planeInfo.planeColor();
	}

	@Override
	public void planeColor()
	{
		System.out.println("The plane body colour should be white and blue");
		
	}

}
