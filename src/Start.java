import javax.swing.JOptionPane;
public class Start {
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Please insert an integer greater than 1");
		if(input == null || Integer.parseInt(input) < 2)
		{
			int randomNum = (int) (Math.random() * 99) + 1;
			input = "";
			input += randomNum;
		}
		int num = Integer.parseInt(input);
		System.out.print(num);
	}
}
