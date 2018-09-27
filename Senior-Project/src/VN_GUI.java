// Authors: Liam Kastell & Sean Beckerle
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class VN_GUI 
{
	public static void main(String[] args)
	{
		start();
	}
	
	public static void start()
	{
		//Sets up JFrame
		JFrame mainWindow = new JFrame("Visual Novel Engine");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates Menu Bar
		JMenuBar menuBar = new JMenuBar(); 

		//Creates Menu Items
		JMenu file = new JMenu("File"); 
		JMenu edit = new JMenu("Edit");
		JMenu importData = new JMenu("Import");
		JMenu help = new JMenu("Help");
		
		//Creates Menu SubItems
		JMenuItem fileNew = new JMenuItem("New"); 
		JMenuItem fileSave = new JMenuItem("Save");
		JMenuItem fileSaveAs = new JMenuItem("Save As");
		JMenuItem fileExport = new JMenuItem("Export");
		
		JMenuItem editUndo = new JMenuItem("Undo");
		JMenuItem editRedo = new JMenuItem("Redo");
		JMenuItem editCut = new JMenuItem("Cut");
		JMenuItem editCopy = new JMenuItem("Copy");
		JMenuItem editPaste = new JMenuItem("Paste");
		JMenuItem editFind = new JMenuItem("Find");
		
		JMenuItem imprtImage = new JMenuItem("Image");
		JMenuItem imprtAudio = new JMenuItem("Audio");
		JMenuItem imprtVideo = new JMenuItem("Video");
		
		JMenuItem helpFAQ = new JMenuItem("FAQ");
		JMenuItem helpForum = new JMenuItem("Forum");
		JMenuItem helpAbout = new JMenuItem("About");
		
		//Allows user to use keyboard shortcuts
		file.setMnemonic(KeyEvent.VK_F); //Alt-F
		edit.setMnemonic(KeyEvent.VK_E); //Alt-E
		importData.setMnemonic(KeyEvent.VK_I); //Alt-I
		help.setMnemonic(KeyEvent.VK_H); //Alt-H
		
		fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl N
		fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl S
		fileExport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl E
		
		editUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl Z
		editRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl Y
		editCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl X
		editCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl C
		editPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl V
		editFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl F
		
		imprtImage.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl I
		imprtAudio.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); // Ctrl A
		imprtVideo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl D
		
		helpFAQ.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl Q
		helpForum.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); // Ctrl R
		helpAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())); //Ctrl B
		
		//Adds SubItems to Menu
		file.add(fileNew);
		file.add(fileSave);
		file.add(fileSaveAs);
		file.add(fileExport);
		
		edit.add(editUndo);
		edit.add(editRedo);
		edit.add(editCut);
		edit.add(editCopy);
		edit.add(editPaste);
		edit.add(editFind);
		
		importData.add(imprtImage);
		importData.add(imprtAudio);
		importData.add(imprtVideo);
		
		help.add(helpFAQ);
		help.add(helpForum);
		help.add(helpAbout);
		
		//Adds Menu to MenuBar
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(importData);
		menuBar.add(help);
		
		/*
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("Test");
		panel.add(lbl);
		mainWindow.add(panel);
		*/
		
		//Creates the main window
		mainWindow.setJMenuBar(menuBar);
		mainWindow.setSize(1920, 1080);
		
		mainWindow.setVisible(true);
	}
	
}
