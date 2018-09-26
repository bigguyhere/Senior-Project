import java.awt.event.*;
import javax.swing.*;

public class VN_GUI 
{
	public static void main(String[] args)
	{
		JFrame mainWindow = new JFrame("Visual Novel Engine");
		
		JMenu menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.add(menu);
		
		mainWindow.setJMenuBar(menuBar);
		mainWindow.setSize(1920, 1080);
		
		mainWindow.setVisible(true);
		
	}
	
}
