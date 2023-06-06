package мбрлбрб;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Цветя {

	private JFrame frame;
	private JTextField txtX;
	private JTextField txtL;
	private JTextField txtP;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton P;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Цветя window = new Цветя();
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
	public Цветя() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\77777777.jpg"));
		frame.setTitle("\u0426\u0432\u0435\u0442\u0430\u0440\u0441\u043A\u0438 \u043C\u0430\u0433\u0430\u0437\u0438\u043D");
		frame.setBounds(100, 100, 1267, 881);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 255, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 300, 229, 254);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0421\u0435\u0437\u043E\u043D");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(10, 0, 94, 27);
		panel.add(label);
		
		P = new JRadioButton("\u041F\u0440\u043E\u043B\u0435\u0442");
		buttonGroup_1.add(P);
		P.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		P.setBounds(10, 34, 157, 37);
		panel.add(P);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(Color.GREEN);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_8.setBackground(Color.GREEN);
		panel_8.setBounds(0, 134, 229, 8);
		panel.add(panel_8);
		
		JRadioButton L = new JRadioButton("\u041B\u044F\u0442\u043E");
		buttonGroup_1.add(L);
		L.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		L.setBounds(10, 88, 113, 37);
		panel.add(L);
		
		JRadioButton E = new JRadioButton("\u0415\u0441\u0435\u043D");
		buttonGroup_1.add(E);
		E.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		E.setBounds(10, 156, 195, 37);
		panel.add(E);
		
		JRadioButton Z = new JRadioButton("\u0417\u0438\u043C\u0430");
		buttonGroup_1.add(Z);
		Z.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		Z.setBounds(10, 210, 195, 37);
		panel.add(Z);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.GREEN);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(249, 300, 381, 254);
		frame.getContentPane().add(panel_1);
		
		JLabel label_2 = new JLabel("\u0412\u0438\u0434 \u0446\u0432\u0435\u0442\u0435");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_2.setBounds(10, 0, 153, 27);
		panel_1.add(label_2);
		
		txtX = new JTextField();
		txtX.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtX.setBounds(206, 44, 113, 48);
		panel_1.add(txtX);
		txtX.setColumns(10);
		
		txtL = new JTextField();
		txtL.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtL.setColumns(10);
		txtL.setBounds(206, 123, 113, 45);
		panel_1.add(txtL);
		
		txtP = new JTextField();
		txtP.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtP.setColumns(10);
		txtP.setBounds(206, 197, 113, 45);
		panel_1.add(txtP);
		
		JLabel label_17 = new JLabel("\u0431\u0440.");
		label_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_17.setBounds(329, 136, 45, 27);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("\u0431\u0440.");
		label_18.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_18.setBounds(329, 210, 45, 27);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("\u0431\u0440.");
		label_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_19.setBounds(329, 58, 45, 27);
		panel_1.add(label_19);
		
		JLabel label_4 = new JLabel("\u0425\u0440\u0438\u0437\u0430\u043D\u0442\u0435\u043C\u0438");
		label_4.setForeground(Color.MAGENTA);
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_4.setBounds(0, 45, 198, 45);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("\u041B\u0430\u043B\u0435\u0442\u0430");
		label_5.setForeground(Color.ORANGE);
		label_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_5.setBounds(10, 123, 122, 45);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("\u0420\u043E\u0437\u0438");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_6.setBounds(10, 197, 89, 45);
		panel_1.add(label_6);
		
		JLabel label_3 = new JLabel("\u0426\u0435\u043D\u0430\u0442\u0430 \u043D\u0430 \u0446\u0432\u0435\u0442\u044F\u0442\u0430 \u0435:");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_3.setBounds(263, 772, 336, 45);
		frame.getContentPane().add(label_3);
		
		JLabel lblR = new JLabel("");
		lblR.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblR.setBounds(609, 772, 149, 53);
		frame.getContentPane().add(lblR);
		

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.GREEN);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(640, 300, 295, 254);
		frame.getContentPane().add(panel_2);
		
		JLabel label_1 = new JLabel("\u041F\u0440\u0430\u0437\u043D\u0438\u043A");
		label_1.setBounds(89, 11, 146, 45);
		panel_2.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JRadioButton Da = new JRadioButton("\u0414\u0410");
		buttonGroup_2.add(Da);
		Da.setBounds(47, 88, 109, 33);
		panel_2.add(Da);
		Da.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		
		JRadioButton Ne = new JRadioButton("\u041D\u0415");
		buttonGroup_2.add(Ne);
		Ne.setBounds(210, 93, 79, 23);
		panel_2.add(Ne);
		Ne.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(Color.GREEN);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_7.setBackground(Color.GREEN);
		panel_7.setBounds(0, 146, 295, 8);
		panel_2.add(panel_7);
		
		JCheckBox A = new JCheckBox("\u0410\u0440\u0430\u043D\u0436\u0438\u0440\u0430\u043D\u0435");
		A.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		A.setBounds(63, 190, 201, 33);
		panel_2.add(A);
		
		JLabel label_20 = new JLabel("");	
		label_20.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\1351435.jpg"));
		label_20.setBounds(945, 277, 296, 215);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");		
		label_21.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\456456.jpg"));
		label_21.setBounds(945, 478, 296, 172);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("");	
		label_22.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\77777777.jpg"));
		label_22.setBounds(945, 653, 306, 172);
		frame.getContentPane().add(label_22);
		
		JButton button = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");	
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	   
				
				 
			    double x = 2;
	        	double r = 4.1;
	        	double l = 2.5;

	        	if(E.isSelected() || P.isSelected() || L.isSelected() || Z.isSelected()) {

	        	if(E.isSelected() || Z.isSelected()) {

	        	x += 1.75;

	        	r += .4;

	        	l += 1.75;
	        	
	        	
	        		
	        	}

	        	if(Da.isSelected()) {

	        	x += (.15 * x);

	        	r += (.15 * r);

	        	l += (.15 * l);

	        	}

	        	int xCount = 0;

	        	if(txtX.getText().isEmpty() == false)
	        			
	        	xCount = Integer.parseInt(txtX.getText());


	        	int rCount = 0;

	        	if(txtP.getText().isEmpty() == false)
	        		
	        	rCount = Integer.parseInt(txtP.getText());


	        	int lCount = 0;

	        	if(txtL.getText().isEmpty() == false)
	        		
	        	lCount = Integer.parseInt(txtL.getText());

	        	double total = 0;

	        	total = (xCount * x) + (rCount * r) + (lCount * l);

	        	if(A.isSelected())

	        	total += 2;

	       

	        	if(lCount >= 7 && P.isSelected())

	        	total -= (.05 * total);

	        	if(rCount >= 10 && Z.isSelected())

	        	total -= (.1 * total);

	        	if((xCount + rCount + lCount) > 20)

	        	total -= (.2 * total);

	        	
	        	

	        	lblR.setText(String.format("%.2f", total) + " лв");

	               
	            }

			    
			    
				    		     
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		button.setBounds(10, 758, 229, 73);
		frame.getContentPane().add(button);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setForeground(Color.GREEN);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(10, 565, 925, 182);
		frame.getContentPane().add(panel_3);
		
		JLabel label_12 = new JLabel("\u0425\u0440\u0438\u0437\u0430\u043D\u0442\u0435\u043C\u0438");
		label_12.setForeground(Color.MAGENTA);
		label_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_12.setBounds(39, 0, 213, 45);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("\u041B\u0430\u043B\u0435\u0442\u0430");
		label_13.setForeground(Color.ORANGE);
		label_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_13.setBounds(369, 30, 155, 45);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("\u0420\u043E\u0437\u0438");
		label_14.setForeground(Color.RED);
		label_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_14.setBounds(737, 0, 117, 45);
		panel_3.add(label_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.GREEN);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(314, 0, 240, 31);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_11 = new JLabel("\u0420\u0430\u0437\u043F\u0438\u0441\u0430\u043D\u0438\u0435 \u0446\u0435\u043D\u0438");
		label_11.setBounds(20, 0, 210, 27);
		panel_4.add(label_11);
		label_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		JLabel label_7 = new JLabel("\u043F\u0440\u043E\u043B\u0435\u0442/\u043B\u044F\u0442\u043E: 2 \u043B\u0432./\u0431\u0440.");
		label_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_7.setBounds(20, 67, 250, 27);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("\u0435\u0441\u0435\u043D/\u0437\u0438\u043C\u0430: 3,75 \u043B\u0432./\u0431\u0440.");
		label_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_8.setBounds(20, 115, 250, 27);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("\u043F\u0440\u043E\u043B\u0435\u0442/\u043B\u044F\u0442\u043E: 2,50 \u043B\u0432./\u0431\u0440.");
		label_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_9.setBounds(304, 77, 278, 27);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("\u0435\u0441\u0435\u043D/\u0437\u0438\u043C\u0430: 4,15 \u043B\u0432./\u0431\u0440.");
		label_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_10.setBounds(304, 125, 250, 27);
		panel_3.add(label_10);
		
		JLabel label_15 = new JLabel("\u043F\u0440\u043E\u043B\u0435\u0442/\u043B\u044F\u0442\u043E: 4,10 \u043B\u0432./\u0431\u0440.");
		label_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_15.setBounds(628, 56, 275, 27);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("\u0435\u0441\u0435\u043D/\u0437\u0438\u043C\u0430: 4,50 \u043B\u0432./\u0431\u0440.");
		label_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_16.setBounds(628, 103, 250, 27);
		panel_3.add(label_16);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GREEN);
		panel_5.setForeground(Color.GREEN);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(280, 0, 10, 182);
		panel_3.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GREEN);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBounds(608, 0, 10, 182);
		panel_3.add(panel_6);
		
		JLabel label_23 = new JLabel("\u041E\u0442 \u0442\u043E\u0432\u0430 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 \u043C\u043E\u0436\u0435\u0442\u0435 ");
		label_23.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_23.setBounds(398, 16, 481, 45);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("\u0434\u0430 \u0441\u0438 \u0438\u0437\u0431\u0435\u0440\u0435\u0442\u0435 \u0435\u0434\u043D\u0438 \u043E\u0442 \u043D\u0430\u0439-\u043A\u0440\u0430\u0441\u0438\u0432\u0438\u0442\u0435 \u0446\u0432\u0435\u0442\u044F \u043D\u0430 \u0417\u0435\u043C\u044F\u0442\u0430.");
		label_24.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_24.setBounds(194, 74, 901, 45);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("\u0421\u0430\u043C\u043E \u043F\u0440\u0438 \u043D\u0430\u0441 \u0438\u043C\u0430\u043C\u0435 \u043D\u0430\u043C\u0430\u043B\u0435\u043D\u0438\u044F \u0438 \u043E\u0442\u0441\u0442\u044A\u043F\u043A\u0438 \u0437\u0430 \u0432\u0441\u0438\u0447\u043A\u0438 \u0441\u0435\u0437\u043E\u043D\u0438 ");
		label_25.setForeground(Color.RED);
		label_25.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		label_25.setBounds(12, 197, 1239, 45);
		frame.getContentPane().add(label_25);
		
		JPanel panel_9 = new JPanel();
		panel_9.setForeground(Color.GREEN);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBackground(Color.GREEN);
		panel_9.setBounds(0, 150, 1251, 14);
		frame.getContentPane().add(panel_9);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\777777722.png"));
		label_26.setBounds(0, -16, 171, 182);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\777777722.png"));
		label_27.setBounds(1096, 0, 155, 172);
		frame.getContentPane().add(label_27);
		
		
		
		
	}
}
