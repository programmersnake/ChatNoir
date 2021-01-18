package com.kostin.game.pc.area;

import com.kostin.game.Graph.Node;

import java.util.List;
import java.util.Set;

public interface AreaInterface {

    Set<Node> getArea();
    void setUserClickAndDeleteOneNode(int xNumber, int yNumber);
    Node getNode(int x, int y);
    Node[][] getNodesArea();
    List<Node> getAvailableFinallyNodes();

}


/*

<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>

<?import java.util.ArrayList ?>

<AnchorPane prefHeight="550.0" prefWidth="525.0" style="-fx-background-color: #FFFFFF;" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="com.kostin.game.controller.MainController">
   <children>
      <ImageView fx:id="circle1" fitHeight="50.0" fitWidth="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle11" fitHeight="50.0" fitWidth="50.0" layoutX="25.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle21" fitHeight="50.0" fitWidth="50.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle41" fitHeight="50.0" fitWidth="50.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle31" fitHeight="50.0" fitWidth="50.0" layoutX="25.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle61" fitHeight="50.0" fitWidth="50.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle51" fitHeight="50.0" fitWidth="50.0" layoutX="25.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle71" fitHeight="50.0" fitWidth="50.0" layoutX="25.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle81" fitHeight="50.0" fitWidth="50.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle91" fitHeight="50.0" fitWidth="50.0" layoutX="25.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle101" fitHeight="50.0" fitWidth="50.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle2" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle12" fitHeight="50.0" fitWidth="50.0" layoutX="75.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle22" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle42" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle32" fitHeight="50.0" fitWidth="50.0" layoutX="75.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle62" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle52" fitHeight="50.0" fitWidth="50.0" layoutX="75.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle72" fitHeight="50.0" fitWidth="50.0" layoutX="75.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle82" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle92" fitHeight="50.0" fitWidth="50.0" layoutX="75.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle102" fitHeight="50.0" fitWidth="50.0" layoutX="50.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle3" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle13" fitHeight="50.0" fitWidth="50.0" layoutX="125.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle23" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle43" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle33" fitHeight="50.0" fitWidth="50.0" layoutX="125.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle63" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle53" fitHeight="50.0" fitWidth="50.0" layoutX="125.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle73" fitHeight="50.0" fitWidth="50.0" layoutX="125.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle83" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle93" fitHeight="50.0" fitWidth="50.0" layoutX="125.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle103" fitHeight="50.0" fitWidth="50.0" layoutX="100.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle4" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle14" fitHeight="50.0" fitWidth="50.0" layoutX="175.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle24" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle44" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle34" fitHeight="50.0" fitWidth="50.0" layoutX="175.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle64" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle54" fitHeight="50.0" fitWidth="50.0" layoutX="175.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle74" fitHeight="50.0" fitWidth="50.0" layoutX="175.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle84" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle94" fitHeight="50.0" fitWidth="50.0" layoutX="175.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle104" fitHeight="50.0" fitWidth="50.0" layoutX="150.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle5" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle15" fitHeight="50.0" fitWidth="50.0" layoutX="225.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle25" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle45" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle35" fitHeight="50.0" fitWidth="50.0" layoutX="225.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle65" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle55" disable="true" fitHeight="50.0" fitWidth="50.0" layoutX="225.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/cat.jpg" />
         </image>
      </ImageView>
      <ImageView fx:id="circle75" fitHeight="50.0" fitWidth="50.0" layoutX="225.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle85" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle95" fitHeight="50.0" fitWidth="50.0" layoutX="225.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle105" fitHeight="50.0" fitWidth="50.0" layoutX="200.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle6" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle16" fitHeight="50.0" fitWidth="50.0" layoutX="275.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle26" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle46" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle36" fitHeight="50.0" fitWidth="50.0" layoutX="275.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle66" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle56" fitHeight="50.0" fitWidth="50.0" layoutX="275.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle76" fitHeight="50.0" fitWidth="50.0" layoutX="275.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle86" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle96" fitHeight="50.0" fitWidth="50.0" layoutX="275.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle106" fitHeight="50.0" fitWidth="50.0" layoutX="250.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle7" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle17" fitHeight="50.0" fitWidth="50.0" layoutX="325.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle27" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle47" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle37" fitHeight="50.0" fitWidth="50.0" layoutX="325.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle67" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle57" fitHeight="50.0" fitWidth="50.0" layoutX="325.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle77" fitHeight="50.0" fitWidth="50.0" layoutX="325.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle87" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle97" fitHeight="50.0" fitWidth="50.0" layoutX="325.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle107" fitHeight="50.0" fitWidth="50.0" layoutX="300.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle8" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle18" fitHeight="50.0" fitWidth="50.0" layoutX="375.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle28" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle48" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle38" fitHeight="50.0" fitWidth="50.0" layoutX="375.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle68" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle58" fitHeight="50.0" fitWidth="50.0" layoutX="375.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle78" fitHeight="50.0" fitWidth="50.0" layoutX="375.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle88" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle98" fitHeight="50.0" fitWidth="50.0" layoutX="375.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle108" fitHeight="50.0" fitWidth="50.0" layoutX="350.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle9" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle19" fitHeight="50.0" fitWidth="50.0" layoutX="425.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle29" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle49" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle39" fitHeight="50.0" fitWidth="50.0" layoutX="425.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle69" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle59" fitHeight="50.0" fitWidth="50.0" layoutX="425.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle79" fitHeight="50.0" fitWidth="50.0" layoutX="425.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle89" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle99" fitHeight="50.0" fitWidth="50.0" layoutX="425.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle109" fitHeight="50.0" fitWidth="50.0" layoutX="400.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle10" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle20" fitHeight="50.0" fitWidth="50.0" layoutX="475.0" layoutY="50.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle30" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" layoutY="100.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle50" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" layoutY="200.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle40" fitHeight="50.0" fitWidth="50.0" layoutX="475.0" layoutY="150.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle70" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" layoutY="300.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle60" fitHeight="50.0" fitWidth="50.0" layoutX="475.0" layoutY="250.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle80" fitHeight="50.0" fitWidth="50.0" layoutX="475.0" layoutY="350.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle90" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" layoutY="400.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle100" fitHeight="50.0" fitWidth="50.0" layoutX="475.0" layoutY="450.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>
      <ImageView fx:id="circle110" fitHeight="50.0" fitWidth="50.0" layoutX="450.0" layoutY="500.0" onMouseClicked="#newCircleMouseClicked" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@imgs/simpleCircle.png" />
         </image>
      </ImageView>


      <fx:define>
         <ArrayList fx:id="circles">
            <ArrayList fx:id="1Arr">
               <fx:reference source="circle1" />
               <fx:reference source="circle2" />
               <fx:reference source="circle3" />
               <fx:reference source="circle4" />
               <fx:reference source="circle5" />
               <fx:reference source="circle6" />
               <fx:reference source="circle7" />
               <fx:reference source="circle8" />
               <fx:reference source="circle9" />
               <fx:reference source="circle10" />
            </ArrayList>
            <ArrayList fx:id="2Arr">
               <fx:reference source="circle11" />
               <fx:reference source="circle12" />
               <fx:reference source="circle13" />
               <fx:reference source="circle14" />
               <fx:reference source="circle15" />
               <fx:reference source="circle16" />
               <fx:reference source="circle17" />
               <fx:reference source="circle18" />
               <fx:reference source="circle19" />
               <fx:reference source="circle20" />
            </ArrayList>
            <ArrayList fx:id="3Arr">
               <fx:reference source="circle21" />
               <fx:reference source="circle22" />
               <fx:reference source="circle23" />
               <fx:reference source="circle24" />
               <fx:reference source="circle25" />
               <fx:reference source="circle26" />
               <fx:reference source="circle27" />
               <fx:reference source="circle28" />
               <fx:reference source="circle29" />
               <fx:reference source="circle30" />
            </ArrayList>
            <ArrayList fx:id="4Arr">
               <fx:reference source="circle31" />
               <fx:reference source="circle32" />
               <fx:reference source="circle33" />
               <fx:reference source="circle34" />
               <fx:reference source="circle35" />
               <fx:reference source="circle36" />
               <fx:reference source="circle37" />
               <fx:reference source="circle38" />
               <fx:reference source="circle39" />
               <fx:reference source="circle40" />
            </ArrayList>
            <ArrayList fx:id="5Arr">
               <fx:reference source="circle41" />
               <fx:reference source="circle42" />
               <fx:reference source="circle43" />
               <fx:reference source="circle44" />
               <fx:reference source="circle45" />
               <fx:reference source="circle46" />
               <fx:reference source="circle47" />
               <fx:reference source="circle48" />
               <fx:reference source="circle49" />
               <fx:reference source="circle50" />
            </ArrayList>
            <ArrayList fx:id="6Arr">
               <fx:reference source="circle51" />
               <fx:reference source="circle52" />
               <fx:reference source="circle53" />
               <fx:reference source="circle54" />
               <fx:reference source="circle55" />
               <fx:reference source="circle56" />
               <fx:reference source="circle57" />
               <fx:reference source="circle58" />
               <fx:reference source="circle59" />
               <fx:reference source="circle60" />
            </ArrayList>
            <ArrayList fx:id="7Arr">
               <fx:reference source="circle61" />
               <fx:reference source="circle62" />
               <fx:reference source="circle63" />
               <fx:reference source="circle64" />
               <fx:reference source="circle65" />
               <fx:reference source="circle66" />
               <fx:reference source="circle67" />
               <fx:reference source="circle68" />
               <fx:reference source="circle69" />
               <fx:reference source="circle70" />
            </ArrayList>
            <ArrayList fx:id="8Arr">
               <fx:reference source="circle71" />
               <fx:reference source="circle72" />
               <fx:reference source="circle73" />
               <fx:reference source="circle74" />
               <fx:reference source="circle75" />
               <fx:reference source="circle76" />
               <fx:reference source="circle77" />
               <fx:reference source="circle78" />
               <fx:reference source="circle79" />
               <fx:reference source="circle80" />
            </ArrayList>
            <ArrayList fx:id="9Arr">
               <fx:reference source="circle81" />
               <fx:reference source="circle82" />
               <fx:reference source="circle83" />
               <fx:reference source="circle84" />
               <fx:reference source="circle85" />
               <fx:reference source="circle86" />
               <fx:reference source="circle87" />
               <fx:reference source="circle88" />
               <fx:reference source="circle89" />
               <fx:reference source="circle90" />
            </ArrayList>
            <ArrayList fx:id="10Arr">
               <fx:reference source="circle91" />
               <fx:reference source="circle92" />
               <fx:reference source="circle93" />
               <fx:reference source="circle94" />
               <fx:reference source="circle95" />
               <fx:reference source="circle96" />
               <fx:reference source="circle97" />
               <fx:reference source="circle98" />
               <fx:reference source="circle99" />
               <fx:reference source="circle100" />
            </ArrayList>
            <ArrayList fx:id="11Arr">
               <fx:reference source="circle101" />
               <fx:reference source="circle102" />
               <fx:reference source="circle103" />
               <fx:reference source="circle104" />
               <fx:reference source="circle105" />
               <fx:reference source="circle106" />
               <fx:reference source="circle107" />
               <fx:reference source="circle108" />
               <fx:reference source="circle109" />
               <fx:reference source="circle110" />
            </ArrayList>
         </ArrayList>
      </fx:define>


   </children>
</AnchorPane>


 */