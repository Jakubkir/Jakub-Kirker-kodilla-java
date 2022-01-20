package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.List;
import java.util.Random;

public class ComputerEasyLevelStrategy implements ComputerStrategy {
    private Random random = new Random();

    @Override
    public void computerMove(List<Button> emptyButtons, List<Button> buttons, boolean isComputerX, boolean isTurnX, Image x) {
        if ((isTurnX && isComputerX && emptyButtons.size() > 0) || (!isComputerX && !isTurnX && emptyButtons.size() > 0)) {
            int index = random.nextInt(emptyButtons.size());
            emptyButtons.get(index).fire();
        }

    }
}
