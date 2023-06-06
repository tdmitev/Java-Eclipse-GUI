import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class score {

	private JFrame frame;
	private JTextField BG;
	private JTextField AE;
	private JTextField MOOP;
	private JLabel lblNewLabel_1_2;
	private JTextField GO;
	private JLabel lblNewLabel_1_3;
	private JTextField FVS;
	private JTextField LIT;
	private JTextField CO;
	private JTextField PO;
	private JTextField UO;
	private JTextField VA;
	private JTextField PM;
	private JTextField PA;
	private JTextField PI;
	private JTextField RB;
	private JTextField PS;
	private JTextField BGR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					score window = new score();
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
	public score() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel angl = new JPanel();
		angl.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		angl.setBackground(Color.WHITE);
		angl.setBounds(483, 0, 446, 269);
		frame.getContentPane().add(angl);
		angl.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u0410\u043D\u043B\u0438\u0439\u0441\u043A\u0438  \u043C\u043E\u0434\u0443\u043B\u0438");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(122, 0, 220, 40);
		angl.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u041B\u0438\u0442\u0435\u0440\u0430\u0442\u0443\u0440\u0430");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(10, 51, 151, 31);
		angl.add(lblNewLabel_2_1);
		
		LIT = new JTextField();
		LIT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		LIT.setColumns(10);
		LIT.setBounds(146, 52, 88, 30);
		angl.add(LIT);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u041A\u0443\u043B\u0442\u0443\u0440\u0430 \u0438 \u043E\u0431\u0449\u0443\u0432\u0430\u043D\u0435");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1.setBounds(10, 105, 243, 31);
		angl.add(lblNewLabel_2_1_1);
		
		CO = new JTextField();
		CO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		CO.setColumns(10);
		CO.setBounds(239, 105, 88, 31);
		angl.add(CO);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\u041F\u0438\u0441\u043C\u0435\u043D\u043E \u043E\u0431\u0449\u0443\u0432\u0430\u043D\u0435");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_1.setBounds(10, 157, 214, 31);
		angl.add(lblNewLabel_2_1_1_1);
		
		PO = new JTextField();
		PO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		PO.setColumns(10);
		PO.setBounds(222, 154, 88, 31);
		angl.add(PO);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\u0423\u0441\u0442\u043D\u043E \u043E\u0431\u0449\u0443\u0432\u0430\u043D\u0435");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_1_1.setBounds(10, 210, 195, 31);
		angl.add(lblNewLabel_2_1_1_1_1);
		
		UO = new JTextField();
		UO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		UO.setColumns(10);
		UO.setBounds(190, 210, 88, 31);
		angl.add(UO);
		
		
		
		JLabel angl4 = new JLabel("");
		angl4.setHorizontalAlignment(SwingConstants.CENTER);
		angl4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		angl4.setBounds(328, 222, 108, 36);
		angl.add(angl4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 0, 444, 291);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0411\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438 \u0435\u0437. \u0438 \u041B\u0418\u0422");
		lblNewLabel.setBounds(10, 11, 248, 40);
		panel.add(lblNewLabel);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BG.setText("");
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		BG = new JTextField();
		BG.setBounds(268, 12, 95, 39);
		panel.add(BG);
		BG.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		BG.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0410\u043D\u0433\u043B\u0438\u0439\u0441\u043A\u0438 \u0435\u0437\u0438\u043A \u041E\u041E\u041F");
		lblNewLabel_1.setBounds(10, 76, 248, 40);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		AE = new JTextField();
		AE.setBounds(268, 77, 95, 39);
		panel.add(AE);
		AE.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		AE.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430 \u041E\u041E\u041F");
		lblNewLabel_1_1.setBounds(10, 139, 201, 40);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		MOOP = new JTextField();
		MOOP.setBounds(219, 140, 95, 39);
		panel.add(MOOP);
		MOOP.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		MOOP.setColumns(10);
		
		lblNewLabel_1_2 = new JLabel("\u0413\u0440\u0430\u0436\u0434\u0430\u043D\u0441\u043A\u043E \u043E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435");
		lblNewLabel_1_2.setBounds(10, 190, 304, 40);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		GO = new JTextField();
		GO.setBounds(320, 191, 95, 39);
		panel.add(GO);
		GO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		GO.setColumns(10);
		
		lblNewLabel_1_3 = new JLabel("\u0424\u0412\u0421");
		lblNewLabel_1_3.setBounds(10, 239, 81, 40);
		panel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		
		FVS = new JTextField();
		FVS.setBounds(76, 240, 95, 39);
		panel.add(FVS);
		FVS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		FVS.setColumns(10);
		
		JPanel angl_1 = new JPanel();
		angl_1.setLayout(null);
		angl_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		angl_1.setBackground(Color.WHITE);
		angl_1.setBounds(483, 270, 446, 241);
		frame.getContentPane().add(angl_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430  \u043C\u043E\u0434\u0443\u043B\u0438");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2.setBounds(122, 0, 236, 40);
		angl_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("\u0412\u0435\u0440\u043E\u044F\u0442\u043D\u043E\u0441\u0442\u0438 \u0438 \u0430\u043D\u0430\u043B\u0438\u0437");
		lblNewLabel_2_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VA.setText("");
				
			}
		});
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_2.setBounds(10, 51, 243, 31);
		angl_1.add(lblNewLabel_2_1_2);
		
		VA = new JTextField();
		VA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		VA.setColumns(10);
		VA.setBounds(256, 51, 88, 30);
		angl_1.add(VA);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("\u041F\u0440\u0430\u043A\u0442\u0438\u0447\u0435\u0441\u043A\u0430 \u043C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u043A\u0430 ");
		lblNewLabel_2_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PM.setText("");
			}
		});
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_2.setBounds(10, 105, 274, 31);
		angl_1.add(lblNewLabel_2_1_1_2);
		
		PM = new JTextField();
		PM.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		PM.setColumns(10);
		PM.setBounds(290, 105, 88, 31);
		angl_1.add(PM);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("\u041F\u0440\u0430\u043A\u0442\u0438\u043A\u0443\u043C \u043F\u043E \u043C\u0430\u0442. \u0430\u043D\u0430\u043B\u0438\u0437");
		lblNewLabel_2_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PA.setText("");
			}
		});
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_1_2.setBounds(10, 157, 282, 31);
		angl_1.add(lblNewLabel_2_1_1_1_2);
		
		PA = new JTextField();
		PA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		PA.setColumns(10);
		PA.setBounds(300, 157, 88, 31);
		angl_1.add(PA);
		
		
		
		JLabel mat = new JLabel("");
		mat.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		mat.setBounds(133, 199, 108, 36);
		angl_1.add(mat);
		
		JPanel angl_1_1 = new JPanel();
		angl_1_1.setLayout(null);
		angl_1_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		angl_1_1.setBackground(Color.WHITE);
		angl_1_1.setBounds(10, 294, 446, 241);
		frame.getContentPane().add(angl_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0442\u0438\u043A\u0430  \u043C\u043E\u0434\u0443\u043B\u0438");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2_1.setBounds(107, 0, 256, 40);
		angl_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0438\u0440\u0430\u043D\u0435 \u043D\u0430 \u0438\u043D\u0444. \u0441\u0438\u0441\u0442.");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_2_1.setBounds(10, 51, 308, 31);
		angl_1_1.add(lblNewLabel_2_1_2_1);
		
		PI = new JTextField();
		PI.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		PI.setColumns(10);
		PI.setBounds(315, 51, 88, 30);
		angl_1_1.add(PI);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("\u0420\u0435\u043B\u0430\u0446\u0438\u043E\u043D\u0435\u043D \u043C\u043E\u0434\u0435\u043B \u0431\u0430\u0437\u0438 \u0434\u0430\u043D\u043D\u0438");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_2_1.setBounds(10, 105, 328, 31);
		angl_1_1.add(lblNewLabel_2_1_1_2_1);
		
		RB = new JTextField();
		RB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		RB.setColumns(10);
		RB.setBounds(348, 105, 88, 31);
		angl_1_1.add(RB);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("\u041F\u0440\u0430\u043A\u0442\u0438\u043A\u0443\u043C \u0438\u043D\u0444. \u0441\u0438\u0441\u0442\u0435\u043C\u0438");
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_1_1_2_1.setBounds(10, 157, 282, 31);
		angl_1_1.add(lblNewLabel_2_1_1_1_2_1);
		
		PS = new JTextField();
		PS.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		PS.setColumns(10);
		PS.setBounds(300, 157, 88, 31);
		angl_1_1.add(PS);
		
		
		
		JLabel inf = new JLabel("");
		inf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		inf.setBounds(127, 194, 108, 36);
		angl_1_1.add(inf);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 2));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(483, 513, 446, 40);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("\u0411\u044A\u043B\u0433\u0430\u0440\u0441\u043A\u0438 \u0435\u0437. \u0438 \u041B\u0418\u0422 \u0420\u041F");
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1_2_2.setBounds(10, 0, 261, 42);
		panel_1.add(lblNewLabel_2_1_2_2);
		
		BGR = new JTextField();
		BGR.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		BGR.setColumns(10);
		BGR.setBounds(281, 6, 88, 31);
		panel_1.add(BGR);
		
		JLabel TOTAL = new JLabel("");
		TOTAL.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		TOTAL.setBounds(648, 559, 281, 57);
		frame.getContentPane().add(TOTAL);
		frame.setTitle("\u0423\u0441\u043F\u0435\u0445 ");
		frame.setBounds(100, 100, 976, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 546, 446, 70);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("\u041E\u0446\u0435\u043D\u043A\u0430 \u0437\u0430 \u0434\u0432\u0435\u0442\u0435 \u0433\u043E\u0434\u0438\u043D\u0438");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2_1_1.setBounds(10, 11, 277, 48);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		JLabel O = new JLabel("");
		O.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		O.setBounds(275, 11, 142, 48);
		panel_2.add(O);
		
		JButton angl2 = new JButton("\u0421\u041C\u0415\u0422\u041D\u0418");
		angl2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		angl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double a3=Double.parseDouble(LIT.getText());
				Double b3=Double.parseDouble(CO.getText());
				Double c3=Double.parseDouble(PO.getText());
				Double d3=Double.parseDouble(UO.getText());
				double m=0;
				m=(a3+b3+c3+d3)/4;
				angl4.setText(String.format("%.2f", m));
				
			}
		});
		
		
		angl2.setBounds(328, 184, 108, 31);
		angl.add(angl2);
		
		JButton mat2 = new JButton("\u0421\u041C\u0415\u0422\u041D\u0418");
		mat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double a2=Double.parseDouble(VA.getText());
				Double b2=Double.parseDouble(PM.getText());
				Double c2=Double.parseDouble(PA.getText());
				double w=0;
				w=(a2+b2+c2)/3;
				mat.setText(String.format("%.2f",w));
			}
		});
		mat2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		mat2.setBounds(10, 199, 108, 31);
		angl_1.add(mat2);
		
		JButton inf2 = new JButton("\u0421\u041C\u0415\u0422\u041D\u0418");
		inf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double a1=Double.parseDouble(PI.getText());
				Double b1=Double.parseDouble(RB.getText());
				Double c1=Double.parseDouble(PS.getText());
				double j=0;
				j=(a1+b1+c1)/3;
				inf.setText(String.format("%.2f",j));
				
			}
		});
		inf2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		inf2.setBounds(10, 199, 108, 31);
		angl_1_1.add(inf2);
		
		JButton i = new JButton("\u0429\u0415 \u0423\u0421\u041F\u0415\u042F");
		i.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double a=Double.parseDouble(BG.getText());
				Double b=Double.parseDouble(AE.getText());
				Double c=Double.parseDouble(MOOP.getText());
				Double d=Double.parseDouble(GO.getText());
				Double f=Double.parseDouble(FVS.getText());
				Double g=Double.parseDouble(BGR.getText());
				
				Double a3=Double.parseDouble(LIT.getText());
				Double b3=Double.parseDouble(CO.getText());
				Double c3=Double.parseDouble(PO.getText());
				Double d3=Double.parseDouble(UO.getText());
				double m=0;
				m=(a3+b3+c3+d3)/4;
				
				Double a2=Double.parseDouble(VA.getText());
				Double b2=Double.parseDouble(PM.getText());
				Double c2=Double.parseDouble(PA.getText());
				double w=0;
				w=(a2+b2+c2)/3;
				
				Double a1=Double.parseDouble(PI.getText());
				Double b1=Double.parseDouble(RB.getText());
				Double c1=Double.parseDouble(PS.getText());
				double j=0;
				j=(a1+b1+c1)/3;
						
				double s=0;
				s=(j+w+m+a+b+c+d+f+g)/9;
				double s1=5.65;
				
				TOTAL.setText(String.format("ŒˆÌÍ‡Ú‡ Â " + "%.2f",s));
				O.setText(String.format("%.2f", (s+s1)/2 ));
			}
		});
		i.setBounds(483, 559, 155, 57);
		frame.getContentPane().add(i);
		
		
		
		
		
		
	}
}
