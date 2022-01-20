package com.kodilla;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class TicTacTouJavaFX extends Application {
    private boolean isTurnX = true;
    private boolean isComputerX = false;
    private final Image circle = new Image("file:src/main/resources/kolko.png");
    private final Image x = new Image("file:src/main/resources/x.png");
    private final Image tlo = new Image("file:src/main/resources/tlo3.jpg");
    private final Image tlo2 = new Image("file:src/main/resources/tlo2.png");
    private Text winnerText;
    private List<Button> buttons = new LinkedList<Button>();
    private List<Button> emptyButtons = new LinkedList<Button>();
    private List<Button> buttonsPlayer = new LinkedList<Button>();
    private Random random = new Random();
    private static final HashMap<String, Integer> score = new HashMap<String, Integer>();
    private ComputerStrategy computerStrategy = new ComputerEasyLevelStrategy();


    private final Text tableX = new Text("X = ");
    private final Text tableO = new Text("0 = ");

    static {
        score.put("X", 0);
        score.put("0", 0);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void startGame(Stage stage) {

        computerStrategy = new ComputerEasyLevelStrategy();
        tableX.setFill(Color.WHITE);
        tableO.setFill(Color.WHITE);

        BackgroundSize backgroundSize = new BackgroundSize(300, 300, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(tlo, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        BackgroundImage backgroundImage2 = new BackgroundImage(tlo2, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background2 = new Background(backgroundImage);

        Button newGame = new Button();
        newGame.setText("New Game");
//        newGame.setBackground(null);
        newGame.setPrefSize(100, 50);
        newGame.setOnAction(e -> {
            reset(stage);

        });

        Button X = new Button();
        X.setText("X");
//        X.setBackground(null);
//        X.setStyle("-fx-text-fill: white");
        X.setPrefSize(100, 50);
        X.setOnAction(e -> {
            isTurnX = true;
            isComputerX = false;
        });

        Button O = new Button();
        O.setText("O");
//        O.setBackground(null);
        O.setPrefSize(100, 50);
        O.setOnAction(e -> {
            isTurnX = false;
            isComputerX = true;
        });

        Button level = new Button();
        level.setText("HARD");
        level.setPrefSize(100, 50);
        level.setOnAction(e -> {
            computerStrategy = new ComputerHardLevelStrategy();
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setGridLinesVisible(false);
        grid.setBackground(background);
        grid.setBackground(background2);
        grid.getRowConstraints().addAll(
                List.of(
                        new RowConstraints(50),
                        new RowConstraints(50),
                        new RowConstraints(50),
                        new RowConstraints(100),
                        new RowConstraints(100),
                        new RowConstraints(100),
                        new RowConstraints(50),
                        new RowConstraints(50),
                        new RowConstraints(50)
                )
        );
        grid.getColumnConstraints().addAll(
                List.of(
                        new ColumnConstraints(50),
                        new ColumnConstraints(50),
                        new ColumnConstraints(50),
                        new ColumnConstraints(100),
                        new ColumnConstraints(100),
                        new ColumnConstraints(100),
                        new ColumnConstraints(50),
                        new ColumnConstraints(50),
                        new ColumnConstraints(50)
                )
        );
        grid.add(newGame, 5, 1);
        grid.add(X, 3, 1);
        grid.add(O, 4, 1);
        buttonsPlayer.add(X);
        buttonsPlayer.add(O);
        grid.add(tableX, 6, 3);
        grid.add(tableO, 7, 3);
        grid.add(level, 3, 2);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
//                button.setBackground(null);
                button.setPrefSize(100, 100);
                int a = 9;
                button.setOnAction(event -> {
                    if (isTurnX) {
                        button.setGraphic(new ImageView(x));
                    } else {
                        button.setGraphic(new ImageView(circle));
                    }
                    button.setDisable(true);
                    isTurnX = !isTurnX;
                    emptyButtons.remove(button);
                    checkWinner();
                    makeComputerMove();
                });
                grid.add(button, i + 3, j + 3);
                buttons.add(button);
                emptyButtons.add(button);
            }
        }

        Scene scene = new Scene(grid, 600, 600, Color.WHITE);

        stage.setTitle("TicTacTou");
        stage.setScene(scene);
        stage.show();
    }

    private void cleanup() {
        emptyButtons.clear();
        buttons.clear();
        buttonsPlayer.clear();
        if (isComputerX) {
            isTurnX = false;
        } else
            isTurnX = true;
    }

    private void reset(Stage stage) {
        cleanup();
        startGame(stage);
    }

    private void gameScore() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        startGame(primaryStage);
    }


    private void checkWinner() {
        checkHorizontal();
        checkVertical();
        checekDiagonal();
    }

    private void checekDiagonal() {
        Button button0 = buttons.get(0);
        Button button4 = buttons.get(4);
        Button button8 = buttons.get(8);
        Button button2 = buttons.get(2);
        Button button6 = buttons.get(6);

        if (button0.getGraphic() != null && button4.getGraphic() != null && button8.getGraphic() != null) {
            Image image0 = ((ImageView) button0.getGraphic()).getImage();
            Image image4 = ((ImageView) button4.getGraphic()).getImage();
            Image image8 = ((ImageView) button8.getGraphic()).getImage();
            if (image0.equals(image4) && image4.equals(image8)) {
                endGame(image0);
            }
        }

        if (button2.getGraphic() != null && button4.getGraphic() != null && button6.getGraphic() != null) {
            Image image2 = ((ImageView) button2.getGraphic()).getImage();
            Image image4 = ((ImageView) button4.getGraphic()).getImage();
            Image image6 = ((ImageView) button6.getGraphic()).getImage();
            if (image2.equals(image4) && image4.equals(image6)) {
                endGame(image2);
            }
        }
    }

    private void checkVertical() {
        for (int i = 0; i < 9; i = i + 3) {
            Button button1 = buttons.get(i);
            Button button2 = buttons.get(i + 1);
            Button button3 = buttons.get(i + 2);
            if (button1.getGraphic() != null && button2.getGraphic() != null && button3.getGraphic() != null) {
                Image image1 = ((ImageView) button1.getGraphic()).getImage();
                Image image2 = ((ImageView) button2.getGraphic()).getImage();
                Image image3 = ((ImageView) button3.getGraphic()).getImage();
                if (image1.equals(image2) && image2.equals(image3)) {
                    endGame(image1);
                }
            }
        }
    }

    private void checkHorizontal() {
        for (int i = 0; i < 3; i++) {
            Button button1 = buttons.get(i);
            Button button2 = buttons.get(i + 3);
            Button button3 = buttons.get(i + 6);
            if (button1.getGraphic() != null && button2.getGraphic() != null && button3.getGraphic() != null) {
                Image image1 = ((ImageView) button1.getGraphic()).getImage();
                Image image2 = ((ImageView) button2.getGraphic()).getImage();
                Image image3 = ((ImageView) button3.getGraphic()).getImage();
                if (image1.equals(image2) && image2.equals(image3)) {
                    endGame(image1);
                }
            }
        }
    }

    private void endGame(Image image) {
        System.out.println("WIN WIN WIN");
        emptyButtons.clear();
        buttons.forEach(button -> button.setDisable(true));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        if (x.equals(image)) {
            alert.setContentText("WIN WIN WIN X");
        } else {
            alert.setContentText("WIN WIN WIN 0");
        }
        addScore(image);
        alert.showAndWait();
    }

    private void makeComputerMove() {
        computerStrategy.computerMove(emptyButtons, buttons, isComputerX, isTurnX, x);
    }

    private void addScore(Image image) {
        if (x.equals(image)) {
            int xScore = score.get("X");
            xScore++;
            score.put("X", xScore);
            tableX.setText("X = " + xScore);

        } else {
            int oScore = score.get("0");
            oScore++;
            score.put("0", oScore);
            tableO.setText("0 = " + oScore);
        }
    }
}
