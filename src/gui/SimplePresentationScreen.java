package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import entities.Student;
import javax.swing.JTabbedPane;

import java.util.Date;
import java.text.SimpleDateFormat;


@SuppressWarnings({ "serial", "unused" })
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 40, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 230));
		setResizable(false);
		setContentPane(contentPane);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("LU: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(10, 30, 33, 14);
		contentPane.add(lblNewLabel_2);
		
		String lu= String.valueOf(studentData.getId());
		JTextField acavaellu = new JTextField(lu);
		acavaellu.setEditable(false);
		acavaellu.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acavaellu.setBounds(53, 30, 163, 14);
		contentPane.add(acavaellu);
		
		JLabel apellido = new JLabel("Apellido: ");
		apellido.setFont(new Font("Tahoma", Font.PLAIN, 9));
		apellido.setBounds(10, 55, 46, 14);
		contentPane.add(apellido);
		
		JLabel nombre = new JLabel("Nombre: ");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 9));
		nombre.setBounds(10, 80, 46, 14);
		contentPane.add(nombre);
		
		JLabel email = new JLabel("Email: ");
		email.setFont(new Font("Tahoma", Font.PLAIN, 9));
		email.setBounds(10, 105, 46, 14);
		contentPane.add(email);
		
		JLabel github = new JLabel("Github url: ");
		github.setFont(new Font("Tahoma", Font.PLAIN, 9));
		github.setBounds(10, 131, 46, 14);
		contentPane.add(github);
		
		JTextField acavaApellido = new JTextField(studentData.getLastName());
		acavaApellido.setEditable(false);
		acavaApellido.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acavaApellido.setBounds(66, 55, 153, 14);
		contentPane.add(acavaApellido);
		
		JTextField acavaNombre = new JTextField(studentData.getFirstName());
		acavaNombre.setEditable(false);
		acavaNombre.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acavaNombre.setBounds(66, 80, 133, 14);
		contentPane.add(acavaNombre);
		
		JTextField acavaMail = new JTextField(studentData.getMail());
		acavaMail.setEditable(false);
		acavaMail.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acavaMail.setBounds(66, 105, 133, 14);
		contentPane.add(acavaMail);
		
		JTextField acavaGit = new JTextField(studentData.getGithubURL());
		acavaGit.setEditable(false);
		acavaGit.setFont(new Font("Tahoma", Font.PLAIN, 9));
		acavaGit.setBounds(66, 131, 197, 14);
		contentPane.add(acavaGit);
		
		String hora= String.valueOf(formatter.format(date));
		JLabel fechayhora = new JLabel("Esta ventana fue generada el:" + hora);
		fechayhora.setFont(new Font("Tahoma", Font.PLAIN, 10));
		fechayhora.setBounds(10, 169, 307, 14);
		contentPane.add(fechayhora);
	    
		
		
		
		
		
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		contentPane.add(tabbedPane, BorderLayout.WEST);
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(10, 30, 33, 14);
		contentPane.add(lblNewLabel_1);
		BufferedImage myPicture = null;
		
		JLabel ImagenUns = new JLabel("");
		ImagenUns.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/hola.png")));
		ImagenUns.setBounds(296, 104, 128, 115);
		contentPane.add(ImagenUns);
		
			
	}
}
