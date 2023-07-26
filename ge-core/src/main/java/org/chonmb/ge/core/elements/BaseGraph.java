package org.chonmb.ge.core.elements;

import org.chonmb.ge.core.config.GraphConstant;
import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chonmb
 * @date 2023/6/12 23:24
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public abstract class BaseGraph<N extends Node, E extends Edge> implements Graph{
    private final Map<String, N> nodes = new HashMap<>();
    private final Map<String, E> edges = new HashMap<>();


    public N getNode(String id) {
        return nodes.get(id);
    }

    public void addNode(N node) {
        if (checkAppendNode(node)) {
            appendNode(node);
        }
    }

    public E getEdge(String id) {
        return edges.get(id);
    }

    public void addEdge(E edge) {
        if (checkAppendEdge(edge)) {
            appendEdge(edge);
        }
    }

    public boolean checkAppendNode(N node) {
        return !nodes.containsValue(node);
    }

    public void appendNode(N node) {
        nodes.put(GraphConstant.PREFIX_NODE + nodes.size(), node);
    }

    public boolean checkAppendEdge(E edge) {
        return !edges.containsValue(edge);
    }

    public void appendEdge(E edge) {
        edges.put(GraphConstant.PREFIX_EDGE + nodes.size(), edge);
    }

    @Override
    public boolean hasNextStep(Cursor cursor) {
        return false;
    }

    @Override
    public void step(Cursor cursor) {

    }
}
