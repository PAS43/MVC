import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller
{
	private Model mRef;
	private View vRef;
	private ActionListener a;
	
	public Controller(Model m, View v) 
	{
		this.mRef = m;
		this.vRef = v;
	}
	

	int inc()
	{	
		mRef = new Model();
		return mRef.counter();
	}


	
	public void buttonClicked() 
	{
		a = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				vRef.setText(mRef.counter().toString());
			}
		};
		vRef.getButton().addActionListener(a);
	}


}