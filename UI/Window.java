package com.company.FP.UI;;


import javax.swing.*;
import java.awt.*;

public class Window {
    public static void main(String[] args) {

        JFrame startFrame = new JFrame("Ferst Programm"); //создаем окно с названием
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие окна при нажатие крестик
        startFrame.setLocation(0,0);//создаем положение окна на нашем компе((х 0, у 0) это левый верхний угол)
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//получаем размер экрана
        startFrame.setSize(screenSize);//устанавливаем его по размеру экрана
        startFrame.add(new Panel());

        //делаем окно вилимым
        startFrame.setVisible(true);
    }
}
