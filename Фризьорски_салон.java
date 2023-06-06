package мбрлбрб;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JList;
import java.awt.Toolkit;

public class Фризьорски_салон {

	private JFrame frmBeauty;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField txtT;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Фризьорски_салон window = new Фризьорски_салон();
					window.frmBeauty.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Фризьорски_салон() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBeauty = new JFrame();
		frmBeauty.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Toshko\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\9999977.png"));
		frmBeauty.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		frmBeauty.setTitle("\u0424\u0440\u0438\u0437\u044C\u043E\u0440\u0441\u043A\u0438 \u0441\u0430\u043B\u043E\u043D BEAUTY");
		frmBeauty.setBounds(100, 100, 1024, 601);
		frmBeauty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBeauty.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(24, 25, 214, 187);
		frmBeauty.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton radioBD = new JRadioButton("\u0414\u0430\u043C\u0441\u043A\u043E");
		buttonGroup_1.add(radioBD);
		radioBD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBD.setBounds(10, 58, 178, 35);
		panel.add(radioBD);
		
		JRadioButton radioBM = new JRadioButton("\u041C\u044A\u0436\u043A\u043E");
		buttonGroup_1.add(radioBM);
		radioBM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBM.setBounds(10, 120, 178, 35);
		panel.add(radioBM);
		
		JLabel label_1 = new JLabel("\u041F\u043E\u0434\u0441\u0442\u0440\u0438\u0433\u0432\u0430\u043D\u0435");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_1.setBounds(10, 0, 204, 35);
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(24, 223, 479, 91);
		frmBeauty.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton radioBK = new JRadioButton("\u041A\u044A\u0441\u0430");
		buttonGroup.add(radioBK);
		radioBK.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBK.setBounds(20, 42, 178, 35);
		panel_1.add(radioBK);
		
		JRadioButton radioBD1 = new JRadioButton("\u0414\u044A\u043B\u0433\u0430");
		buttonGroup.add(radioBD1);
		radioBD1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		radioBD1.setBounds(261, 42, 178, 35);
		panel_1.add(radioBD1);
		
		JLabel label = new JLabel("\u0414\u044A\u043B\u0436\u0438\u043D\u0430 \u043D\u0430 \u043A\u043E\u0441\u0430\u0442\u0430");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label.setBounds(10, 0, 390, 35);
		panel_1.add(label);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lbl.setBounds(298, 460, 170, 74);
		frmBeauty.getContentPane().add(lbl);
		
		txtT = new JTextField();
		txtT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		txtT.setBounds(560, 111, 278, 54);
		frmBeauty.getContentPane().add(txtT);
		txtT.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(249, 25, 254, 187);
		frmBeauty.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox B = new JCheckBox("\u0411\u043E\u044F\u0434\u0438\u0441\u0432\u0430\u043D\u0435");
		B.setBounds(6, 37, 226, 54);
		panel_2.add(B);
		B.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JCheckBox I = new JCheckBox("\u0418\u0437\u043C\u0438\u0432\u0430\u043D\u0435");
		I.setBounds(6, 82, 209, 54);
		panel_2.add(I);
		I.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JCheckBox S = new JCheckBox("\u0421\u0443\u0448\u0435\u043D\u0435");
		S.setBounds(6, 126, 183, 54);
		panel_2.add(S);
		S.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JLabel label_2 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u0434\u0443\u0440\u0430");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_2.setBounds(6, 0, 204, 35);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(24, 325, 479, 87);
		frmBeauty.getContentPane().add(panel_3);
		
		
		JCheckBox ch1 = new JCheckBox("\u0434\u043E 18\u0433.");
		buttonGroup_2.add(ch1);
		ch1.setBounds(6, 42, 143, 35);
		panel_3.add(ch1);
		ch1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JCheckBox ch2 = new JCheckBox("\u043D\u0430\u0434 18\u0433. ");
		buttonGroup_2.add(ch2);
		ch2.setBounds(149, 42, 161, 35);
		panel_3.add(ch2);
		ch2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JCheckBox ch3 = new JCheckBox("\u043D\u0430\u0434 65\u0433.");
		buttonGroup_2.add(ch3);
		ch3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		ch3.setBounds(307, 42, 166, 35);
		panel_3.add(ch3);	
		
