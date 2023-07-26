package org.chonmb.ge.core.elements.factories;

import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.BaseGraph;
import org.chonmb.ge.core.elements.Node;
import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/15 23:12
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface GraphFactory<T extends BaseGraph<?extends Node,?extends Edge>,N extends Node,E extends Edge> {

    T createGraph();

    N createNode();

    E createEdge(N head, N tail, CursorGraphConsumer consumer);
}
