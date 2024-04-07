import com.devstack.pos.db.HibernateUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try(Session session= HibernateUtil.openSession()){

        }
    }
}
