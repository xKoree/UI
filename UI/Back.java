package com.company.FP.UI;;

import javax.swing.*;
import java.awt.*;

public class Back {
    Image img = new ImageIcon("image/1-java.png").getImage();

    public void draw(Graphics2D g) {
        Color bacColor = new Color (120,30,140);
        g.setColor(bacColor);

        if (Panel.state.equals(Panel.STATES.MENUE)) g.fillRect(0,0,Panel.WIDTH, Panel.HEIGHT);


    }
}
