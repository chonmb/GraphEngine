package org.chonmb.ge.core.models;

import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.Node;

import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/25 23:08
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class MatrixGraphModel implements Model{

    List<Node> nodes;

    List<Edge> specialEdges;

    int[][] matrix;

    public List<Edge> getSpecialEdges() {
        return specialEdges;
    }

    public void setSpecialEdges(List<Edge> specialEdges) {
        this.specialEdges = specialEdges;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
