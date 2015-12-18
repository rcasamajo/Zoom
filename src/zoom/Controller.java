package zoom;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        sliderZoom.setValue(250D);

        //Creem el change listener per la propietat value del slider
        sliderZoom.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                                Number oldValue, Number newValue) {
                iView.setFitWidth(newValue.intValue());
                iView.setFitHeight(newValue.intValue());
            }
        });    }

}
