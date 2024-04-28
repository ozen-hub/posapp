import com.devstack.pos.db.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("com/devstack/pos/views/LoginForm.fxml"))));
       primaryStage.show();
    }
}
