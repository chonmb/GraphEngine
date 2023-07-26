package org.chonmb.ge.core.util;

import org.chonmb.ge.core.elements.factories.GraphFactory;
import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.BaseGraph;
import org.chonmb.ge.core.elements.Node;
import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/11 21:49
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class GraphBuilder<T extends BaseGraph<N, E>, N extends Node, E extends Edge> {
    private T graph;

    public void setGraphFactory(GraphFactory<T, N, E> graphFactory) {
        this.graphFactory = graphFactory;
    }

    public void setGraph(T graph) {
        this.graph = graph;
    }

    private GraphFactory<T, N, E> graphFactory;

    public static <T extends BaseGraph<N, E>, N extends Node, E extends Edge> GraphBuilder<T, N, E> builder() {
        return new GraphBuilder<>();
    }

    public static <T extends BaseGraph<N, E>, N extends Node, E extends Edge> GraphBuilder<T, N, E> builder(GraphFactory<T, N, E> graphFactory) {
        GraphBuilder<T, N, E> graphBuilder = new GraphBuilder<>();
        graphBuilder.setGraphFactory(graphFactory);
        graphBuilder.setGraph(graphFactory.createGraph());
        return graphBuilder;
    }

    public GraphBuilder<T, N, E> node(N node) {
        graph.addNode(node);
        return this;
    }

    public GraphBuilder<T, N, E> edge(E edge) {
        graph.addEdge(edge);
        return this;
    }

    public GraphBuilder<T, N, E> node() {
        if (graphFactory != null) {
            graph.addNode(graphFactory.createNode());
        }
        return this;
    }


    public GraphBuilder<T, N, E> edge(N head, N tail, CursorGraphConsumer consumer) {
        if (graphFactory != null) {
            graph.addEdge(graphFactory.createEdge(head, tail, consumer));
        }
        return this;
    }

    public T build() {
        return graph;
    }

    public GraphBuilder<T, N, E> graph(T graph) {
        this.graph = graph;
        return this;
    }
}
