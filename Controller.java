import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller
{
	private Model mRef;
	private View vRef;
	
	public Controller(Model m, View v) 
	{
		this.mRef = m;
		this.vRef = v;
	}
	

	int inc()
	{	
		mRef = new Model();
		mRef.incCounter();
		return mRef.getCounter();
	}


	
	public void buttonClicked() 
	{
	
		vRef.getButton().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				vRef.setText(mRef.getCounter().toString());
				mRef.incCounter();
			}
		});
	}


}