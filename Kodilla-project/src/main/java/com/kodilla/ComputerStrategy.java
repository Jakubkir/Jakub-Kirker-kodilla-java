package com.kodilla;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.util.List;

public interface ComputerStrategy {
    void computerMove(List<Button> emptyButtons, List<Button> buttons, boolean isComputerX, boolean isTurnX, Image x);
}
