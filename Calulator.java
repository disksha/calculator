package Pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField write;
	int calculation;
	double ans;
	double num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setMaximumSize(new Dimension(2147483620, 2147483647));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 176, 33);
		contentPane.add(lblNewLabel);
		
		write = new JTextField();
		write.setFont(new Font("Tahoma", Font.BOLD, 20));
		write.setBounds(10, 72, 273, 44);
		contentPane.add(write);
		write.setColumns(10);
		
		JButton deletebuttn = new JButton("DEL");
		deletebuttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText("");
				int length=write.getText().length();
				int number=write.getText().length()-1;
				String store;
				if(length>0) {
					StringBuilder back=new StringBuilder(write.getText());
					back.deleteCharAt(number);
					store=back.toString();
					write.setText(store);;
					
				}
				
			}
		});
		 
		JLabel jLabel1 = new JLabel("");
		jLabel1.setForeground(new Color(255, 255, 240));
		jLabel1.setFont(new Font("Tahoma", Font.BOLD, 20));
		jLabel1.setBounds(176, 22, 107, 44);
		contentPane.add(jLabel1);
		
		deletebuttn.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		deletebuttn.setFont(new Font("Verdana", Font.BOLD, 15));
		deletebuttn.setBounds(148, 127, 67, 44);
		contentPane.add(deletebuttn);
		
		JButton clr = new JButton("AC");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText("");
			}
		});
		clr.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		clr.setFont(new Font("Verdana", Font.BOLD, 15));
		clr.setBounds(10, 127, 128, 44);
		contentPane.add(clr);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText(write.getText() +"/");
				num=Double.parseDouble(write.getText());
				calculation=4;
				write.setText(" ");
				jLabel1.setText(num+ "/");
			}
		});
		div.setBackground(new Color(255, 140, 0));
		div.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		div.setFont(new Font("Verdana", Font.BOLD, 15));
		div.setBounds(217, 127, 67, 44);
		contentPane.add(div);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"7");
			}
		});
		seven.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		seven.setFont(new Font("Verdana", Font.BOLD, 15));
		seven.setBounds(10, 182, 67, 44);
		contentPane.add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"8");
			}
		});
		eight.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		eight.setFont(new Font("Verdana", Font.BOLD, 15));
		eight.setBounds(79, 182, 67, 44);
		contentPane.add(eight);
		
		JButton nine = new JButton("9");
		nine.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		nine.setFont(new Font("Verdana", Font.BOLD, 15));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"9");
			}
		});
		nine.setBounds(148, 182, 67, 44);
		contentPane.add(nine);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText(write.getText() +"*");
				num=Double.parseDouble(write.getText());
				calculation=3;
				write.setText(" ");
				jLabel1.setText(num+ "*");
			}
		});
		mul.setBackground(new Color(255, 140, 0));
		mul.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		mul.setFont(new Font("Verdana", Font.BOLD, 15));
		mul.setBounds(216, 182, 67, 44);
		contentPane.add(mul);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"4");
			}
		});
		four.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		four.setFont(new Font("Verdana", Font.BOLD, 15));
		four.setBounds(10, 237, 67, 44);
		contentPane.add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"5");
			}
		});
		five.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		five.setFont(new Font("Verdana", Font.BOLD, 15));
		five.setBounds(79, 237, 67, 44);
		contentPane.add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"6");
			}
		});
		six.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		six.setFont(new Font("Verdana", Font.BOLD, 15));
		six.setBounds(148, 237, 67, 44);
		contentPane.add(six);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText(write.getText() +"-");
				num=Double.parseDouble(write.getText());
				calculation=2;
				write.setText(" ");
				jLabel1.setText(num+ "-");
			}
		});
		sub.setBackground(new Color(255, 140, 0));
		sub.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		sub.setFont(new Font("Verdana", Font.BOLD, 15));
		sub.setBounds(217, 237, 67, 44);
		contentPane.add(sub);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"1");
				
			}
		});
		one.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		one.setFont(new Font("Verdana", Font.BOLD, 15));
		one.setBounds(10, 289, 67, 44);
		contentPane.add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"2");
			}
		});
		two.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		two.setFont(new Font("Verdana", Font.BOLD, 15));
		two.setBounds(79, 289, 67, 44);
		contentPane.add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +"3");
			}
		});
		three.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		three.setFont(new Font("Verdana", Font.BOLD, 15));
		three.setBounds(148, 289, 67, 44);
		contentPane.add(three);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText(write.getText() +"+");
				num=Double.parseDouble(write.getText());
				calculation=1;
				write.setText(" ");
				jLabel1.setText(num+ "+");
			}
		});
		add.setBackground(new Color(255, 140, 0));
		add.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		add.setFont(new Font("Verdana", Font.BOLD, 15));
		add.setBounds(217, 289, 67, 44);
		contentPane.add(add);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			write.setText(write.getText() +"0");
			}
		});
		zero.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		zero.setFont(new Font("Verdana", Font.BOLD, 15));
		zero.setBounds(10, 338, 136, 44);
		contentPane.add(zero);
		
		JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				write.setText(write.getText() +".");
			}
		});
		point.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		point.setFont(new Font("Verdana", Font.BOLD, 15));
		point.setBounds(148, 338, 67, 44);
		contentPane.add(point);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				write.setText(write.getText() +"=");
				airthmethic();
			}
		});
		equal.setBackground(new Color(255, 140, 0));
		equal.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
		equal.setFont(new Font("Verdana", Font.BOLD, 15));
		equal.setBounds(217, 338, 67, 44);
		contentPane.add(equal);
		
//		JLabel jLabel1 = new JLabel("");
//		jLabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
//		jLabel1.setBounds(176, 33, 107, 33);
//		contentPane.add(jLabel1);
	}
	public void airthmethic() {
		switch(calculation) {
		case 1://add
			ans=num+Double.parseDouble(write.getText());
			write.setText(Double.toString(ans));
			break;
			
		case 2://sub
			ans=num - Double.parseDouble(write.getText());
			write.setText(Double.toString(ans));
			break;
			
		case 3://mul
			ans=num* Double.parseDouble(write.getText());
			write.setText(Double.toString(ans));
			break;	
		case 4://mul
			ans=num/Double.parseDouble(write.getText());
			write.setText(Double.toString(ans));
			break;	
			
			
			
			
		}
	}
}
