package com.kostin.game.pc.area;

import com.kostin.game.Graph.Node;

import java.util.HashSet;
import java.util.Set;

public class Area implements AreaInterface {

    private Node[][] nodesArea;

    public Area () {
        nodesArea = new Node[12][11];
        createAllNodes();
    }

    private void createAllNodes() {
        for (int i = 0;i<11;i++) {
            for (int j = 0;j<10;j++) {
                nodesArea[i][j] = new Node( i +String.valueOf( j ), i, j );
                //nodesArea[i][j].setDistance( 0 );
            }
        }
    }

    @Override
    public Set<Node> getAvailableFinallyNodes() {
        Set<Node> allAvailableFinallyNodes = new HashSet<>();

        for (int i = 0;i<11;i++) {
            for (int j = 0; j < 10; j++)
                if ((i==0)||(j==0)||(j==1)||(i==10))
                    allAvailableFinallyNodes.add( nodesArea[i][j] );
        }
        return allAvailableFinallyNodes;
    }

    @Override
    public Set<Node> getArea() {
        return addAllDestinationsForNodes();
    }

    @Override
    public Node[][] getNodesArea() {
        return nodesArea;
    }

    //  Добавить динамическое добавление связей
    private Set<Node> addAllDestinationsForNodes() {
        Set<Node> newNodes = new HashSet<>();
        Node thisTempNode;
        for(int i = 0;i<11;i++) {
            for(int j = 0;j<10;j++) {
                if(nodesArea[i][j]==null)
                    continue;
                else
                    thisTempNode = nodesArea[i][j];

                try{
                    thisTempNode.addDestination( nodesArea[i-1][j],1 );
                } catch(Exception exception) {}
                try{
                    thisTempNode.addDestination( nodesArea[i+1][j],1 );
                } catch(Exception exception) {}
                try{
                    thisTempNode.addDestination( nodesArea[i][j-1],1 );
                } catch(Exception exception) {}
                try {
                    thisTempNode.addDestination( nodesArea[i][j+1],1 );
                } catch(Exception exception) {}
                try{
                    thisTempNode.addDestination( nodesArea[i-1][j-1],1 );
                } catch(Exception exception) {}
                try {
                    thisTempNode.addDestination( nodesArea[i+1][j+1],1 );
                } catch(Exception exception) {}
                try{
                    thisTempNode.addDestination( nodesArea[i-1][j+1],1 );
                } catch(Exception exception) {}
                try{
                    thisTempNode.addDestination( nodesArea[i+1][j-1],1 );
                } catch(Exception exception) {}

                newNodes.add( thisTempNode );
            }
        }
        return newNodes;
    }

    @Override
    public void setUserClickAndDeleteOneNode(int xNumber, int yNumber) {
        nodesArea[xNumber][yNumber] = null;
    }

    @Override
    public Node getNode(int x, int y) {
        Set<Node> nodeSet = addAllDestinationsForNodes();
        for(Node node : nodeSet) {
            if(node.getName().startsWith( y+String.valueOf( x ) )){
                return node;
            }
        }
        return new Node("Null node", -1, -1);
    }

}
