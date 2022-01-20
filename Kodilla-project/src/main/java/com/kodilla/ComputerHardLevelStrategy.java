package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;

public class ComputerHardLevelStrategy implements ComputerStrategy {

    @Override
    public void computerMove(List<Button> emptyButtons, List<Button> buttons, boolean isComputerX, boolean isTurnX, Image x) {
        if ((isTurnX && isComputerX && emptyButtons.size() > 0) || (!isComputerX && !isTurnX && emptyButtons.size() > 0)) {
            Button button0 = buttons.get(0);
            Button button1 = buttons.get(1);
            Button button2 = buttons.get(2);
            Button button3 = buttons.get(3);
            Button button4 = buttons.get(4);
            Button button5 = buttons.get(5);
            Button button6 = buttons.get(6);
            Button button7 = buttons.get(7);
            Button button8 = buttons.get(8);

            ImageView imageView0 = ((ImageView) button0.getGraphic());
            ImageView imageView1 = ((ImageView) button1.getGraphic());
            ImageView imageView2 = ((ImageView) button2.getGraphic());
            ImageView imageView3 = ((ImageView) button3.getGraphic());
            ImageView imageView4 = ((ImageView) button4.getGraphic());
            ImageView imageView5 = ((ImageView) button5.getGraphic());
            ImageView imageView6 = ((ImageView) button6.getGraphic());
            ImageView imageView7 = ((ImageView) button7.getGraphic());
            ImageView imageView8 = ((ImageView) button8.getGraphic());


            if ((imageView0 != null && imageView0.getImage().equals(x)) ||
                    (imageView1 != null && imageView1.getImage().equals(x)) ||
                    (imageView2 != null && imageView2.getImage().equals(x)) ||
                    (imageView3 != null && imageView3.getImage().equals(x)) ||
                    (imageView4 != null && imageView4.getImage().equals(x)) ||
                    (imageView5 != null && imageView5.getImage().equals(x)) ||
                    (imageView6 != null && imageView6.getImage().equals(x)) ||
                    (imageView7 != null && imageView7.getImage().equals(x)) ||
                    (imageView8 != null && imageView8.getImage().equals(x))) {
                if (imageView4 == null) {
                    button4.fire();
                } else if (imageView0 != null && imageView1 != null && imageView2 == null) {
                    button2.fire();
                } else if (imageView8 == null) {
                    button8.fire();
                } else if (imageView1 == null) {
                    button1.fire();
                } else if (imageView7 == null) {
                    button7.fire();
                } else if (imageView6 == null) {
                    button6.fire();
                } else if (imageView2 == null) {
                    button2.fire();
                } else if (imageView5 == null) {
                    button5.fire();
                } else if (imageView3 == null) {
                    button3.fire();
                }
            }
        }
    }
}
