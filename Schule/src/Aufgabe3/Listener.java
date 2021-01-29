package Aufgabe3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Listener implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent f) {
	Var.yy = Integer.parseInt(Var.yeingabe.getText())*4;
	Var.xx= Integer.parseInt(Var.xeingabe.getText())*4;
	Var.x=Integer.parseInt(Var.xeingabe.getText())*4+473;
	Var.y=Integer.parseInt(Var.yeingabe.getText())*4+512;
	
	Var.jf1.requestFocus();
		
	}

}
