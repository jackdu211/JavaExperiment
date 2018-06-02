import javax.swing.JOptionPane;
public class UsingInputDialog{
	public static void main(String[] args) {
		
		String annuals = JOptionPane.showInputDialog("Enter yearly interest rate ");
		double annual = Double.parseDouble(annuals);
		String ab = JOptionPane.showInputDialog("Enter yearly interest rate ");
		int  a = Integer.parseInt(ab);
		JOptionPane.showMessageDialog(null,"showMessageDialog"+a+annual);
	}
}