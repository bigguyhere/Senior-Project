// Authors: Liam Kastell & Sean Beckerle
import java.awt.event.*;
import java.awt.Toolkit;
import javax.swing.*;

public class VN_GUI 
{
	public static void main(String[] args)
	{
		VN_GUI.start();
	}
	
	public static void start()
	{
		JFrame mainWindow = new JFrame("Visual Novel Engine");
		JMenu file = new JMenu("File"); //Menu Items
		JMenuItem newProject = new JMenuItem("New"); //Menu SubItems
		JMenuItem save = new JMenuItem("Save");
		JMenuBar menuBar = new JMenuBar(); //Creates Menu Bar
		
		//Allows user to use shortcuts
		file.setMnemonic(KeyEvent.VK_F); //Alt-F
		newProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl N
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); // Ctrl S
		
		//Adds SubItems to Menu
		file.add(newProject);
		file.add(save);
		
		
		
		//Adds Menu to MenuBar
		menuBar.add(file);
		
		//Creates the main window
		mainWindow.setJMenuBar(menuBar);
		mainWindow.setSize(1920, 1080);
		
		mainWindow.setVisible(true);
	}
	
}
