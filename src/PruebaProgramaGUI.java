import javax.swing.*;
import java.awt.*;

class LayoutNulo extends JFrame{
	public LayoutNulo() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Layout nulo");
		setSize(300,300);
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("Formulario de registro");
		txtTitulo.setBounds(0,0,300,50);
		txtTitulo.setBackground(new Color(255,0,0));
		add(txtTitulo);
		
		JLabel txtNumControl = new JLabel("Numero de control:");
		txtNumControl.setBounds(210, 55,50,50);
		add(txtNumControl);
		
		JTextField cajNumControl = new JTextField(10);
		cajNumControl.setBounds(170,55,50,50);
		add(cajNumControl);
		
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
