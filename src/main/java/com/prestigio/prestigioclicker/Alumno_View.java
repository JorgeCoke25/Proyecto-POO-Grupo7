package com.prestigio.prestigioclicker;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class Alumno_View extends VBox {
    public Alumno_View(Alumno alumno){
        Image img = new Image("https://www.nestleprofessional-latam.com/sites/default/files/styles/product/public/media/prestigio_nuevo.png?itok=8YkS-XZK");
        ImageView view = new ImageView(img);
        view.setFitHeight(200);
        view.setPreserveRatio(true);

        this.pr = new Label();
        pr.setFont(new Font(20));
        HBox hb = new HBox(pr);
        hb.setAlignment(Pos.CENTER);
        hb.setMaxWidth(250);
        hb.setStyle("-fx-background-color: #9a1b25;-fx-border-color: black");
        pr.setText("Prestigio: "+String.valueOf(alumno.getPrestigio()));
        getChildren().add(hb);
        Button prestigio = new Button("",view);
        prestigio.setOnAction((event)-> {
            alumno.subirPrestigio();
            this.setTittle(alumno.getPrestigio());
            this.mostrarPuntaje(alumno.getAumento(),alumno);
        });
        prestigio.setStyle("-fx-border-color: black");
        prestigio.setMinWidth(250);
        prestigio.setMinHeight(250);
        getChildren().add(prestigio);
        setAlignment(Pos.CENTER);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(()->{
                    if(alumno.getPrestigio()>=1000000000){
                        alumno.setPrestigio(0);
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Felicidades!!");
                        alert.setTitle("Graduación");
                        alert.setContentText("Usted se ha graduado en abundante prestigio");
                        alert.showAndWait();
                        System.exit(0);
                    }
                });
            }
        }, 0, 100);
    }
    public void setTittle(long value){
        DecimalFormat df = new DecimalFormat("###,###");
        pr.setText("Prestigio:"+df.format(value).replace(",","."));

    }
    public void mostrarPuntaje(long value,Alumno alumno)  {
        alumno.getPuntaje().setOpacity(1);
        DecimalFormat df = new DecimalFormat("###,###");
        alumno.getPuntaje().setText("+"+df.format(value).replace(",","."));
        Font font = new Font((value*0.000001)+25);
        alumno.getPuntaje().setFont(font);
        PauseTransition hidePuntaje = new PauseTransition(Duration.seconds(1));
        hidePuntaje.playFromStart();
        hidePuntaje.setOnFinished(e->alumno.getPuntaje().setOpacity(0.2));
        hidePuntaje.play();
    }
    private Label pr;
}
