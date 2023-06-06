package мбрлбрб;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Лято {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Лято window = new Лято();
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
	public Лято() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u041F\u0438\u0446\u0430\u0440\u0438\u044F \u201E\u041B\u044A\u043A\u0438\u201C");
		frame.setBounds(100, 100, 949, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0414\u043E\u0431\u0440\u0435 \u0434\u043E\u0448\u043B\u0438 \u0432 \u043D\u0430\u0448\u0430\u0442\u0430 \u043E\u043D\u043B\u0430\u0439\u043D \u043F\u0438\u0446\u0430\u0440\u0438\u044F!");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		label.setBounds(89, 0, 799, 54);
		frame.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 66, 933, 4);
		frame.getContentPane().add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.info);
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0412\u0438\u0434 \u043F\u0438\u0446\u0430", "\u041C\u0430\u0440\u0433\u0430\u0440\u0438\u0442\u0430", "\u041F\u0435\u043F\u0435\u0440\u043E\u043D\u0438", "\u041A\u0430\u043F\u0440\u0438\u0447\u043E\u0437\u0430", "\u041A\u0430\u0440\u0443\u0437\u043E", "\u0425\u0430\u0432\u0430\u0439", "\u0412\u0435\u0433\u0435\u0442\u0430\u0440\u0438\u0430\u043D\u0430"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(25, 81, 232, 54);
		frame.getContentPane().add(comboBox);
		
	
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u0413\u043E\u043B\u0435\u043C\u0438\u043D\u0430", "\u0413\u043E\u043B\u044F\u043C\u0430 ", "\u041C\u0430\u043B\u043A\u0430"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		comboBox_1.setBackground(SystemColor.info);
		comboBox_1.setBounds(284, 351, 223, 54);
		frame.getContentPane().add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(284, 87, 248, 239);
		frame.getContentPane().add(panel_1);
		
		JCheckBox G = new JCheckBox("\u0413\u043E\u0440\u0447\u0438\u0446\u0430");
		G.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		G.setBounds(43, 22, 172, 45);
		panel_1.add(G);
		
		JCheckBox K = new JCheckBox("\u041A\u0435\u0442\u0447\u0443\u043F");
		K.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		K.setBounds(43, 91, 148, 45);
		panel_1.add(K);
		
		JCheckBox M = new JCheckBox("\u041C\u0430\u0439\u043E\u043D\u0435\u0437\u0430");
		M.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		M.setBounds(43, 167, 189, 45);
		panel_1.add(M);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u0430\u0436\u0442.png"));
		lblNewLabel_1.setBounds(610, 448, 113, 77);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u043E\u0449\u0432.png"));
		lblNewLabel.setBounds(507, 93, 486, 525);
		frame.getContentPane().add(lblNewLabel);
		

		JButton but = new JButton("\u041D\u043E\u0432\u0430 \u0437\u0430\u044F\u0432\u043A\u0430");
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
				
			
				M.setSelected(false);
				G.setSelected(false);
				K.setSelected(false);			
				
			}
		});
		but.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		but.setBounds(25, 471, 232, 54);
		frame.getContentPane().add(but);
		
		JButton button = new JButton("\u0418\u0437\u043F\u0440\u0430\u0442\u0438 \u0437\u0430\u044F\u0432\u043A\u0430");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex() == 0  || comboBox_1.getSelectedIndex() == 0  ) {
					JOptionPane.showMessageDialog(frame,
                            "Моля, попълнете всички нужни полета.",
                            "Грешка",
                            JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					
					String vid=comboBox.getSelectedItem().toString();
					String vid2=comboBox_1.getSelectedItem().toString();
					
					String Extras = "";
					
					if (K.isSelected())
						Extras += " Кетчуп; ";
					
					if (G.isSelected())
						Extras += "Горчица; ";
					
					if (M.isSelected())
						Extras += " Майонеза; ";
					
					String ch= "Вид пица: " + vid +  "\nГолемина: " + vid2 + "\nСосове: " + Extras;
					
					 Object[] options = {"Потвърди",
                     "Започни отначало"};
					 
					 int n = JOptionPane.showOptionDialog(frame,
			                    ch,
			                    "Вашата поръчка:",
			                    JOptionPane.YES_NO_OPTION,
			                    JOptionPane.PLAIN_MESSAGE,
			                    null,     
			                    options,  
			                    options[0]);
					
					 
					  
		                if(n == 0) {
		                    JOptionPane.showMessageDialog(frame,
		                            "Вашата поръчка беше изпратена успешно!");
		                   but.doClick();
		                } else
		                    but.doClick();
		                }
								
					
					
				}
				
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		button.setBounds(25, 415, 232, 54);
		frame.getContentPane().add(button);
		
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\\u0422\u043E\u0448\u043A\u043E\\\u0418\u043D\u0444.\u0442\u0435\u0445\u043D\\\u0443\u0448\u0449.png"));
		lblNewLabel_2.setBounds(25, 158, 232, 224);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
