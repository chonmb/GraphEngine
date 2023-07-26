package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.elements.factories.GraphFactory;
import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/15 23:09
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleGraphFactory implements GraphFactory<SimpleGraph, SimpleNode, SimpleEdge> {


    @Override
    public SimpleGraph createGraph() {
        return new SimpleGraph();
    }

    @Override
    public SimpleNode createNode() {
        return new SimpleNode();
    }

    @Override
    public SimpleEdge createEdge(SimpleNode head, SimpleNode tail, CursorGraphConsumer consumer) {
        SimpleEdge edge = new SimpleEdge();
        edge.setHead(head);
        edge.setTail(tail);
        edge.setConsumer(consumer);
        return edge;
    }

}
