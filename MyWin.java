import java.awt.Color;
import java.awt.Container;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyWin extends JFrame implements ActionListener {
	
	//Global Components
	JTextArea text;
	JButton add, sub, mult, div, clear, exp, log, one, two, three, four, five, six, seven, eight, nine, zero, pt, eq;
		
	MyWin(String title)
	{
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,250);
		//this.pack();
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
	add = new JButton("+");
	add.setBackground(Color.RED);
	sub = new JButton("-");
	sub.setBackground(Color.RED);
	mult = new JButton ("*");
	mult.setBackground(Color.RED);
	div = new JButton ("/");
	div.setBackground(Color.RED);
	exp = new JButton ("^");
	exp.setBackground(Color.RED);
	log = new JButton ("log");
	log.setBackground(Color.RED);
	clear = new JButton ("C");
	clear.setBackground(Color.RED);
	one = new JButton ("1");
	one.setBackground(Color.RED);
	two = new JButton ("2");
	two.setBackground(Color.RED);
	three = new JButton ("3");
	three.setBackground(Color.RED);
	four = new JButton ("4");
	four.setBackground(Color.RED);
	five = new JButton ("5");
	five.setBackground(Color.RED);
	six = new JButton ("6");
	six.setBackground(Color.RED);
	seven = new JButton ("7");
	seven.setBackground(Color.RED);
	eight = new JButton ("8");
	eight.setBackground(Color.RED);
	nine = new JButton ("9");
	nine.setBackground(Color.RED);
	zero = new JButton ("0");
	zero.setBackground(Color.RED);
	pt = new JButton (".");
	pt.setBackground(Color.RED);
	eq = new JButton ("=");
	eq.setBackground(Color.RED);
	

	
	JPanel panel = new JPanel(new GridBagLayout());
	
	
	text = new JTextArea(0,1);

	
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.HORIZONTAL;
	
	this.add(panel);
	panel.setBorder(BorderFactory.createBevelBorder(MAXIMIZED_BOTH));
	
	//Container con = this.getContentPane();
	//con.add(panel);
		
		c.gridx = 0;
		c.gridy = 0;
		panel.add(add, c);
		
		/**
		c.gridx = 4;
		c.gridy = 5;
		c.gridwidth = 1;
		panel.add(text, c);
		*/
		
		c.gridx = 1;
		c.gridy = 0;
		panel.add(sub, c);

		
		c.gridx = 2;
		c.gridy = 0;
		panel.add(mult, c);
		
		c.gridx = 3;
		c.gridy = 1;
		panel.add(div, c);
		
		
		c.gridx = 3;
		c.gridy = 2;
		panel.add(exp, c);
		
		c.gridx = 3;
		c.gridy = 3;
		panel.add(log, c);
		
		c.gridx = 0;
		c.gridy = 1;
		panel.add(one, c);
		
		c.gridx = 1;
		c.gridy = 1;
		panel.add(two, c);
		
		c.gridx = 2;
		c.gridy = 1;
		panel.add(three, c);
		
		c.gridx = 0;
		c.gridy = 2;
		panel.add(four, c);
		
		c.gridx = 1;
		c.gridy = 2;
		panel.add(five, c);
		
		c.gridx = 2;
		c.gridy = 2;
		panel.add(six, c);
		
		c.gridx = 0;
		c.gridy = 3;
		panel.add(seven, c);
		
		c.gridx = 1;
		c.gridy = 3;
		panel.add(eight, c);
		
		c.gridx = 2;
		c.gridy = 3;
		panel.add(nine, c);
		
		c.gridx = 0;
		c.gridy = 4;
		panel.add(zero, c);
		
		c.gridx = 1;
		c.gridy = 4;
		panel.add(pt, c);
		
		c.gridx = 2;
		c.gridy = 4;
		//c.gridwidth = 1;
		panel.add(eq, c);
		
		c.gridx = 3;
		c.gridy = 4;
		//c.gridwidth = 2;
		panel.add(clear, c);
		
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 4;
		panel.add(text, c); 
		
		/**
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		panel.add(exp);
		panel.add(log);
		panel.add(clear);
		*/
		
		this.setVisible(true);

		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		exp.addActionListener(this);
		log.addActionListener(this);
		clear.addActionListener(this);
	}

	//beginning the constructor
	/**
	MyWin(String title)
	{
		super(title);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,852);
		//this.pack();
		//this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		

	}//end constructor
	*/

