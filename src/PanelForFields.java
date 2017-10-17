import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class PanelForFields extends JPanel{
	private static final long serialVersionUID = 1L;
	public static int Width = 200;
	public static int Height = 400;
	private JLabel labelFields = new JLabel("Панель інструментів");
	private JScrollPane scroll = new JScrollPane();
	
	public PanelForFields() {
		setBackground(new Color(0, 0, 0, 230));
		setPreferredSize(new Dimension(Width, Height));
        setFocusable(true);
        requestFocus();
        setLayout(new FlowLayout());
        labelFields.setForeground(Color.WHITE);
        add(labelFields);
	}
}