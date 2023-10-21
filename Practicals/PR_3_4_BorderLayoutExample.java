import java.awt.*;

public class PR_3_4_BorderLayoutExample {
       public static void main(String[] args) {
	       Frame frame = new Frame();
	       frame.setLayout(new BorderLayout());
	       frame.setSize(300, 300);
	       frame.add(new Button("North"), BorderLayout.NORTH);
	       frame.add(new Button("South"), BorderLayout.SOUTH);
	       frame.add(new Button("East"), BorderLayout.EAST);
	       frame.add(new Button("West"), BorderLayout.WEST);
	       frame.add(new Button("Center"), BorderLayout.CENTER);
	       frame.setVisible(true);
	}
}
