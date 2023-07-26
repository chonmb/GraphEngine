package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.elements.BaseGraph;

/**
 * @author chonmb
 * @date 2023/6/14 00:14
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleGraph extends BaseGraph<SimpleNode,SimpleEdge> {

    public boolean hasNext(SimpleCursor cursor){
        return cursor.getCurrentNode().getEdgesOut().size()!=0;
    }

    public void step(SimpleCursor cursor){
        if (hasNext(cursor)){
            SimpleEdge edge=cursor.getCurrentNode().getEdgesOut().get(0);
            edge.execute();
            cursor.setCurrentNode(edge.getTail());
        }
    }
}
