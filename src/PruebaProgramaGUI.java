import javax.swing.*;
import java.awt.*;

class LayoutNulo extends JFrame{
	public LayoutNulo() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Programa GUI [Layout Nulo]");
		setSize(771,542);
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("<html>The classic Form includes all visible fields for \n this list.<html>");
		txtTitulo.setBounds(27,21,230,25);
		add(txtTitulo);
		
		JLabel txtFormOptions = new JLabel("Form options");
		txtFormOptions.setBounds(27,70,77,13);
		add(txtFormOptions);
		
		JLabel txt1stCheck = new JLabel("Include the following");
		txt1stCheck.setBounds(27,93,127,13);
		add(txt1stCheck);
		
		
		/*JLabel txtNumControl = new JLabel("Numero de control:");
		txtNumControl.setBounds(210, 55,50,50);
		add(txtNumControl);
		
		JTextField cajNumControl = new JTextField(10);
		cajNumControl.setBounds(170,55,50,50);
		add(cajNumControl);*/
		
		setVisible(true);
		
		
		
	}
	
	
};

public class PruebaProgramaGUI {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LayoutNulo();
			}
		});
		
		

	}

}
