package com.kostin.game.Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Dijkstra {

    public static LinkedList<LinkedList<Node>> calculateShortestPathFromSource(Graph graph, Node source, Node finallyNode) {
        source.setDistance(0);
        LinkedList<LinkedList<Node>> pathLinkedListFoReturn = null;
        Node randomNode = null;

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);

            unsettledNodes.remove(currentNode);

            for (Map.Entry< Node, Integer> adjacencyPair: currentNode.getAdjacentNodes().entrySet()) {

                if(adjacencyPair.getKey()==null) continue;

                Node adjacentNode = adjacencyPair.getKey();
                if(randomNode==null)
                    randomNode = adjacentNode;

                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    LinkedList<Node> tempLinkedList = calculateMinimumDistance(adjacentNode, edgeWeight, currentNode, finallyNode );
                    if(tempLinkedList!=null) {
                        if(pathLinkedListFoReturn==null)
                            pathLinkedListFoReturn = new LinkedList<>();
                        pathLinkedListFoReturn.add( tempLinkedList );
                    }
                    unsettledNodes.add(adjacentNode);
                }

            }
            settledNodes.add(currentNode);
        }

        if(pathLinkedListFoReturn==null){
            LinkedList<Node> listToRandomNode = new LinkedList<>();
            listToRandomNode.add( randomNode );
            for(int i = 0; i<20;i++)
                listToRandomNode.add( new Node( "",-i,-i ) );
            pathLinkedListFoReturn = new LinkedList<>();
            pathLinkedListFoReturn.add( listToRandomNode );
        }
        return pathLinkedListFoReturn;
    }

    private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    /**
     *
     * @param evaluationNode is adjacentNode (pair of sourceNode)
     * @param edgeWeigh is length
     * @param sourceNode is currentNode
     * @param nodeWithCat
     */
    private static LinkedList<Node> calculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode, Node nodeWithCat) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
  /*          System.out.print("path=");
            shortestPath.stream().forEach( node -> {
                System.out.print(node.getName()+", ");
            } );
            System.out.println();
*/
            if (shortestPath.contains( nodeWithCat )) {
                return shortestPath;
            }
        }
        return null;
    }

}
