//Practical No:1  Program Code:2
//Design an applet/application to create form using TextField , TextArea , Button and Label

import java.awt.*;
import java.applet.*;
/*<applet code="FormApplet" width= 900 height=900>
</applet>*/

public class FormApplet extends Applet
{
	public void init()
	{
		setLayout(null);
		setBackground(Color.magenta);
		
		Font f1 = new Font("SanSerif",Font.BOLD | Font.ITALIC, 26);
		Label l1 = new Label("STUDENT'S INFORMATION");
		l1.setFont(f1);
		
		Font f2 = new Font("SanSerif",Font.BOLD, 18);
		Font f3 = new Font("SanSerif",Font.BOLD, 16);
		
		Label l2 = new Label ("Enter First Name:");
		TextField tf2 = new TextField();
		tf2.setFont(f3);
		Label l3 = new Label ("Enter Middle Name:");
		TextField tf3 = new TextField();
		tf3.setFont(f3);
		Label l4 = new Label ("Enter Last Name:");
		TextField tf4 = new TextField();
		tf4.setFont(f3);
	
	
		
		Label l5 = new Label("Address");
		TextArea ta = new TextArea("Enter Address Here,");
		
		Label l6 = new Label("Select Gender:");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Male",false,cbg);
		Checkbox cb2 = new Checkbox("Female",false,cbg);
		
		Button b1 = new Button("Cancel");
		Button b2 = new Button("Submit");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		
		
		
		l1.setBounds(250,50,390,50);
		
		l2.setBounds(100,170,200,50);
		tf2.setBounds(350,170,200,40);
		l2.setFont(f2);
		l3.setBounds(100,230,200,50);
		tf3.setBounds(350,230,200,40);
		l3.setFont(f2);
		l4.setBounds(100,290,200,50);
		tf4.setBounds(350,290,200,40);
		l4.setFont(f2);
		
		l6.setBounds(100,350,200,50);
		l6.setFont(f2);
		cb1.setBounds(350,350,100,40);
		cb1.setFont(f2);
		cb2.setBounds(500,350,100,40);
		cb2.setFont(f2);
		
		l5.setBounds(100,450,100,50);
		l5.setFont(f2);
		ta.setBounds(350,450,300,150);
		ta.setFont(f2);
		
		b1.setBounds(200,720,100,50);
		b1.setFont(f2);
		b2.setBounds(450,720,100,50);
		b2.setFont(f2);
		
		
		add(l1);
		add(l2);add(tf2);
		add(l3);add(tf3);
		add(l4);add(tf4);
		add(l6);add(cb1);add(cb2);
		add(l5);add(ta);
		add(b1);add(b2);
		
	}
}