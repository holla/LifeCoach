package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    private final int DIALOG_WIDTH = 400;
    private final int DIALOG_HEIGHT = 500;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, DIALOG_WIDTH, DIALOG_HEIGHT));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }




}
