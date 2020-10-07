package com.kostin.game.pc.area;

import com.kostin.game.Graph.Node;

import java.util.Set;

public interface AreaInterface {

    Set<Node> getArea();
    void setUserClickAndDeleteOneNode(int xNumber, int yNumber);
    Node getNode(int x, int y);
    Node[][] getNodesArea();
    Set<Node> getAvailableFinallyNodes();

}
