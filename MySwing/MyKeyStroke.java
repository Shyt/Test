package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyKeyStroke {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("Кнопка");
        jPanel.add(jButton);

        /*Он позволяет назначать клавиши клавиатуры*/

        //Создаем связку ctrl + shift + B
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl shift B");

        //inputMap - это сочитание клавишь чтоб он понимал
        //InputMap inputMap jPanel.getInputMap(JComponent.WHEN_FOCUSED); - это фокус работает только над той панелью что активная и где нужно нажать, пример кнопка только в фокусе этой книпкисработает сочитание клавиш.
        //InputMap inputMap jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT); - это позволяет действовать над всей панели, у вас есть например на ней кнопка и теперь не нужно навадить имеено на нее чтоб сработало оно сработает в любом месте в радиусе этой панели
        //InputMap inputMap jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); - этот фокус будет действовать над всем окном где быты не находился сочитание клавиш сработает.

        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, "id"); //id - это типа индификатор чтоб в другом месте определиться.
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("id", myAction); //id который пришит и экшен который должен исполнить сочитание клвиш

    }

    static class MyAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.DARK_GRAY);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("Test");

        return jFrame;
    }
}
