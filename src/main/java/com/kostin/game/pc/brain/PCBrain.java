package com.kostin.game.pc.brain;

import com.kostin.game.Graph.Dijkstra;
import com.kostin.game.Graph.Graph;
import com.kostin.game.Graph.Node;
import com.kostin.game.pc.area.Area;
import com.kostin.game.pc.area.AreaInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PCBrain {

    public String Go(int xOfNodeWithCat, int yOfNodeWithCat, AreaInterface area) {

        Node theShortestNode = null;
        LinkedList<Node> theShortestPath = null;
        List<Node> availableFinallyNodes = area.getAvailableFinallyNodes();
        /*System.out.println("AvailableFinallyNodes = ");
        System.out.print("[ ");
        for(Node node:availableFinallyNodes){
            System.out.print(node.getName()+", ");
        }
        System.out.println("]");*/
        System.out.println("CatX=" + xOfNodeWithCat+" CatY="+yOfNodeWithCat);
        for(Node oneNode : availableFinallyNodes) {

            Graph graph = new Graph();
            graph.setNodes( area.getArea() );

            Node nodeWithCat = area.getNode( xOfNodeWithCat, yOfNodeWithCat );

            Node tempNode = getShortestNode( theShortestPath, oneNode, graph, nodeWithCat );
            if(tempNode != null )
                theShortestNode = tempNode;

        }
        if(theShortestNode==null)
            return "-1";
        else
            System.out.println("AAD="+theShortestNode.getName());
            return theShortestNode.getName();
    }

    public static Node getShortestNode(LinkedList<Node> theShortestPath, Node oneNode, Graph graph, Node nodeWithCat) {
        LinkedList<LinkedList<Node>> afterDijkstraGraph = Dijkstra.calculateShortestPathFromSource( graph, nodeWithCat, oneNode );
        if(afterDijkstraGraph==null) return null;

        for(LinkedList<Node> listOfNodes : afterDijkstraGraph){
            if ( theShortestPath==null ) {
                if(!listOfNodes.isEmpty())
                    theShortestPath = listOfNodes;
                continue;
            }
            if ( theShortestPath.size()>listOfNodes.size() ) {
                theShortestPath = listOfNodes;
            }
            System.out.print( "After Dijkstra [" + oneNode.getName() + ", " + nodeWithCat.getName() + "] = " );
            afterDijkstraGraph.stream().forEach( list -> {
                list.stream().forEach( node -> {
                    if(!node.equals( null ))
                        System.out.print( node.getName() + ", " );
                } );
                System.out.println();
            });
        }
        return theShortestPath.get( 0 );
    }
}
