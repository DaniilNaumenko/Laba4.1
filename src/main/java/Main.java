
import gui.LibraryScene;
import logic.Library;
import logic.MainThread;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainThread mainThread = new MainThread(new Library());
        LibraryScene libraryScene = new LibraryScene(mainThread);
        primaryStage.setTitle("Lab4.1");
        primaryStage.setScene(libraryScene.getScene());
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}