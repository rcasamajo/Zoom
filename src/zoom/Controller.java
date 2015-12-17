package zoom;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private Slider sliderZoom;
    @FXML
    private ScrollPane sPane;
    @FXML
    private ImageView iView;


    public void initialize() {
        iView.setImage(new Image("Homer_Simpson_2006.png"));
    }
}
