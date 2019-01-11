// Authors: Liam Kastell & Sean Beckerle
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

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
		
		
		//Creates Major and Minor JPanels
		JPanel assetWindow = new JPanel();
		JPanel sideBar = new JPanel();
		JPanel interactionWindow = new JPanel();
		JPanel windows = new JPanel();
		
		//Instantiates Box Layouts for both Major Panels
		mainWindow.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		//BoxLayout boxLayout = new BoxLayout(sideBar,  BoxLayout.Y_AXIS);
		//BoxLayout boxLayout2 = new BoxLayout(windows, BoxLayout.Y_AXIS);
				
		//Creates Menu Bar
		JMenuBar menuBar = new JMenuBar(); 

		//Creates Menu Items
		JMenu file = new JMenu("File"); 
		JMenu edit = new JMenu("Edit");
		JMenu importData = new JMenu("Import");
		JMenu help = new JMenu("Help");
		
		//Creates Menu SubItems
		JMenuItem fileNew = new JMenuItem("New"); 
		JMenuItem fileOpen = new JMenuItem("Open");
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
		file.add(fileOpen);
		file.addSeparator();
		file.add(fileSave);
		file.add(fileSaveAs);
		file.addSeparator();
		file.add(fileExport);
		
		edit.add(editUndo);
		edit.add(editRedo);
		edit.addSeparator();
		edit.add(editCut);
		edit.add(editCopy);
		edit.add(editPaste);
		edit.addSeparator();
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
		
		//Sets the Layout for Major JPanels
		//sideBar.setLayout(boxLayout);
		//windows.setLayout(boxLayout2);
		
		//Creates Descriptor JLabels for each Visible JPanel
		JLabel contentExplorer = new JLabel("Content Explorer");
		JLabel devWindow = new JLabel("Development Window");
		JLabel interaction = new JLabel("Interaction Window");
		
		//Creates Bevel Borders for each Visible JPanel
		sideBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		assetWindow.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		interactionWindow.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		//contentExplorer.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//contentExplorer.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		//devWindow.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		//interaction.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		
		//Adds Descriptor JLabels for each Visible JPanel
		sideBar.add(contentExplorer);
		assetWindow.add(devWindow);
		interactionWindow.add(interaction);
		
		//Sets the size for all JPanels
		sideBar.setSize(250,1080);
		windows.setSize(1670, 1080);
		assetWindow.setSize(1670, 600);
		interactionWindow.setSize(1620, 480);
		
		//sideBar.setAlignmentX(JFrame.LEFT_ALIGNMENT);
		//windows.setAlignmentX(JFrame.RIGHT_ALIGNMENT);
		//assetWindow.setAlignmentY(JFrame.TOP_ALIGNMENT);
		//interactionWindow.setAlignmentY(JFrame.BOTTOM_ALIGNMENT);
		
		//Sets up the ActionListener for each MenuItem
		fileOpen.addActionListener(new MenuOperations(mainWindow, 'N'));	
		fileOpen.addActionListener(new MenuOperations(mainWindow, 'O'));	
		fileSave.addActionListener(new MenuOperations(mainWindow, 'S'));
		fileSaveAs.addActionListener(new MenuOperations(mainWindow, '-'));
		fileExport.addActionListener(new MenuOperations(mainWindow, 'E'));
		
		editUndo.addActionListener(new MenuOperations(mainWindow, 'Z'));
		editRedo.addActionListener(new MenuOperations(mainWindow, 'Y'));
		editCut.addActionListener(new MenuOperations(mainWindow, 'X'));
		editCopy.addActionListener(new MenuOperations(mainWindow, 'C'));
		editPaste.addActionListener(new MenuOperations(mainWindow, 'V'));
		editFind.addActionListener(new MenuOperations(mainWindow, 'F'));
		
		imprtImage.addActionListener(new MenuOperations(mainWindow, 'I'));
		imprtAudio.addActionListener(new MenuOperations(mainWindow, 'A'));
		imprtVideo.addActionListener(new MenuOperations(mainWindow, 'D'));
		
		helpFAQ.addActionListener(new MenuOperations(mainWindow, 'Q'));
		helpForum.addActionListener(new MenuOperations(mainWindow, 'R'));
		helpAbout.addActionListener(new MenuOperations(mainWindow, 'B'));
		
		//Adds the Minor JPanels to the Major JPanels
		//windows.add(assetWindow);
		//windows.add(interactionWindow);
		
		//Adds the Major JPanels to the JFrame
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 0.33;
		//constraints.anchor = GridBagConstraints.FIRST_LINE_START;
		constraints.weighty = 0.5;
		//constraints.ipady = 1000;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridheight = 2;
		
		mainWindow.add(sideBar, constraints);
		//constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		
		mainWindow.add(assetWindow, constraints);
		//constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		
		mainWindow.add(interactionWindow, constraints);
		
		//mainWindow.add(windows);
		
		//Sets up the main window
		mainWindow.setJMenuBar(menuBar);
		mainWindow.setSize(1920, 1080);
		mainWindow.setVisible(true);
	}
	
}