		JLabel lab6 = new JLabel("");
		lab6.setForeground(new Color(107, 142, 35));
		lab6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lab6.setBounds(560, 172, 317, 40);
		frmBeauty.getContentPane().add(lab6);
		
		JLabel lblN = new JLabel("");	
		lblN.setBounds(869, 168, 58, 54);
		frmBeauty.getContentPane().add(lblN);

		
		
		JButton button = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double p=0;					
				if (B.isSelected()) p+=10;
				 if (I.isSelected()) p+=5;
			      if (S.isSelected()) p+=3;
			      
			      double k=3;	
				if (radioBD.isSelected()) k=k*1+12;
				if (radioBM.isSelected()) k=k*1+5;
				if (radioBK.isSelected()) k=k*1-2;
				if (radioBD1.isSelected()) k=k*1;
				
				double o=k+p;
	            if(ch1.isSelected()) o=o-1;
	            if(ch3.isSelected()) o=o-1;
	           
	            
	            if(ch2.isSelected()) o=o;
	            lbl.setForeground(new Color(0,0,0));
				lbl.setText(Double.toString(o) + " лв.");
				
				lab6.setText(null);
				lblN.setIcon(new ImageIcon(""));										 

        }
				
				
				
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		button.setBounds(10, 452, 219, 74);
		frmBeauty.getContentPane().add(button);
		
		
		JLabel lblBeauty = new JLabel(" beauty20 ");
		lblBeauty.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblBeauty.setBounds(692, 56, 170, 44);
		frmBeauty.getContentPane().add(lblBeauty);
		
		JLabel label_3 = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0438 \u043A\u043E\u0434 \u0437\u0430 \u043E\u0442\u0441\u0442\u044A\u043F\u043A\u0430: ");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_3.setBounds(572, 11, 406, 44);
		frmBeauty.getContentPane().add(label_3);
		
		
		JLabel label_4 = new JLabel("\u0412\u044A\u0437\u0440\u0430\u0441\u0442");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		label_4.setBounds(10, 0, 204, 35);
		panel_3.add(label_4);
		
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("D:\\Toshko\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\9999977.png"));
		label_5.setBounds(502, 209, 523, 325);
		frmBeauty.getContentPane().add(label_5);
		
		
		
		
		
		JButton button_1 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438");
		button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			    lab6.setText("\u041A\u043E\u0434\u044A\u0442 \u0435 \u0432\u044A\u0432\u0435\u0434\u0435\u043D \u0443\u0441\u043F\u0435\u0448\u043D\u043E!");
				lblN.setIcon(new ImageIcon("D:\\Toshko\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u041A\u0430\u0440\u0442\u0438\u043D\u04301UFK.png"));			
				
				double p=0;					
				 if (I.isSelected()) p+=5;
			      if (S.isSelected()) p+=3;
			      
			      double k=3;	
				if (radioBD.isSelected()) k=k*2;								
				if (radioBM.isSelected()) k=k*1;				
				if (radioBK.isSelected()) k=k*1;
				if (radioBD1.isSelected()) k=k*2;
				
				double o=k+p;
	            if(ch1.isSelected()) o=o-1;
	            if(ch3.isSelected()) o=o-1;       
	            if(ch2.isSelected()) o=o;
	            lbl.setForeground(new Color(107, 142, 35));
				lbl.setText(Double.toString(o-1) + " лв.");			
				txtT.addActionListener(null);
				
				
			}
		});
		button_1.setBounds(848, 121, 115, 36);
		frmBeauty.getContentPane().add(button_1);
		
		JLabel label_6 = new JLabel("\u0421\u043C\u0435\u0442\u043A\u0430\u0442\u0430 \u0412\u0438 \u0435:");
		label_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		label_6.setBounds(249, 423, 250, 44);
		frmBeauty.getContentPane().add(label_6);
		
		
		
		
		
			
		
	}
}