protected void paintComponent(Graphics g) {
	super.paintComponents(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	int w = getWidth();
	int h = getHeight();
	Color color1 = Color.BLUE;
	Color color2 = Color.RED;
	GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
	g2d.setPaint(gp);
	g2d.fillRect(0, 0, w, h);
}//end paint

double number1, number2, result;
int addf, subf, multf, divf, expf, logf;
@Override
public void actionPerformed(ActionEvent e) 
{
	// TODO Auto-generated method stub	
	if(e.getSource() == clear) {
		text.setText(" ");
		number1 = 0.0;
		number2 = 0.0;
	}//end if
	
	else if(e.getSource() == add) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 1;
		subf = 0;
		multf = 0;
		divf = 0;
		expf = 0;
		logf = 0;
	}//end add
	
	else if(e.getSource() == sub) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 0;
		subf = 1;
		multf = 0;
		divf = 0;
		expf = 0;
		logf = 0;
	}//end sub
	
	else if(e.getSource() == mult) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 0;
		subf = 0;
		multf = 1;
		divf = 0;
		expf = 0;
		logf = 0;
	}//end mult
	
	else if(e.getSource() == div) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 0;
		subf = 0;
		multf = 0;
		divf = 1;
		expf = 0;
		logf = 0;
	}//end div
	
	else if(e.getSource() == exp) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 0;
		subf = 0;
		multf = 0;
		divf = 0;
		expf = 1;
		logf = 0;
	}//end exp
	
	else if(e.getSource() == log) {
		String a;
		a = text.getText();
		number1 = Double.valueOf(a);
		
		text.setText(" ");
		addf = 0;
		subf = 0;
		multf = 0;
		divf = 0;
		expf = 0;
		logf = 1;
	}//end log
	
	else if(e.getSource() == one) {
		text.append("1");
	}
	
	else if(e.getSource() == two) {
		text.append("2");
	}
	
	else if(e.getSource() == three) {
		text.append("3");
	}
	
	else if(e.getSource() == four) {
		text.append("4");
	}
	
	else if(e.getSource() == five) {
		text.append("5");
	}
	
	else if(e.getSource() == six) {
		text.append("6");
	}
	
	else if(e.getSource() == seven) {
		text.append("7");
	}
	
	else if(e.getSource() == eight) {
		text.append("8");
	}
	
	else if(e.getSource() == nine) {
		text.append("9");
	}
	
	else if(e.getSource() == zero) {
		text.append("0");
	}
	
	else if(e.getSource() == pt) {
		text.append(".");
	}
	
	else {
		text.setText("ERROR");
	
	}//end else
	if(e.getSource() == eq) {
		String ss = text.getText();
		double number2;
		number2 = Double.valueOf(ss);
		
		if(addf > 0) {
			double result;
			result = number1 + number2;
			text.setText(Double.toString(result));
		}
		
		if(subf > 0) {
			double result;
			result = number1 - number2;
			text.setText(Double.toString(result));
		}
		
		if(multf > 0) {
			double result;
			result = number1 * number2;
			text.setText(Double.toString(result));
		}
		if(divf > 0) {
			double result;
			result = number1 / number2;
			text.setText(Double.toString(result));
		}
		if(expf > 0){
			double result;
			result = Math.pow(number1, number2);
			text.setText(Double.toString(result));
		}
		if(logf > 0) {
			double result;
			result = Math.log(number1) / Math.log(number2);
			text.setText(Double.toString(result));
		}
	
	}//end equals
}//end void

}//end class