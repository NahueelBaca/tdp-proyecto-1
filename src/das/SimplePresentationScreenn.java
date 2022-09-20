package das;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DropMode;


public class SimplePresentationScreenn extends JFrame {

	private JPanel contentPane;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimplePresentationScreenn frame = new SimplePresentationScreenn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimplePresentationScreenn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreenn.class.getResource("/images/tdp.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date)); 
		
		JLabel lblNewLabel_1 = new JLabel("LU:");
		lblNewLabel_1.setBounds(10, 30, 33, 14);
		lblNewLabel_1.setBackground(SystemColor.textHighlight);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setBounds(10, 55, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 7));
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 80, 46, 14);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 108, 46, 14);
		
		JLabel lblNewLabel_4 = new JLabel("github url");
		lblNewLabel_4.setBounds(10, 137, 46, 14);
		
		JLabel acavaellu = new JLabel();
		acavaellu.setBounds(53, 30, 163, 14);
		acavaellu.setText("aaa");
		
		JLabel acavaApellido = new JLabel("insertarapellidpo");
		acavaApellido.setBounds(164, 54, 153, 14);
		
		JLabel acavaNombre = new JLabel("inserteNombre");
		acavaNombre.setBounds(66, 80, 133, 14);
		
		JLabel acavaMail = new JLabel("inserteMail");
		acavaMail.setBounds(62, 108, 133, 14);
		acavaMail.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel acavaGit = new JLabel("InserteGit");
		acavaGit.setBounds(66, 137, 197, 14);
		acavaGit.setBackground(SystemColor.controlText);
		acavaGit.setForeground(Color.BLACK);
		
		
		String hora= String.valueOf(formatter.format(date));
		JLabel fechayhora = new JLabel("Esta ventana fue generada:" + hora);
		fechayhora.setBounds(10, 193, 307, 14);
		contentPane.setLayout(null);
		contentPane.add(fechayhora);
		contentPane.add(lblNewLabel_1);
		contentPane.add(acavaellu);
		contentPane.add(lblNewLabel);
		contentPane.add(acavaApellido);
		contentPane.add(lblNewLabel_2);
		contentPane.add(acavaNombre);
		contentPane.add(lblNewLabel_3);
		contentPane.add(acavaMail);
		contentPane.add(lblNewLabel_4);
		contentPane.add(acavaGit);
		
		JLabel ImagenUns = new JLabel("");
		ImagenUns.setIcon(new ImageIcon(SimplePresentationScreenn.class.getResource("/images/hola.png")));
		ImagenUns.setBounds(296, 104, 128, 115);
		contentPane.add(ImagenUns);
	
		
		
		
		
		
		
		
	}
}
