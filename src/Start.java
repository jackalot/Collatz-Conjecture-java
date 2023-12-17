import javax.swing.JOptionPane;
public class Start {
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Please insert a number greater than 1");
		int num = Integer.parseInt(input);
		System.out.print(num);
	}
}
