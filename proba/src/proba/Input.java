package proba;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Input extends Frame implements ActionListener{
	
	TextField tx1 = new TextField("1");
	TextField tx2 = new TextField("3");
	TextField tx3 = new TextField("-2");
	TextField ty1 = new TextField("2");
	TextField ty2 = new TextField("-1");
	TextField ty3 = new TextField("2");
	TextField tz1 = new TextField("1");
	TextField tz2 = new TextField("-1");
	TextField tz3 = new TextField("3");
	TextField t1 = new TextField("-1");
	TextField t2 = new TextField("-1");
	TextField t3 = new TextField("5");
	
	TextField res = new TextField("                          -Result-");
	
	Button calc = new Button("Calculate");
	Button exit = new Button("Exit");
	Button clear = new Button("Clear");
	
	
	Label lname = new Label("СЛАР методом Крамера"); 
	Label l1 = new Label("=");
	Label l2 = new Label("=");
	Label l3 = new Label("=");
	Label lx1 = new Label("x +");
	Label lx2 = new Label("x +");
	Label lx3 = new Label("x +");
	Label ly1 = new Label("y +");
	Label ly2 = new Label("y +");
	Label ly3 = new Label("y +");
	Label lz1 = new Label("z");
	Label lz2 = new Label("z");
	Label lz3 = new Label("z");
	
	Input(){
		setLayout(null);
		setBackground(new Color(0, 180, 140));
		add(clear);
		add(calc);
		add(exit);
		add(tx1);
		add(tx2);
		add(tx3);
		add(ty1);
		add(ty2);
		add(ty3);
		add(tz1);
		add(tz2);
		add(tz3);
		add(t1);
		add(t2);
		add(t3);
		add(lz1);
		add(lz2);
		add(lz3);
		add(lname);
		add(l1);
		add(l2);
		add(l3);
		add(ly1);
		add(ly2);
		add(ly3);
		add(ly3);
		add(lx1);
		add(lx2);
		add(lx3);
		add(res);
		
		res.setBounds(50, 250, 270, 20);
		
		tx1.setBounds(10, 100, 50, 20);
		tx2.setBounds(10, 140, 50, 20);
		tx3.setBounds(10, 190, 50, 20);
		
		ty1.setBounds(100, 100, 50, 20);
		ty2.setBounds(100, 140, 50, 20);
		ty3.setBounds(100, 190, 50, 20);
		
		tz1.setBounds(190, 100, 50, 20);
		tz2.setBounds(190, 140, 50, 20);
		tz3.setBounds(190, 190, 50, 20);
		
		t1.setBounds(300, 100, 50, 20);
		t2.setBounds(300, 140, 50, 20);
		t3.setBounds(300, 190, 50, 20);
		
		lname.setBounds(120, 30, 200, 20);
		l1.setBounds(280, 100, 10, 20);
		l2.setBounds(280, 140, 10, 20);
		l3.setBounds(280, 190, 10, 20);
		
		lx1.setBounds(65, 100, 25, 20);
		lx2.setBounds(65, 140, 25, 20);
		lx3.setBounds(65, 190, 25, 20);
		
		ly1.setBounds(155, 100, 25, 20);
		ly2.setBounds(155, 140, 25, 20);
		ly3.setBounds(155, 190, 25, 20);
		
		lz1.setBounds(245, 100, 10, 20);
		lz2.setBounds(245, 140, 10, 20);
		lz3.setBounds(245, 190, 10, 20);
		
		exit.setBounds(15, 300, 100, 20);
		clear.setBounds(125, 300, 100, 20);
		calc.setBounds(235, 300, 100, 20);
		
		exit.addActionListener(this);
		clear.addActionListener(this);
		calc.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent act) {
		if(act.getSource() == exit)
			System.exit(0); else
				if(act.getSource() == clear){
					tx1.setText("0");
					tx2.setText("0");
					tx3.setText("0");
					ty1.setText("0");
					ty2.setText("0");
					ty3.setText("0");
					tz1.setText("0");
					tz2.setText("0");
					tz3.setText("0");
					t1.setText("0");
					t2.setText("0");
					t3.setText("0");
					res.setText("                          -Result-");
					
				} else
					if(act.getSource() == calc){
						double resD = 0, D1 = 0, D2 = 0, D3 = 0;
						double x = 0, y = 0, z = 0;
						resD = (Double.parseDouble(tx1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(tz3.getText())) + 
							   (Double.parseDouble(tx2.getText()) * Double.parseDouble(tz1.getText()) * Double.parseDouble(ty3.getText())) +
								(Double.parseDouble(tx3.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(tz2.getText())) -
								(Double.parseDouble(tz1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(tx3.getText())) -
								(Double.parseDouble(tx1.getText()) * Double.parseDouble(ty3.getText()) * Double.parseDouble(tz2.getText())) -
								(Double.parseDouble(tx2.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(tz3.getText()));
						//System.out.println(resD);
						D1 = (Double.parseDouble(t1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(tz3.getText())) + 
								   (Double.parseDouble(t2.getText()) * Double.parseDouble(tz1.getText()) * Double.parseDouble(ty3.getText())) +
									(Double.parseDouble(t3.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(tz2.getText())) -
									(Double.parseDouble(tz1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(t3.getText())) -
									(Double.parseDouble(t1.getText()) * Double.parseDouble(ty3.getText()) * Double.parseDouble(tz2.getText())) -
									(Double.parseDouble(t2.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(tz3.getText()));
						//System.out.println(D1);
						D2 = (Double.parseDouble(tx1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(tz3.getText())) + 
								   (Double.parseDouble(tx2.getText()) * Double.parseDouble(tz1.getText()) * Double.parseDouble(t3.getText())) +
									(Double.parseDouble(tx3.getText()) * Double.parseDouble(t1.getText()) * Double.parseDouble(tz2.getText())) -
									(Double.parseDouble(tz1.getText()) * Double.parseDouble(t2.getText()) * Double.parseDouble(tx3.getText())) -
									(Double.parseDouble(tx1.getText()) * Double.parseDouble(t3.getText()) * Double.parseDouble(tz2.getText())) -
									(Double.parseDouble(tx2.getText()) * Double.parseDouble(t1.getText()) * Double.parseDouble(tz3.getText()));
							//System.out.println(D2);
							D3 = (Double.parseDouble(tx1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(t3.getText())) + 
									   (Double.parseDouble(tx2.getText()) * Double.parseDouble(t1.getText()) * Double.parseDouble(ty3.getText())) +
										(Double.parseDouble(tx3.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(t2.getText())) -
										(Double.parseDouble(t1.getText()) * Double.parseDouble(ty2.getText()) * Double.parseDouble(tx3.getText())) -
										(Double.parseDouble(tx1.getText()) * Double.parseDouble(ty3.getText()) * Double.parseDouble(t2.getText())) -
										(Double.parseDouble(tx2.getText()) * Double.parseDouble(ty1.getText()) * Double.parseDouble(t3.getText()));
								//System.out.println(D3);
							x = D1/resD; 
							y = D2/resD;
							z = D3/resD;
							res.setText("  x = "+ x +";   y = "+ y +";   z = "+ z);
					}
		
	}
	
	
	
	
}
