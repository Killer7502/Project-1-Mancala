package main;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.Color;

import javax.swing.JTextField;

/**
 * Custom rounded JTextField.
 * @author Natalie Williams
 * @version 1.0
 */
public class RoundedTextField extends JTextField {
	/**
	 * I don't know what a serialVersionUID does but it said I needed it ¯\_('-' )_/¯
	 */
	private static final long serialVersionUID = 141164098300635403L;
	private Shape shape;
	   public RoundedTextField(int size) {
	   super(size);
	   setOpaque(false);
	}
	protected void paintComponent(Graphics g) {
	   g.setColor(new Color(161, 103, 53));
	   g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	   g.setColor(getForeground());
	   g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	public boolean contains(int x, int y) {
	   if (shape == null || !shape.getBounds().equals(getBounds())) {
	      shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   }
	   return shape.contains(x, y);
	   }
	}
