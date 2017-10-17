import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	private String title;
	public static int WIDTH;
	public static int HEIGHT;
	PanelForDraw panelDraw = new PanelForDraw();
	PanelForFields panelFields = new PanelForFields();
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem newItem = new JMenuItem("New");
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	JMenuItem exportItem = new JMenuItem("Export as..");
	JMenu aboutMenu = new JMenu();

	
	
	public Window(String title) {
		this.title = title;
	}
	
	public void init() {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(600, 400));
		setLocationRelativeTo(null);
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exportItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
 		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		setLayout(new BorderLayout());
		add(panelDraw, BorderLayout.CENTER);
		add(panelFields, BorderLayout.EAST);
		WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		setVisible(true);
	}
	public static void main(String[] args) {
		Window window = new Window("Electro Circuit");
		window.init();
	}
}