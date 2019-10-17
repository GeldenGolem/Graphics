import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import java.util.*;

public class DrawingShapes extends Application{

    @Override
    public void start(Stage myStage) throws Exception {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(myStage, "Drawing Shapes", 400,400);
        gc.setStroke(Color.BLACK);
        gc.fillRect(10, 30, 100, 50);

        gc.setStroke(Color.CYAN);
        gc.fillRect(80, 40, 30, 20);

        gc.setFill(Color.RED);
        gc.fillOval(20, 70, 20, 20);
        gc.fillOval(80, 70, 20, 20);
    }
    public static void main(String[] args)
    {
        launch(args);
    }

}
