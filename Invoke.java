import javax.swing.SwingUtilities;


public class Invoke 
{
	public void run()
	{
		SwingUtilities.invokeLater(new Runnable() 
		{		
			public void run()
			{
				Model M = new Model();
				View V = new View();
				Controller C = new Controller(M,V);
				C.buttonClicked();
			}
		});
	}
}
