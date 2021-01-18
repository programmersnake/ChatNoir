package com.kostin.game.controller;

import com.kostin.game.pc.area.Area;
import com.kostin.game.pc.area.AreaInterface;
import com.kostin.game.pc.brain.PCBrain;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MainController extends Application {

    private final Image[] finalImages = new Image[] {
            new Image("com.kostin.game.view/imgs/simpleCircle.png"),
            new Image("com.kostin.game.view/imgs/closedCircle.png"),
            new Image("com.kostin.game.view/imgs/cat.jpg")
    };

    AreaInterface area;
    private int intCatX = 4;
    private int intCatY = 5;
    private PCBrain brain = new PCBrain();

    public MainController() {
        area = new Area();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private List<List<ImageView>> circles;

    @FXML
    void initialize() {

    }

    @FXML
    void newCircleMouseClicked(MouseEvent event) {
        //Getting number of Click
        userStep( event );

        pcStep( event );
        }

    private void pcStep(MouseEvent event) {
        String pcStepString = brain.Go( intCatX, intCatY, area );
        System.out.println("pcStep="+ pcStepString );
        if( pcStepString.startsWith( "-" ))
            System.out.println("!!!!!!!!!!!!!!!!!The END!!!!!!!!!!!!!!!!!!");
        else {
            ImageView imageCatView = circles.get( intCatY ).get( intCatX );
            imageCatView.setDisable( false );
            imageCatView.setImage( finalImages[0] );


            intCatX = Integer.valueOf( String.valueOf( pcStepString.charAt( 1 ) ) );
            intCatY = Integer.valueOf( String.valueOf( pcStepString.charAt( 0 ) ) );

            System.out.println(intCatY);
            System.out.println(intCatY);

            imageCatView = circles.get( intCatY ).get( intCatX );
            imageCatView.setImage( finalImages[2] );
            imageCatView.setDisable( true );
        }
    }

    private void userStep(MouseEvent event) {
        int xNumber;
        int yNumber = (int) (event.getSceneY() / 50);
        if ( yNumber % 2 == 0 )
            xNumber = (int) (event.getSceneX() / 50);
        else xNumber = (int) ((event.getSceneX() - 25) / 50);

        System.out.println("User step: y="+yNumber+" x="+xNumber);

        System.out.println(area.getNode( xNumber, yNumber ).getName());
        area.setUserClickAndDeleteOneNode( xNumber, yNumber );
        ImageView imageView = circles.get( yNumber ).get( xNumber );
        imageView.setImage( finalImages[1] );
        imageView.setDisable( true );
    }


    public static void main(String[] args) throws IOException {
        launch( args );
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent root = FXMLLoader.load( loader.getClassLoader().getResource( "com.kostin.game.view/MainWindow.fxml" ) );
        stage.setTitle( "Chat Noir" );
        stage.setScene( new Scene( root ) );
        stage.setResizable( false );
        stage.setOnCloseRequest( windowEvent -> {
            stage.close();
            System.exit( 0 );
        } );
        stage.show();
    }
}
