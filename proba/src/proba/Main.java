package proba;

import java.awt.Color;
import java.awt.Font;


public class Main{

public static void main(String[] args){
	Input in = new Input();
	Font font = new Font("Times New Roman", Font.BOLD, 14);
	in.resize(400, 400);
	in.setVisible(true);
	in.setForeground(Color.black);
	
	in.setFont(font);
	}
}