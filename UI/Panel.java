package com.company.FP.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;


public class Panel extends JPanel implements ActionListener {

//размер панели
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    //координаты мыши
    public static int mouseX;
    public static int mouseY;

    //активные страницы меню
    public static boolean buttmenue = true;
    public static boolean settmenue = false;
    public static STATES state;

//при помощи "enum" можно задать d программе 2 путя развития, как сделать чтобы был только только один путь MENUE
    public static enum STATES{MENUE}
    public static STATES states = STATES.MENUE;

private BufferedImage image;
private Graphics2D g;

    Timer mainTimer = new Timer(30,this);

    Back back = new Back();
    Menue menue = new Menue();

            public Panel(){
        super();
        setFocusable(true);
        requestFocus();
        mainTimer.start();

        image = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
        g = (Graphics2D) image.getGraphics();

                addMouseListener( new Listeners());// добавляем обработчик событий клик мышь
                addKeyListener( new Listeners());// добавляем обработчик событий клава
                addMouseMotionListener(new Listeners());//добавляем обработчик событий перемещение мышь

            }

    @Override
    public void actionPerformed(ActionEvent e) {
if (states.equals(STATES.MENUE)){
    back.draw(g);

    if(buttmenue) {
        menue.draw(g);
        menue.moveButt(menue.button1);
        menue.moveButt(menue.button2);
    }

    if(settmenue){

    }

    gameDraw();// прорисовать в панели
    }
    }


    private void gameRender() {
                back.draw(g);
    }

    private void gameDraw() {
                Graphics g2 = this.getGraphics();
                g2.drawImage(image, 0, 0,  null);
                g2.dispose();//команда для уборки мусора

    }


}
