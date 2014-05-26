import java.awt.Event;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class View extends JFrame 
{
	JPanel jp;
	JButton jb1;
	JLabel jl1;
	GridBagConstraints c;
	
	
	public View() 
	{	
		c = new GridBagConstraints();		
		jp = new JPanel();
		jb1 = new JButton("First");
		jl1 = new JLabel("Label");
		jp.setLayout(new GridBagLayout());		
		add(jp);	
		
		c.gridx = 0;
		c.gridy = 0;
		jp.add(jb1, c);
		
		
		c.gridx = 0;
		c.gridy = 2;
		jp.add(jl1, c);
		
		setVisible(true);
		pack();	

		
	}
	
	public JButton getButton()
	{
		return jb1;
	}
	
	public void setText(String text)
	{
		jl1.setText(text);
	}

	
	

}
