import javax.swing.*;
import java.awt.*;

class LayoutNulo extends JFrame{
	public LayoutNulo() {
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Programa GUI [Layout Nulo]");
		setSize(771,580);
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("<html>The classic Form includes all visible fields for this list.<html>");
		txtTitulo.setBounds(27,21,230,25);
		add(txtTitulo);
		
		
		JLabel txtFormOptions = new JLabel("Form options");
		txtFormOptions.setBounds(27,70,77,13);
		add(txtFormOptions);
		
		JLabel txt1stCheck = new JLabel("Include the following");
		txt1stCheck.setBounds(27,93,127,13);
		add(txt1stCheck);
		
		JCheckBox checkTitle = new JCheckBox("a title for your form");
		checkTitle.setBounds(25, 109, 150, 20);
		add(checkTitle);
		
		JTextArea txtbMail = new JTextArea( "Subscribe to our mailing list");
		txtbMail.setBounds(27, 132, 225, 27);
		txtbMail.setLineWrap(true);
		txtbMail.setWrapStyleWord(true);
		add(txtbMail);
		
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioOrf = new JRadioButton("only required fields");
		bg.add(radioOrf);
		radioOrf.setBounds(27, 195, 148, 20);
		add(radioOrf);
		JRadioButton radioAll = new JRadioButton("all fields");
		bg.add(radioAll);
		radioAll.setBounds(27, 217, 95, 20);
		add(radioAll);
		
		JLabel txtEditFields = new JLabel("(edit required fields in the form builder)");
		txtEditFields.setBounds(42,245,220,13);
		add(txtEditFields);
		
		
		JCheckBox checkIgf = new JCheckBox("interest group fields");
		checkIgf.setBounds(25, 294, 151, 20);
		add(checkIgf);
		
		JCheckBox checkRfi = new JCheckBox("required field indicators");
		checkRfi.setBounds(25, 318, 170, 20);
		add(checkRfi);
		
		
		JLabel txtSfw = new JLabel("Set form width");
		txtSfw.setBounds(27,360,96,13);
		add(txtSfw);
		
		JTextArea txtbSfw = new JTextArea();
		txtbSfw.setBounds(27, 377, 225, 27);
		txtbSfw.setLineWrap(true);
		txtbSfw.setWrapStyleWord(true);
		add(txtbSfw);
		
		
		JLabel txtEyf = new JLabel("Enhance your form");
		txtEyf.setBounds(27,423,120,13);
		add(txtEyf);
		
		JCheckBox checEvPop= new JCheckBox("enable evil popup mode");
		checEvPop.setBounds(25, 440, 173, 20);
		add(checEvPop);
		
		JCheckBox checkJS = new JCheckBox("disable all JavaScript");
		checkJS.setBounds(25, 462, 163, 20);
		add(checkJS);
		
		JCheckBox checkfLink = new JCheckBox("include archive link");
		checkfLink.setBounds(25, 484, 150, 20);
		add(checkfLink);
		
		JCheckBox checkMkRw = new JCheckBox("include Monkey Rewards link");
		checkMkRw.setBounds(25, 506, 196, 20);
		add(checkMkRw);
		
		
		JLabel txtPreview = new JLabel("Preview");
		txtPreview.setBounds(277,21,324,13);
		add(txtPreview);
		
		JLabel txtEAddress = new JLabel("Email Address");
		txtEAddress.setBounds(296,66,136,9);
		add(txtEAddress);
		
		JTextArea txtbEAddress = new JTextArea();
		txtbEAddress.setBounds(296, 80, 419, 25);
		txtbEAddress.setLineWrap(true);
		txtbEAddress.setWrapStyleWord(true);
		add(txtbEAddress);
		
		JLabel txtFName = new JLabel("First Name");
		txtFName.setBounds(296,118,110,9);
		add(txtFName);
		
		JTextArea txtbFName = new JTextArea();
		txtbFName.setBounds(296, 132, 419, 25);
		txtbFName.setLineWrap(true);
		txtbFName.setWrapStyleWord(true);
		add(txtbFName);
		
		JLabel txtLName = new JLabel("Last Name");
		txtLName.setBounds(296,170,110,9);
		add(txtLName);
		
		JTextArea txtbLName = new JTextArea();
		txtbLName.setBounds(296, 184, 419, 25);
		txtbLName.setLineWrap(true);
		txtbLName.setWrapStyleWord(true);
		add(txtbLName);
		
		
		JLabel txtCp = new JLabel("Copy/paste onto your site");
		txtCp.setBounds(277,300,152,13);
		add(txtCp);
		
		
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
