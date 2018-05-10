package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyAction {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        /* В отличии от экшен листенер нельзя перезапустить другими кнопками, в отличии от экшена к нему можно прявязать много реалезаций потому ка это вызвается классом.
         */

        //Вызвали с помощью кнопки.
        JButton jButton = new JButton(new MyActions());
        jButton.setText("Кнопка");
        jPanel.add(jButton);



    }


    static class MyActions extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.DARK_GRAY);
        }
        MyActions(){
            putValue(AbstractAction.SHORT_DESCRIPTION, "Это title что в html");
        }
    }


    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("Test");

        return jFrame;
    }
}

