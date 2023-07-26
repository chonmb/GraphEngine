package org.chonmb.ge.core.elements.factories;

import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.BaseGraph;
import org.chonmb.ge.core.elements.Node;
import org.chonmb.ge.core.models.EdgeModel;
import org.chonmb.ge.core.models.MatrixGraphModel;
import org.chonmb.ge.core.models.NodeModel;
import org.chonmb.ge.core.models.OrthogonalListGraphModel;

/**
 * @author chonmb
 * @date 2023/6/25 23:04
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface GraphModelFactory<T extends BaseGraph<? extends Node, ? extends Edge>, N extends Node, E extends Edge> {
    T createGraph(MatrixGraphModel matrixGraphModel);

    T createGraph(OrthogonalListGraphModel orthogonalListGraphModel);

    N createNode(NodeModel nodeModel);

    E createEdge(EdgeModel edgeModel);
}
