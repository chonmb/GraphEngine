package org.chonmb.ge.example;

import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.util.GraphBuilder;
import org.chonmb.ge.example.simple.*;

/**
 * @author chonmb
 * @date 2023/6/11 22:15
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleGraphDemo {

    public static void main(String[] args) {
        SimpleNode node1 = new SimpleNode();
        SimpleNode node2 = new SimpleNode();
        SimpleNode node3 = new SimpleNode();


        SimpleGraph simpleGraph = GraphBuilder.builder(new SimpleGraphFactory())
                .node(node1)
                .node(node2)
                .node(node3)
                .edge(node1, node2, buildGraphPrintAction("node1->node2"))
                .edge(node2, node3, buildGraphPrintAction("node2->node3"))
                .build();


        SimpleGraphManager simpleGraphManager = new SimpleGraphManager(simpleGraph);

        SimpleCursor cursor = new SimpleCursor();
        cursor.setCurrentNode(node1);

        simpleGraphManager.startGraphFlow(cursor);

        simpleGraphManager.close();
    }

    static CursorGraphConsumer buildGraphPrintAction(String content) {
        return (cursor) -> System.out.println(content);
    }
}
