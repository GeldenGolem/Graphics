import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;

public class Truck0 extends Application {

    @Override
    public void start(Stage myStage) throws Exception {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage, "Drawing A Truck", 700, 700);
        gc.setFill(Color.BLACK);
        gc.fillRect(100,200,500,200);

        gc.setFill(Color.BLUE);
        gc.fillRect(450,225,150,100);

        gc.setFill(Color.RED);
        gc.fillOval(140, 350, 100, 100);
        gc.fillOval(460, 350, 100, 100);


    }

}
