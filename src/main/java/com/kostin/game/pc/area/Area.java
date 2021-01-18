package com.kostin.game.pc.area;

import com.kostin.game.Graph.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Area implements AreaInterface {

    private Node[][] nodesArea;
    private List<Node> allAvailableFinallyNodes = new ArrayList<>();

    public Area () {
        nodesArea = new Node[12][11];
        createAllNodes();
    }

    private void createAllNodes() {
        System.out.print("[ ");
        for (int i = 0;i<11;i++) {
            for (int j = 0;j<10;j++) {
                nodesArea[i][j] = new Node( i +String.valueOf( j ), i, j );

                if ((i==0)||(j==9)||(j==0)||(i==10))
                    allAvailableFinallyNodes.add( nodesArea[i][j] );

            }
        }
    }

    @Override
    public List<Node> getAvailableFinallyNodes() {
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
    public void setUserClickAndDeleteOneNode(int yNumber, int xNumber) {
        //добавить удаление крайних нодов
        System.out.println("x="+xNumber+" y="+yNumber);
        if ((xNumber==0)||(yNumber==9)||(yNumber==0)||(xNumber==10))
            allAvailableFinallyNodes.remove( nodesArea[xNumber][yNumber] );

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
