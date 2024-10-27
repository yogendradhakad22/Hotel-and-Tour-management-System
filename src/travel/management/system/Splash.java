
package travel.management.system;

/*
 *
 *  @author yogen
 */
import java.awt.*; // for image class
import java.awt.event.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args) {
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true); // frame visibility
        int i;
        int x = 1;
        for (i = 2; i <= 600; i += 10, x += 7) { // for dynamically increasing the size of the frame
            f1.setLocation(900 - ((i + x) / 2), 500 - (i / 2)); // increasing the size of frame
            f1.setSize(i + x, i);
            try {        // for pause between growth of frame in every loop
                Thread.sleep(10); //10 millisec of pause in every loop
            } catch (Exception e) {
            }
        }

    }
}

class SplashFrame extends JFrame implements Runnable {
    Thread t1;

    SplashFrame() {
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/splash.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1030, 750, Image.SCALE_DEFAULT); // modify the image we have taken
        ImageIcon i2 = new ImageIcon(i1);

        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        try {
            Thread.sleep(4000); // Frame hold time 4sec
            this.setVisible(false); // after hold visible remove frame 

            Login l = new Login();
            l.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
