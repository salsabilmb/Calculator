package calulatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
//import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class calculatrice {

	private JFrame frmCalculatriceBasic;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatrice window = new calculatrice();
					window.frmCalculatriceBasic.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatriceBasic = new JFrame();
		frmCalculatriceBasic.getContentPane().setBackground(new Color(255, 239, 213));
		frmCalculatriceBasic.setTitle("Calculatrice Basic");
		frmCalculatriceBasic.setBounds(100, 100, 262, 373);
		frmCalculatriceBasic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatriceBasic.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 233, 48);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frmCalculatriceBasic.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 257, 104, 36);
		btn0.setBackground(new Color(192, 192, 192));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setForeground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn0);
		
		
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(14, 210, 45, 36);
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setForeground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(69, 210, 45, 36);
		btn2.setBackground(new Color(192, 192, 192));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setForeground(Color.BLACK);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn2);
		
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(122, 210, 45, 36);
		btn3.setBackground(new Color(192, 192, 192));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setForeground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn3);
		
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 163, 45, 36);
		btn4.setBackground(new Color(192, 192, 192));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setForeground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(69, 163, 45, 36);
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setForeground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(122, 163, 45, 36);
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setForeground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 116, 45, 36);
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
				
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(69, 116, 45, 36);
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setForeground(Color.BLACK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg8) {
				String EnterNumber =textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(122, 116, 45, 36);
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setForeground(Color.BLACK);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber =textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn9);
		
		JButton btn10 = new JButton(".");
		btn10.setBounds(124, 257, 45, 36);
		btn10.setBackground(new Color(192, 192, 192));
		btn10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn10.setForeground(Color.BLACK);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( ! textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + btn10.getText());
		          }
			}
		});
		frmCalculatriceBasic.getContentPane().add(btn10);
		
		JButton btnegal = new JButton("=");
		btnegal.setBounds(180, 259, 63, 36);
		btnegal.setBackground(Color.PINK);
		btnegal.setForeground(Color.BLACK);
		btnegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operation =="+")
				{
					result = firstnum + secondnum ;
				    answer=String.format("%.2f",result);
				    textField.setText(answer);	
			}
				else if(operation =="*")
				{
					result = firstnum * secondnum ;
				    answer=String.format("%.2f",result);
				    textField.setText(answer);	
			}
				else
					if(operation =="-")
					{
						result = firstnum - secondnum ;
					    answer=String.format("%.2f",result);
					    textField.setText(answer);	
				}
					else
						if(operation =="/")
						{
							result = firstnum / secondnum ;
						    answer=String.format("%.2f",result);
						    textField.setText(answer);	
					}
			}});
		frmCalculatriceBasic.getContentPane().add(btnegal);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setBounds(180, 165, 63, 36);
		btnmul.setBackground(Color.PINK);
		btnmul.setForeground(Color.BLACK);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frmCalculatriceBasic.getContentPane().add(btnmul);
		
		JButton btnsou = new JButton("-");
		btnsou.setBounds(180, 118, 63, 36);
		btnsou.setForeground(Color.BLACK);
		btnsou.setBackground(Color.PINK);
		btnsou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		frmCalculatriceBasic.getContentPane().add(btnsou);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv.setBounds(180, 70, 63, 36);
		btndiv.setBackground(Color.PINK);
		btndiv.setForeground(Color.BLACK);
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCalculatriceBasic.getContentPane().add(btndiv);
		
		JButton btnadd = new JButton("+");
		btnadd.setBounds(177, 212, 63, 36);
		btnadd.setBackground(Color.PINK);
		btnadd.setForeground(Color.BLACK);
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		frmCalculatriceBasic.getContentPane().add(btnadd);
		
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnAc.setBounds(10, 69, 50, 36);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnAc.setForeground(Color.BLACK);
		btnAc.setBackground(Color.MAGENTA);
		frmCalculatriceBasic.getContentPane().add(btnAc);
		
		JButton button = new JButton("+/-");
		button.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button.setBounds(122, 69, 45, 36);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =op * (-1);
				textField.setText(String.valueOf(op));
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.PINK);
		frmCalculatriceBasic.getContentPane().add(button);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setBounds(32, 333, 107, 22);
		frmCalculatriceBasic.getContentPane().add(mnFile);
		
		JMenuItem mntmBsic = new JMenuItem("Bsic");
		mnFile.add(mntmBsic);
		
		JMenuItem mntmScientific = new JMenuItem("Scientifique");
		mnFile.add(mntmScientific);
		
		JMenuItem mntmSortire = new JMenuItem("Sortie");
		mnFile.add(mntmSortire);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.cos(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnCos.setForeground(Color.BLACK);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCos.setBackground(new Color(176, 196, 222));
		btnCos.setBounds(253, 257, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnCos);
		
		JButton btnDe = new JButton("De");
		btnDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length() >0)
				{
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace= strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnDe.setForeground(Color.BLACK);
		btnDe.setFont(new Font("Tahoma", Font.ITALIC, 7));
		btnDe.setBackground(Color.ORANGE);
		btnDe.setBounds(69, 69, 45, 36);
		frmCalculatriceBasic.getContentPane().add(btnDe);
		
		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.cosh(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnCosh.setForeground(Color.BLACK);
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCosh.setBackground(new Color(176, 196, 222));
		btnCosh.setBounds(250, 210, 63, 36);
		frmCalculatriceBasic.getContentPane().add(btnCosh);
		
		JButton btnSin = new JButton("log");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.log(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnSin.setForeground(Color.BLACK);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBackground(new Color(176, 196, 222));
		btnSin.setBounds(466, 210, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnSin);
		
		JButton btnTan = new JButton("x^y");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.exp(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnTan.setForeground(Color.BLACK);
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTan.setBackground(new Color(233, 150, 122));
		btnTan.setBounds(396, 118, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnTan);
		
		JButton btnHix = new JButton("Hix");
		btnHix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,16));
			}
		});
		btnHix.setForeground(Color.BLACK);
		btnHix.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHix.setBackground(new Color(221, 160, 221));
		btnHix.setBounds(466, 163, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnHix);
		
		JButton btnOct = new JButton("oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,8));
			}
		});
		btnOct.setForeground(Color.BLACK);
		btnOct.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOct.setBackground(new Color(221, 160, 221));
		btnOct.setBounds(466, 116, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnOct);
		
		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.sinh(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnSinh.setForeground(Color.BLACK);
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSinh.setBackground(new Color(176, 196, 222));
		btnSinh.setBounds(323, 212, 63, 36);
		frmCalculatriceBasic.getContentPane().add(btnSinh);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.tan(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnTanh.setForeground(Color.BLACK);
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTanh.setBackground(new Color(176, 196, 222));
		btnTanh.setBounds(396, 212, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnTanh);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =(op*op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnX.setForeground(Color.BLACK);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnX.setBackground(new Color(233, 150, 122));
		btnX.setBounds(253, 165, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnX);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,2));
			}
		});
		btnBin.setForeground(Color.BLACK);
		btnBin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBin.setBackground(new Color(221, 160, 221));
		btnBin.setBounds(396, 68, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnBin);
		
		JButton btnSin_1 = new JButton("sin");
		btnSin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.sin(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnSin_1.setForeground(Color.BLACK);
		btnSin_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin_1.setBackground(new Color(176, 196, 222));
		btnSin_1.setBounds(323, 259, 63, 36);
		frmCalculatriceBasic.getContentPane().add(btnSin_1);
		
		JButton button_11 = new JButton("\u03C0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.141592654);
				textField.setText(String.valueOf(ops));
				
			}
		});
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBackground(new Color(233, 150, 122));
		button_11.setBounds(396, 165, 60, 36);
		frmCalculatriceBasic.getContentPane().add(button_11);
		
		JButton btnTan_1 = new JButton("tan");
		btnTan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.tan(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnTan_1.setForeground(Color.BLACK);
		btnTan_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan_1.setBackground(new Color(176, 196, 222));
		btnTan_1.setBounds(396, 257, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnTan_1);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =(op*op*op) ;
				textField.setText(String.valueOf(op));
			}
		});
		btnX_1.setForeground(Color.BLACK);
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnX_1.setBackground(new Color(233, 150, 122));
		btnX_1.setBounds(323, 165, 63, 36);
		frmCalculatriceBasic.getContentPane().add(btnX_1);
		
		JButton button_14 = new JButton("\u221A");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double op=Double.parseDouble(String.valueOf(textField.getText()));
				op =Math.sqrt(op) ;
				textField.setText(String.valueOf(op));
			}
		});
		button_14.setForeground(Color.BLACK);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBackground(new Color(233, 150, 122));
		button_14.setBounds(323, 116, 63, 36);
		frmCalculatriceBasic.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		button_15.setForeground(Color.BLACK);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setBackground(new Color(233, 150, 122));
		button_15.setBounds(253, 116, 60, 36);
		frmCalculatriceBasic.getContentPane().add(button_15);
		
		JButton btnLog = new JButton("log10");
		btnLog.setForeground(Color.BLACK);
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLog.setBackground(new Color(176, 196, 222));
		btnLog.setBounds(466, 259, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnLog);
		
		JButton btnEx = new JButton("EXP");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="Exp";
			}
		});
		btnEx.setForeground(Color.BLACK);
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEx.setBackground(new Color(233, 150, 122));
		btnEx.setBounds(326, 69, 60, 36);
		frmCalculatriceBasic.getContentPane().add(btnEx);
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculatriceBasic.setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Affichage");
		menuBar.add(mnFichier);
		
		JMenuItem mntmBsic_1 = new JMenuItem("Bsic");
		mntmBsic_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculatriceBasic.setTitle("Calculatrice Basic");
				frmCalculatriceBasic.setBounds(100, 100, 269, 373);
				textField.setBounds(10,11,233,48);
			}
		});
		mnFichier.add(mntmBsic_1);
		
		JMenuItem mntmScientifique = new JMenuItem("Scientifique");
		mntmScientifique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalculatriceBasic.setTitle("Calculatrice Scientifique");
				frmCalculatriceBasic.setBounds(100, 100, 555, 373);
				textField.setBounds(10,11,520,48);
			}
		});
		mnFichier.add(mntmScientifique);
		
		JMenuItem mntmSortie = new JMenuItem("Sortie");
		mntmSortie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFichier.add(mntmSortie);
		
		
		
		
		
		
		
		
		
		
	}
}
