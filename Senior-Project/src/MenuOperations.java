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
	
	//Problem where all methods execute because actionPerformed is tripped for all buttons upon an action, may need to make a class for each MenuItem
	public void open()
	{
		JFileChooser open = new JFileChooser();
		if(open.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
		{
			File file = open.getSelectedFile();
		}
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
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		switch (flag)
		{
		case 'O':
			open();
		case 'S':
			save();
		case '-':
			saveAs();
		}
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
