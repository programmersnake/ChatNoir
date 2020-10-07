package com.kostin.game.Graph;

import com.kostin.game.pc.area.Area;
import com.kostin.game.pc.area.AreaInterface;

import java.util.*;

public class MainGraph {

    public static void main(String[] args) {

        AreaInterface area = new Area();

        LinkedList<Node> theShortestPath = null;
        Set<Node> availableFinallyNodes = area.getAvailableFinallyNodes();

        for(Node oneNode : availableFinallyNodes) {

            Graph graph = new Graph();
            graph.setNodes( area.getArea() );

            Node nodeWithCat = area.getNode( 5, 5 );

            LinkedList<LinkedList<Node>> afterDijkstraGraph = Dijkstra.calculateShortestPathFromSource( graph, nodeWithCat, oneNode );
            if(afterDijkstraGraph==null) continue;

            for(LinkedList<Node> listOfNodes : afterDijkstraGraph){
                if ( theShortestPath==null ) {
                    theShortestPath = listOfNodes;
                    continue;
                }
                if ( theShortestPath.size()>listOfNodes.size() ) {
                    theShortestPath = listOfNodes;
                }
                System.out.print( "After Dijkstra [" + oneNode.getName() + ", " + nodeWithCat.getName() + "] = " );
                afterDijkstraGraph.stream().forEach( list -> {
                    list.stream().forEach( node -> {
                        System.out.print( node.getName() + ", " );
                    } );
                    System.out.println();
                });
            }

        }
    }

}
