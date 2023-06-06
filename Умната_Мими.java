package мбрлбрб;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class Умната_Мими {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Умната_Мими window = new Умната_Мими();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Умната_Мими() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0423\u043C\u043D\u0430\u0442\u0430 \u041C\u0438\u043C\u0438");
		frame.setBounds(100, 100, 1004, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_3 = new JLabel("\u041F\u0430\u0440\u0438\u0442\u0435 \u043D\u0430 \u041C\u0438\u043C\u0438 \u0441\u0430:");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_3.setBounds(96, 456, 322, 59);
		frame.getContentPane().add(label_3);
		
		JLabel lblR = new JLabel("");
		lblR.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblR.setBounds(10, 511, 530, 59);
		frame.getContentPane().add(lblR);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lbl.setBounds(305, 340, 188, 65);
		frame.getContentPane().add(lbl);
		
		JButton button = new JButton("\u041F\u0440\u043E\u0432\u0435\u0440\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			int a=0;	
				double b=0;	
				double c=0;	
				double k=0;
				double r=0;
				double p=0;
	        	if(txtA.getText().isEmpty() == false)		        		
	       a = Integer.parseInt(txtA.getText());	    
	        	if ( a%2==0 ) a=(a*10)/2;
	        	lblR.setText(Integer.toString(a-1));
	        
	        	if(txtB.getText().isEmpty() == false)	{
	        		b=Double.parseDouble(txtB.getText());
				if ( a%2==0 == false )	
				if (a==1) b=(a*b);
				if (a==1) b=(a*b)-b;
					
	        	lblR.setText(Double.toString(b));	        	
	        	}
	        	
	        	k=b+(a-1);
	        	lbl.setText(Double.toString(k) + " лв. ");	   
	        		        		        	        	
	        	if(txtC.getText().isEmpty() == false)		        		
	     	       c = Double.parseDouble(txtC.getText());		
	        	r=c-k;	
	        	p=k-c;
	        	if(k>c)
	        		lblR.setText("Достатъчни – " + p + " лв. " + " Остатък");	   
	        	
	        	if(k<c)
	        		lblR.setText("Недостатъчни – " + r + " лв. "+ " Още");	   
	        	
	        	
	        	
	        	
	        	
	   
	       		
				
				
				
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		button.setBounds(89, 340, 206, 65);
		frame.getContentPane().add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 530, 314);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u041C\u0438\u043C\u0438 \u0435 \u043D\u0430:");
		label.setBounds(28, 22, 206, 59);
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		txtA = new JTextField();
		txtA.setBounds(371, 26, 116, 51);
		panel.add(txtA);
		txtA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtA.setColumns(10);
		
		JLabel label_1 = new JLabel("\u0415\u0434\u043D\u0430 \u0438\u0433\u0440\u0430\u0447\u043A\u0430 \u0441\u0442\u0440\u0443\u0432\u0430:");
		label_1.setBounds(10, 117, 348, 59);
		panel.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		txtB = new JTextField();
		txtB.setBounds(371, 121, 116, 51);
		panel.add(txtB);
		txtB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtB.setColumns(10);
		
		JLabel label_2 = new JLabel("\u0426\u0435\u043D\u0430\u0442\u0430 \u043D\u0430 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u0430:");
		label_2.setBounds(10, 200, 348, 59);
		panel.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		txtC = new JTextField();
		txtC.setBounds(371, 204, 116, 51);
		panel.add(txtC);
		txtC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtC.setColumns(10);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04309.png"));
		label_4.setBounds(570, 21, 397, 549);
		frame.getContentPane().add(label_4);
		
		
	}
}
