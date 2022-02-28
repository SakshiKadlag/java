import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
String s1="";
String opt="";
float n1,n2;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 JTextField txt1;
 JPanel p1,p2;
public static void main(String args[])
{
Calculator cl=new Calculator();

}

Calculator()
{
// JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
// JTextField txt1;
// String s1="";
// String opt="";
// float n1,n2;
//JPanel p1,p2;
p1=new JPanel();
p2=new JPanel();

setTitle("Simple Calculator");
setSize(500,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());
// setVisible(true);

p1.setLayout(new FlowLayout());
txt1=new JTextField(25);
p1.add(txt1);

p2.setLayout(new GridLayout(4,4,5,5));
b1=new JButton("1");
p2.add(b1);

b2=new JButton("2");
p2.add(b2);

b3=new JButton("3");
p2.add(b3);

b4=new JButton("+");
p2.add(b4);

b5=new JButton("4");
p2.add(b5);

b6=new JButton("5");
p2.add(b6);

b7=new JButton("6");
p2.add(b7);

b8=new JButton("-");
p2.add(b8);

b9=new JButton("7");
p2.add(b9);

b10=new JButton("8");
p2.add(b10);

b11=new JButton("9");
p2.add(b11);

b12=new JButton("*");
p2.add(b12);

b13=new JButton("0");
p2.add(b13);

b14=new JButton(".");
p2.add(b14);

b15=new JButton("=");
p2.add(b15);

b16=new JButton("/");
p2.add(b16);

add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.SOUTH);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);


 setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
s1=s1+b1.getLabel();

if(ae.getSource()==b2)
s1=s1+b2.getLabel();

if(ae.getSource()==b3)
s1=s1+b3.getLabel();

// if(ae.getSource()==b4)
// s1=s1+b4.getLabel();

if(ae.getSource()==b5)
s1=s1+b5.getLabel();

if(ae.getSource()==b6)
s1=s1+b6.getLabel();

if(ae.getSource()==b7)
s1=s1+b7.getLabel();

// if(ae.getSource()==b8)
// s1=s1+b8.getLabel();

if(ae.getSource()==b9)
s1=s1+b9.getLabel();

if(ae.getSource()==b10)
s1=s1+b10.getLabel();

if(ae.getSource()==b11)
s1=s1+b11.getLabel();


// if(ae.getSource()==b12)
// s1=s1+b12.getLabel();

if(ae.getSource()==b13)
s1=s1+b13.getLabel();

if(ae.getSource()==b14)
s1=s1+b14.getLabel();

// if(ae.getSource()==b15)
// s1=s1+b15.getLabel();

// if(ae.getSource()==b16)
// s1=s1+b16.getLabel();

txt1.setText(s1);

if(ae.getSource()==b4)
{
opt="+";
txt1.setText("");
n1=Float.parseFloat(s1);
s1="";
}

if(ae.getSource()==b8)
{
opt="-";
txt1.setText("");
n1=Float.parseFloat(s1);
s1="";
}

if(ae.getSource()==b12)
{
opt="*";
txt1.setText("");
n1=Float.parseFloat(s1);
s1="";
}


if(ae.getSource()==b16)
{
opt="/";
txt1.setText("");
n1=Float.parseFloat(s1);
s1="";
}

if(ae.getSource()==b15)
{
if(opt.equals("+"))
{
n2=Float.parseFloat(s1);
txt1.setText((n1+n2)+"");
s1="";
}
else if(opt.equals("-"))
{
n2=Float.parseFloat(s1);
txt1.setText((n1-n2)+"");
s1="";
}

else if(opt.equals("*"))
{
n2=Float.parseFloat(s1);
txt1.setText((n1*n2)+"");
s1="";
}

else if(opt.equals("/"))
{
n2=Float.parseFloat(s1);
txt1.setText((n1/n2)+"");
s1="";
}

}

}


}
