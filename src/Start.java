import javax.swing.JOptionPane;
public class Start {
	private static int CheckEvenOrOdd(int input)
	{
		//EVEN
		if(input % 2 == 0)
		{
			input /= 2;
		}
		else //odd
		{
			input *= 3;
			input += 1;
		}
		return input;
	}
	private static int GetInput()
	{
		String input = JOptionPane.showInputDialog("Please insert an integer greater than 1");
		if(input.isEmpty() || input == null || Integer.parseInt(input) < 2)
		{
			int randomNum = (int) (Math.random() * 99) + 1;
			input = "";
			input += randomNum;
		}
		int num = Integer.parseInt(input);
		return num;
	}
	public static void main(String[] args)
	{
		int input = GetInput();
		System.out.println(input);
		
	}
}
