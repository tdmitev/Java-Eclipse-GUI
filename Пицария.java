package мбрлбрб;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;

public class Пицария {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Пицария window = new Пицария();
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
	public Пицария() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u041F\u0438\u0446\u0430\u0440\u0438\u044F");
		frame.setBounds(100, 100, 914, 1015);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBounds(10, 152, 499, 647);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JRadioButton M = new JRadioButton("\u041C\u0430\u0440\u0433\u0430\u0440\u0438\u0442\u0430");
		buttonGroup_1.add(M);
		M.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		M.setBounds(123, 19, 149, 57);
		panel.add(M);
		
		JRadioButton K = new JRadioButton("\u041A\u0430\u0440\u0443\u0437\u043E");
		buttonGroup_1.add(K);
		K.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		K.setBounds(123, 108, 132, 57);
		panel.add(K);
		
		JRadioButton V = new JRadioButton("\u0412\u0435\u0433\u0435\u0442\u0430\u0440\u0438\u0430\u043D\u0430");
		buttonGroup_1.add(V);
		V.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		V.setBounds(123, 195, 163, 57);
		panel.add(V);
		
		JRadioButton H = new JRadioButton("\u0425\u0430\u0432\u0430\u0439");
		buttonGroup_1.add(H);
		H.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		H.setBounds(123, 288, 116, 57);
		panel.add(H);
		
		JRadioButton Kal = new JRadioButton("\u041A\u0430\u043B\u0446\u043E\u043D\u0435");
		buttonGroup_1.add(Kal);
		Kal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		Kal.setBounds(123, 375, 143, 57);
		panel.add(Kal);
		
		JRadioButton Kar = new JRadioButton("\u041A\u0430\u0440\u0438\u043E\u043B\u0430");
		buttonGroup_1.add(Kar);
		Kar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		Kar.setBounds(123, 468, 132, 57);
		panel.add(Kar);
		
		JRadioButton N = new JRadioButton("\u041D\u0435\u0430\u043F\u043E\u043B\u0438\u0442\u0430\u043D\u0430");
		buttonGroup_1.add(N);
		N.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		N.setBounds(123, 568, 163, 57);
		panel.add(N);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04301.png"));
		label.setBounds(0, 14, 117, 76);
		panel.add(label);
		
		JLabel label_1 = new JLabel(" ");
		label_1.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04302.png"));
		label_1.setBounds(10, 103, 108, 76);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(" ");
		label_2.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04303.png"));
		label_2.setBounds(10, 190, 107, 76);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(" ");
		label_3.setBounds(50, 188, 108, 76);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel(" ");
		label_4.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04304.png"));
		label_4.setBounds(10, 283, 108, 76);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel(" ");
		label_5.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04305.png"));
		label_5.setBounds(10, 370, 108, 76);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel(" ");
		label_6.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04306.png"));
		label_6.setBounds(10, 463, 108, 76);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel(" ");
		label_7.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041F\u0438\u0446\u0430\u0440\u0438\u044F\\\u041A\u0430\u0440\u0442\u0438\u043D\u04307.png"));
		label_7.setBounds(10, 562, 107, 76);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("6,00 \u043B\u0432.");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_8.setBounds(388, 26, 93, 44);
		panel.add(label_8);
		
