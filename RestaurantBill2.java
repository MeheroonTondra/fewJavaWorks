import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RestaurantBill2
{
   public static void main(String[] args)
   {
      JPanel panel = new JPanel();
      panel.setBackground(Color.PINK);
      JButton button = new JButton("Add");
      JLabel label = new JLabel("Chicken Wings");
	  JButton a = new JButton("Add");
      JLabel a1 = new JLabel("Beef Burger");
	  JButton b = new JButton("Add");
      JLabel b1 = new JLabel("Chicken Sandwich");
	  JButton c = new JButton("Add");
      JLabel c1 = new JLabel("Passta");
	  JButton d = new JButton("Add");
      JLabel d1 = new JLabel("Chicken in Pita");
	  JButton e = new JButton("Add");
      JLabel e1 = new JLabel("Cheese Burger");
	  JButton f = new JButton("Add");
      JLabel f1 = new JLabel("Pespi");
	  JButton g = new JButton("Add");
      JLabel g1 = new JLabel("Mountain Dew");
	  JButton h = new JButton("Add");
      JLabel h1 = new JLabel("Ice tea");
	  JButton i = new JButton("Add");
      JLabel i1 = new JLabel("Juice");
      panel.add(button);
      panel.add(label);
	  panel.add(a);
      panel.add(a1);
	  panel.add(b);
      panel.add(b1);
	  panel.add(c);
      panel.add(c1);
	  panel.add(d);
      panel.add(d1);
	  panel.add(e);
      panel.add(e1);
	  panel.add(f);
      panel.add(f1);
	  panel.add(g);
      panel.add(g1);
	  panel.add(h);
      panel.add(h1);
	  panel.add(i);
      panel.add(i1);
	  JLabel another = new JLabel("Enter food item");
      final int FIELD_WIDTH = 10;
      JTextField area = new JTextField(FIELD_WIDTH);
	  panel.add(another);
	  panel.add(area);
      JFrame frame = new JFrame();
      frame.add(panel);
      final int FRAME_WIDTH = 800;
      final int FRAME_HEIGHT = 800;
      frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
      frame.setTitle("Restaurant Menu");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}