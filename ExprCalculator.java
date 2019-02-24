package MyPack;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class ExprCalculator extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf;
	JButton b;
	JLabel l ;
	JLabel res;
	JPanel p;
	Color c = new Color(255,0,0,100);
	public ExprCalculator()
	{   setLayout(null);
		setSize(500,200);
		
		JLabel l = new JLabel("Enter any algebric expressions for e.g 3 + ( 5 * 9 - 2 ) + 3 * 5");
		
		p = new JPanel();
		add(p);
		p.setBackground(Color.blue);
		b =new JButton("Evaluate"); 
          tf= new JTextField(50);
          res  = new JLabel("Result : NA");
          
          l.setBounds(50, 10, 400, 20);
          tf.setBounds(50,40,350,30);
          res.setBounds(50, 60, 400, 50);
          b.setBounds(50,100,100,30);
         
		add(l);
		add(tf);
		add(res);
		add(b);
		
		setVisible(true);
		JOptionPane.showMessageDialog(this,"Warning! \n Remember to seperate each value/symbol by space.");
		
		
		b.addActionListener(this); //ActionListener interface object
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		  try{
				 String expr =tf.getText();
				 int result = EvaluateString.evaluate(expr);
				 
					   res.setText("Result : "+ result);
					   }
					   catch(Exception ee)
					   {
						  res.setText("Invalid data");
					   }
		
	}
	
}
