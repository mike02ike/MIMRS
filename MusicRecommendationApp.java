import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MusicRecommendationApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Music Recommendation System");

        Label label = new Label("Hello, music lover!");
        Button recommendButton = new Button("Get Recommendations");

        recommendButton.setOnAction(e -> {
            // Handle button click event (fetch recommendations and update UI).
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(label, recommendButton);
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}