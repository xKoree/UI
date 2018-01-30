package com.company.FP.UI;;

import javax.swing.*;
import java.awt.*;

import static com.company.FP.UI.Panel.mouseX;
import static com.company.FP.UI.Panel.mouseY;

public class Menue {

    public static boolean click = false;

    ButtMenue button1 = new ButtMenue(10,10,396,100,"image/9.jpg","Menu");
    ButtMenue button2 = new ButtMenue(10,150,396,100,"image/9.jpg","Exit");

    public void draw(Graphics2D g) {
        button1.draw(g);
        button2.draw(g);
    }

    void moveButt(ButtMenue e){
        if (mouseX >e.getX() && mouseX <e.getX() + e.getW()  &&
                mouseY >e.getY() && mouseY < e.getY()+ e.getH()) {// если курсор попал в кнопку
            if(e.equals(button1)){

                if (Menue.click){
                    Panel.settmenue = true;
                    Panel.buttmenue = false;
                }
            }
            if(e.equals(button2)) {

                if (Menue.click) {
                    System.exit(0);
                }
            }
        }
    }

    class ButtMenue{
        //  нач координаты и размер объекта
        private double x;//координа х героя
        private double y;//координа y героя
        private double w ; //ширина обьекта
        private double h ; // высота объекта

        public Color color1;// цвет

        public String f;// надпись над кнопкой

        public String s; // строка адреса картинки

        // Constructor
        public ButtMenue(int x,int y,int w,int h,String s,String f){
            this.x =x;// нач координаты героя
            this.y = y;
            this.w = w;
            this.h = h;
            this.f = f;
            this.s = s;
            color1 = Color.WHITE;



        }
        //  гетеры
        public double getX(){
            return  this.x;
        }
        public double getY(){
            return  this.y;
        }
        public double getW(){
            return  this.w;
        }
        public double getH(){
            return  this.h;
        }

        public void draw(Graphics2D g){
            g.drawImage( new ImageIcon(s).getImage(), (int)x,(int) y, null);//отрисовываем элемент в координатах
            g.setColor(color1);//задаем цвет объекту Соlor
            Font font = new Font("Arial",Font.ITALIC,60);//Создём объект класса фонт (передаем в конструктор параметры)
            g.setFont(font);//устанвливаем наш шрифт

            long length = (int) g.getFontMetrics().getStringBounds(f,g).getWidth();// длина надписи в пиксилях
            g.drawString(f,(int)(x+w/2) - (int)(length / 2),(int)y+(int)(h/ 3)*2);// рисуем строчку в центре панели

        }
    }
}
