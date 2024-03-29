import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.BasicConfigurator;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BasicConfigurator.configure();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Spis Terminali");
        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
