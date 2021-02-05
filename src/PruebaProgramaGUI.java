import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class LayoutNulo extends JFrame{
	
	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
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
		
		JFormattedTextField txtbEAddress = new JFormattedTextField();
		txtbEAddress.setBounds(296, 80, 419, 25);
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
		
		Icon icon = new ImageIcon("./archivos/sent.PNG");
		JButton btnSub = new JButton(icon);
		btnSub.setBounds(297, 221, 53, 53);
		add(btnSub);
		
		
		
		/*btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnSub.getModel().isPressed()) {
			        System.out.println("the button is pressed");
			        };
			        
			        
			}
		});*/
		
		/*String email = txtEAddress.getText();
		if (!email.matches(EMAIL_PATTERN)) {}
		
		JFrame parent = new JFrame();
	    JOptionPane.showMessageDialog(parent, "Correo no valido");*/
		
		
		
		
		
		
		JLabel txtCp = new JLabel("Copy/paste onto your site");
		txtCp.setBounds(277,300,1,13);
		add(txtCp);
		
		JTextArea display = new JTextArea("<!-- Begin MailChimp Signup Form -->\r\n" + 
				"<link href=\"//cdn-images.mailchimp.com/embedcode/classic-10_7.css\" rel=\"stylesheet\" type=\"text/css\">\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"	#mc_embed_signup{background:#fff; clear:left; font:14px Helvetica,Arial,sans-serif;  width:500px; margin-right: auto; margin-left:auto; padding: 15px;}\r\n" + 
				"	/* Add your own MailChimp form style overrides in your site stylesheet or in this style block.\r\n" + 
				"	   We recommend moving this block and the preceding CSS link to the HEAD of your HTML file. */\r\n" + 
				"</style>\r\n" + 
				"<div id=\"mc_embed_signup\">\r\n" + 
				"<form action=\"//cafetruth.us4.list-manage.com/subscribe/post?u=1cb3e16b044661b3a214687b6&amp;id=07a29d37f6\" method=\"post\" id=\"mc-embedded-subscribe-form\" name=\"mc-embedded-subscribe-form\" class=\"validate\" target=\"_blank\" novalidate>\r\n" + 
				"    <div id=\"mc_embed_signup_scroll\">\r\n" + 
				"	<h2 align=center>Join and Get Our <br />Tried & True Testimonial Request Template</h2>\r\n" + 
				"<div class=\"indicates-required\"><span class=\"asterisk\">*</span> indicates required</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-EMAIL\">Email Address  <span class=\"asterisk\">*</span>\r\n" + 
				"</label>\r\n" + 
				"	<input type=\"email\" value=\"\" name=\"EMAIL\" class=\"required email\" id=\"mce-EMAIL\">\r\n" + 
				"</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-FNAME\">First Name </label>\r\n" + 
				"	<input type=\"text\" value=\"\" name=\"FNAME\" class=\"\" id=\"mce-FNAME\">\r\n" + 
				"</div>\r\n" + 
				"<div class=\"mc-field-group\">\r\n" + 
				"	<label for=\"mce-LNAME\">Last Name </label>\r\n" + 
				"	<input type=\"text\" value=\"\" name=\"LNAME\" class=\"\" id=\"mce-LNAME\">\r\n" + 
				"</div>\r\n" + 
				"	<div id=\"mce-responses\" class=\"clear\">\r\n" + 
				"		<div class=\"response\" id=\"mce-error-response\" style=\"display:none\"></div>\r\n" + 
				"		<div class=\"response\" id=\"mce-success-response\" style=\"display:none\"></div>\r\n" + 
				"	</div>    <!-- real people should not fill this in and expect good things - do not remove this or risk form bot signups-->\r\n" + 
				"    <div style=\"position: absolute; left: -5000px;\" aria-hidden=\"true\"><input type=\"text\" name=\"b_1cb3e16b044661b3a214687b6_07a29d37f6\" tabindex=\"-1\" value=\"\"></div>\r\n" + 
				"    <div class=\"clear\"><input type=\"submit\" value=\"Subscribe\" name=\"subscribe\" id=\"mc-embedded-subscribe\" class=\"button\"></div>\r\n" + 
				"    </div>\r\n" + 
				"</form>\r\n" + 
				"</div>\r\n" + 
				"<script type='text/javascript' src='//s3.amazonaws.com/downloads.mailchimp.com/js/mc-validate.js'></script><script type='text/javascript'>(function($) {window.fnames = new Array(); window.ftypes = new Array();fnames[0]='EMAIL';ftypes[0]='email';fnames[1]='FNAME';ftypes[1]='text';fnames[2]='LNAME';ftypes[2]='text';}(jQuery));var $mcj = jQuery.noConflict(true);</script>\r\n" + 
				"<!--End mc_embed_signup-->");
	    display.setEditable(false);
	    display.setLineWrap(true);
	    display.setWrapStyleWord(true);
	    JScrollPane scroll = new JScrollPane(display);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(277, 323, 463, 150);
		
		add(scroll);
	    
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
