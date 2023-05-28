package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyField extends JFrame {
    Picture p;
    Game game;
    private JPanel panel ;

    private final int COLS = 10;
    private final int ROWS = 10;
    private final int IMG_SIZE = 40;
  Draws draws;
    protected void  startGame(){
        setImage();
        initPanel();
        init();

    }
   protected void initPanel() {
       panel = new JPanel() {
           @Override
           protected void paintComponent(Graphics g) {
               super.paintComponent(g);

               super.paintComponent(g);
               for (Picture picture : Picture.values()) {
                   g.drawImage((Image) picture.image, picture.ordinal() * IMG_SIZE, 0, this);
               }
               panel.setPreferredSize(new Dimension(COLS *IMG_SIZE, ROWS *IMG_SIZE));
               add(panel);
           }
       };
   }



    public void init() {
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Battle");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        pack();

    }
    protected void setImage(){
        for (Picture picture:Picture.values())
            picture.image=getImage(picture.name());
    }


    Image getImage(String names){
        String filename="res/img/"+names.toLowerCase()+".png";
        ImageIcon imageIcon=new ImageIcon(filename);
        return imageIcon.getImage();
    }

}
