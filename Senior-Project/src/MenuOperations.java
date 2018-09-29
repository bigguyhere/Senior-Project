import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.io.File;
import java.awt.event.*;

public class MenuOperations implements ActionListener
{	
	JFrame frame;
	char flag;
	
	public MenuOperations(JFrame jframe, char jflag)
	{
	  frame = jframe;
	  flag = jflag;
	}
	
	public void newProject()
	{
		
	}
	
	public void open()
	{
		
	}
	
	public void save()
	{
		
	}
	
	public void saveAs()
	{
		JFileChooser save = new JFileChooser();
		if(save.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
		{
			File file = save.getSelectedFile();
			file.setExecutable(true);
			file.setReadable(true);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(flag == '-')
			saveAs();
	}
	
	public void export()
	{
		
	}
	
	public void undo()
	{
		
	}
	
	public void redo()
	{
		
	}
	
	public void cut()
	{
		
	}
	
	public void copy()
	{
		
	}
	
	public void paste()
	{
		
	}
	
	public void find()
	{
		
	}
	
}
