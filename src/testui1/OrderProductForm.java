package testui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderProductForm extends JFrame {
	private Container c;
	private JLabel l1,l2,l3,l4,l5,l6;
	private JTextField tfc,tfn,tfq;
	private JComboBox jcb;
	private JRadioButton ch1,ch2,ch3;
	private ButtonGroup g;
	private JButton bta,bte;
	private JTextArea d;
	private JScrollPane jsp;

	public OrderProductForm() {
	c=getContentPane();
	c.setLayout(null);
	initUI();
	order();close();
	initForm();
	
	
	}
	public void initUI() {
		l1=new JLabel("Employee Form");
		l1.setBounds(150,30,200,20);c.add(l1);
		l2=new JLabel("Employee ID");l2.setBounds(50,55,80,20);c.add(l2);
		tfc=new JTextField();
		tfc.setBounds(165,55,150,20); c.add(tfc);
		
		l3=new JLabel("Employee Name");l3.setBounds(50,80,120,20);c.add(l3);
		tfn=new JTextField();
		tfn.setBounds(165,80,150,20); c.add(tfn);
		l4=new JLabel("Hour");l4.setBounds(50,105,80,20);c.add(l4);
		tfq=new JTextField();
		tfq.setBounds(165,105,150,20); c.add(tfq);
		l5=new JLabel("Rate");
		l5.setBounds(50,130,80,20); c.add(l5);
		jcb=new JComboBox();
		jcb.setBounds(165,130,150,20);c.add(jcb);
		jcb.addItem("100");
		jcb.addItem("200");
		jcb.addItem("300");
		jcb.addItem("300");
		l6=new JLabel("Rate Tax");
		l6.setBounds(50,155,80,20);c.add(l6);
		ch1=new JRadioButton("10%");
		ch2=new JRadioButton("15%");
		ch3=new JRadioButton("20%");
		ch1.setBounds(165,155,60,20);c.add(ch1);
		ch2.setBounds(230,155,60,20);c.add(ch2);
		ch3.setBounds(295,155,60,20);c.add(ch3);
		g=new ButtonGroup();
		g.add(ch1);g.add(ch2);g.add(ch3);
		bta=new JButton("Add");
		bte=new JButton("Exit");
		bta.setBounds(80,180,80,20);c.add(bta);
		
		bte.setBounds(180,180,80,20);c.add(bte);
		d=new JTextArea();
		jsp=new JScrollPane(d);
		jsp.setBounds(80,205,250,100);c.add(jsp);
		
	}
	public void close() {
		bte.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
				
			}
			
		});
	}
	public void order() {
		
		bta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String report;
				double u=Double.parseDouble(jcb.getSelectedItem().toString());
				double dis=0;
				if(ch1.isSelected())dis=0.1;
				if(ch2.isSelected()) dis=0.15;
				if(ch3.isSelected()) dis=0.2;
				report = tfc.getText()+", "+tfn.getText()+", "+tfq.getText()+", "+u+", "+dis+'\n';
				d.append(report);

			 
			}
			
		});
	}
	public void initForm() {
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new OrderProductForm();
		
	}

}
