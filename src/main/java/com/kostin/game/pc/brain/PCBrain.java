package com.kostin.game.pc.brain;

import com.kostin.game.Graph.Dijkstra;
import com.kostin.game.Graph.Graph;
import com.kostin.game.Graph.Node;
import com.kostin.game.pc.area.Area;
import com.kostin.game.pc.area.AreaInterface;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PCBrain {

    public String Go(int xOfNodeWithCat, int yOfNodeWithCat, AreaInterface area) {

        LinkedList<Node> theShortestPath = null;
        Set<Node> availableFinallyNodes = area.getAvailableFinallyNodes();
        System.out.println("AvailableFinallyNodes = "+availableFinallyNodes.size());
        System.out.println("CatX=" + xOfNodeWithCat+" CatY="+yOfNodeWithCat);
        for(Node oneNode : availableFinallyNodes) {

            Graph graph = new Graph();
            graph.setNodes( area.getArea() );

            Node nodeWithCat = area.getNode( xOfNodeWithCat, yOfNodeWithCat );

            LinkedList<LinkedList<Node>> afterDijkstraGraph = Dijkstra.calculateShortestPathFromSource( graph, nodeWithCat, oneNode );
            if(afterDijkstraGraph==null) continue;

            for(LinkedList<Node> listOfNodes : afterDijkstraGraph){
                if ( theShortestPath==null ) {
                    theShortestPath = listOfNodes;
                    continue;
                }
                //System.out.println();
                if ( theShortestPath.size()>listOfNodes.size() ) {
                    theShortestPath = listOfNodes;
                }
                /*System.out.print( "After Dijkstra [" + oneNode.getName() + ", " + nodeWithCat.getName() + "] = " );
                afterDijkstraGraph.stream().forEach( list -> {
                    list.stream().forEach( node -> {
                        System.out.print( node.getName() + ", " );
                    } );
                    System.out.println();
                });*/
            }

        }
        if(theShortestPath==null)
            return "-1";
        else
            System.out.println("AAD="+theShortestPath.get(1).getName());
            return theShortestPath.get(1).getName();
    }
}
