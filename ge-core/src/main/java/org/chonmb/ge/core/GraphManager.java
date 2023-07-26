package org.chonmb.ge.core;

import org.chonmb.ge.core.elements.Cursor;
import org.chonmb.ge.core.elements.Graph;
import org.chonmb.ge.core.executors.GraphExecutor;

/**
 * @author chonmb
 * @date 2023/6/26 23:44
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class GraphManager {
    private final GraphExecutor graphExecutor;
    private final Graph graph;
    private boolean autoExecuteFlow = true;

    public GraphManager(GraphExecutor graphExecutor, Graph graph) {
        this.graphExecutor = graphExecutor;
        this.graph = graph;
    }

    public void startGraphFlow(Cursor cursor) {
        graphExecutor.submit(() -> {
            if (autoExecuteFlow) {
                while (graph.hasNextStep(cursor)) {
                    graph.step(cursor);
                }
            } else if (graph.hasNextStep(cursor)) {
                graph.step(cursor);
            }

        });
    }

    public void autoExecuteFlow(boolean auto) {
        this.autoExecuteFlow = auto;
    }

    public void close(){
        graphExecutor.close();
    }


}
