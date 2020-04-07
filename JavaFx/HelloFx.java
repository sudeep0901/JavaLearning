import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloFx extends Application {

    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println(args);
        Application.launch(args);
    }
    @Override
    public void start(Stage stage){
        Integer width = Integer.parseInt(getParameters().getNamed().get("width"));
        Integer hieght = Integer.parseInt(getParameters().getNamed().get("hieght"));

        stage.setTitle("Hello JavaFx");
        Group group = new Group(new Label("Hello Label"));
        // Scene scene = new Scene(group, 300, 500);
        Scene scene = new Scene(group, width, hieght);
        System.out.println(getParameters().getUnnamed());

        System.out.println(getParameters().getRaw());
        stage.setScene(scene);
        stage.show();
    }
}

// java HelloFx
// javac HelloFx.java
// java HelloFx --width=300 --hieght=200
// java HelloFx --width=300 --hieght=200 sudeep