package zoom;

import javafx.beans.value.ChangeListener;
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
        iView.setFitWidth(250D);
        iView.setFitHeight(250D);

        sliderZoom.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                                Number oldValue, Number newValue) {

                outputTextArea.appendText("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            }
        });    }

}