		JLabel label_12 = new JLabel("3,90 \u043B\u0432.");
		label_12.setForeground(Color.MAGENTA);
		label_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_12.setBounds(285, 26, 93, 44);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("6,40 \u043B\u0432.");
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_13.setBounds(388, 115, 93, 44);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("4,40 \u043B\u0432.");
		label_14.setForeground(Color.MAGENTA);
		label_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_14.setBounds(285, 115, 93, 44);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("5,30 \u043B\u0432.");
		label_15.setForeground(Color.RED);
		label_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_15.setBounds(388, 201, 93, 44);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("3,30 \u043B\u0432.");
		label_16.setForeground(Color.MAGENTA);
		label_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_16.setBounds(285, 201, 93, 44);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("6,10 \u043B\u0432.");
		label_17.setForeground(Color.RED);
		label_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_17.setBounds(388, 295, 93, 44);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("4,10 \u043B\u0432.");
		label_18.setForeground(Color.MAGENTA);
		label_18.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_18.setBounds(285, 295, 93, 44);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("6,30 \u043B\u0432.");
		label_19.setForeground(Color.RED);
		label_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_19.setBounds(388, 376, 93, 57);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("4,30 \u043B\u0432.");
		label_20.setForeground(Color.MAGENTA);
		label_20.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_20.setBounds(285, 376, 93, 57);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("5,90 \u043B\u0432.");
		label_21.setForeground(Color.RED);
		label_21.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_21.setBounds(388, 469, 93, 57);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("3,90 \u043B\u0432.");
		label_22.setForeground(Color.MAGENTA);
		label_22.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_22.setBounds(285, 469, 93, 57);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("7,00 \u043B\u0432.");
		label_23.setForeground(Color.RED);
		label_23.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_23.setBounds(388, 574, 93, 44);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("4,90 \u043B\u0432.");
		label_24.setForeground(Color.MAGENTA);
		label_24.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_24.setBounds(285, 568, 93, 57);
		panel.add(label_24);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(531, 152, 344, 239);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chG = new JCheckBox("\u0413\u043E\u0440\u0447\u0438\u0446\u0430");
		chG.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		chG.setBounds(81, 30, 232, 45);
		panel_1.add(chG);
		
		JCheckBox chK = new JCheckBox("\u041A\u0435\u0442\u0447\u0443\u043F");
		chK.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		chK.setBounds(81, 105, 232, 45);
		panel_1.add(chK);
		
		JCheckBox chM = new JCheckBox("\u041C\u0430\u0439\u043E\u043D\u0435\u0437\u0430");
		chM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		chM.setBounds(81, 168, 232, 45);
		panel_1.add(chM);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(531, 410, 344, 135);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton radioBM = new JRadioButton("\u041C\u0430\u043B\u043A\u0430 ");
		buttonGroup.add(radioBM);
		radioBM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBM.setBounds(16, 39, 138, 57);
		panel_2.add(radioBM);
		
		JRadioButton radioBG = new JRadioButton("\u0413\u043E\u043B\u044F\u043C\u0430");
		buttonGroup.add(radioBG);
		radioBG.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBG.setBounds(169, 39, 158, 57);
		panel_2.add(radioBG);
		
