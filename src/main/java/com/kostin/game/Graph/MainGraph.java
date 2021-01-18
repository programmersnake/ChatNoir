package com.kostin.game.Graph;

import com.kostin.game.pc.area.Area;
import com.kostin.game.pc.area.AreaInterface;
import com.kostin.game.pc.brain.PCBrain;

import java.util.*;

public class MainGraph {

    public static void main(String[] args) {

        AreaInterface area = null;

        LinkedList<Node> theShortestPath = null;
        List<Node> availableFinallyNodes = area.getAvailableFinallyNodes();

        for(Node oneNode : availableFinallyNodes) {

            Graph graph = new Graph();
            graph.setNodes( area.getArea() );

            Node nodeWithCat = area.getNode( 5, 5 );



        }
    }

}