		JLabel label_9 = new JLabel("\u0412\u0438\u0434");
		label_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_9.setBounds(102, 97, 93, 44);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("250 \u0433\u0440.");
		label_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_10.setBounds(298, 97, 93, 44);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("500 \u0433\u0440.");
		label_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_11.setBounds(407, 97, 93, 44);
		frame.getContentPane().add(label_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(284, 76, 4, 75);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(393, 76, 4, 75);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBounds(0, 76, 898, 3);
		frame.getContentPane().add(panel_5);
		
		JLabel label_25 = new JLabel("\u0414\u043E\u0431\u0440\u0435 \u0434\u043E\u0448\u043B\u0438 \u0432 \u043D\u0430\u0448\u0430\u0442\u0430 \u043E\u043D\u043B\u0430\u0439\u043D \u043F\u0438\u0446\u0430\u0440\u0438\u044F!");
		label_25.setForeground(Color.RED);
		label_25.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_25.setBounds(138, 11, 686, 54);
		frame.getContentPane().add(label_25);
		
		Button button_1 = new Button("\u041D\u0410\u0417\u0410\u0414");
		button_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		button_1.setBackground(SystemColor.controlHighlight);
		button_1.setBounds(599, 720, 245, 60);
		frame.getContentPane().add(button_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(0, 815, 898, 3);
		frame.getContentPane().add(panel_6);
		
		JLabel label_26 = new JLabel("\u0412\u0438\u0435 \u0441\u0438 \u043F\u043E\u0440\u044A\u0447\u0430\u0445\u0442\u0435 ");
		label_26.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_26.setBounds(10, 834, 287, 54);
		frame.getContentPane().add(label_26);
		
		JLabel lblголемина = new JLabel("");
		lblголемина.setForeground(Color.RED);
		lblголемина.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblголемина.setBounds(298, 834, 131, 54);
		frame.getContentPane().add(lblголемина);
		
		JLabel label_28 = new JLabel("\u043F\u0438\u0446\u0430");
		label_28.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_28.setBounds(426, 834, 93, 54);
		frame.getContentPane().add(label_28);
		
		JLabel lblвид = new JLabel("");
		lblвид.setForeground(Color.RED);
		lblвид.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblвид.setBounds(519, 834, 325, 54);
		frame.getContentPane().add(lblвид);
		
		JLabel lblсосове = new JLabel("");
		lblсосове.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblсосове.setBounds(10, 899, 160, 54);
		frame.getContentPane().add(lblсосове);
		
		JLabel label_31 = new JLabel("\u041C\u043E\u043B\u044F \u043F\u043B\u0430\u0442\u0435\u0442\u0435:");
		label_31.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_31.setBounds(519, 899, 236, 54);
		frame.getContentPane().add(label_31);
		
		JLabel lblцена = new JLabel(" ");
		lblцена.setForeground(Color.RED);
		lblцена.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblцена.setBounds(753, 896, 145, 61);
		frame.getContentPane().add(lblцена);
		
		
		JLabel lblсос = new JLabel("");
		lblсос.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblсос.setBounds(180, 899, 166, 54);
		frame.getContentPane().add(lblсос);
		
		JLabel lblсос2 = new JLabel("");
		lblсос2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblсос2.setBounds(324, 899, 172, 54);
		frame.getContentPane().add(lblсос2);
		
		JButton button = new JButton("\u041F\u0420\u041E\u0414\u042A\u041B\u0416\u0418");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				if (chG.isSelected()) 
					lblсосове.setText("Горчица");
				 if(chK.isSelected())
					lblсос.setText("Кетчуп");
				if( chM.isSelected())
					lblсос2.setText("Майонза");
				
				if (chG.isSelected()==false) 
					lblсосове.setText("");
				 if(chK.isSelected()==false)
					lblсос.setText("");
				if( chM.isSelected()==false)
					lblсос2.setText("");
				
				double a=0;			
				
				if (M.isSelected()) {
				 if( radioBM.isSelected()) a=a+3.90;
					lblголемина.setText("малка");					
					 if ( radioBG.isSelected()) a=a+6;
						lblголемина.setText("голяма");									
					lblвид.setText("Маргарита");
				}
				
				if (K.isSelected()) {
					 if( radioBM.isSelected()) a=a+4.40;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+6.40;
					lblголемина.setText("голяма");		
					lblвид.setText("Карузо");
				}
				
				if (V.isSelected()) {
					 if( radioBM.isSelected()) a=a+3.30;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+5.30;
					lblголемина.setText("голяма");		
					lblвид.setText("Вегетариана");
				}
				
				if (H.isSelected()) {
					 if( radioBM.isSelected()) a=a+4.10;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+6.10;
					lblголемина.setText("голяма");		
					lblвид.setText("Хавай");
				}
				
				if ( Kal.isSelected()) {
					 if( radioBM.isSelected()) a=a+4.30;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+6.30;
					lblголемина.setText("голяма");		
					lblвид.setText("Калцоне");
				}
				
				if ( Kar.isSelected()) {
					 if( radioBM.isSelected()) a=a+3.90;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+5.90;
					lblголемина.setText("голяма");		
					lblвид.setText("Кариола");
				}
				
				if ( N.isSelected()) {
					 if( radioBM.isSelected()) a=a+4.90;
				lblголемина.setText("малка");					
				 if ( radioBG.isSelected()) a=a+7.0;
					lblголемина.setText("голяма");		
					lblвид.setText("Неаполитана");
				}
				
				lblцена.setText(a + " лв.");
				
				
			
				
			}
		});
		button.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\000000.png"));
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		button.setBounds(526, 578, 349, 113);
		frame.getContentPane().add(button);
		
		JLabel label_27 = new JLabel("\u0441");
		label_27.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_27.setBounds(753, 839, 37, 44);
		frame.getContentPane().add(label_27);
		
		
		
		JLabel label_32 = new JLabel(",");
		label_32.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_32.setBounds(147, 908, 37, 37);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel(",");
		label_33.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_33.setBounds(308, 899, 53, 54);
		frame.getContentPane().add(label_33);
		
		
	}
}
