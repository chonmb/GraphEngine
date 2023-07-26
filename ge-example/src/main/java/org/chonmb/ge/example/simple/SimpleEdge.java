package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.elements.Cursor;
import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.error.GraphEngineExecuteException;
import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/13 23:44
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleEdge implements Edge {
    private SimpleNode tail;
    private SimpleNode head;
    private CursorGraphConsumer consumer;

    public void setTail(SimpleNode tail) {
        this.tail = tail;
        tail.getEdgesIn().add(this);
    }

    public void setHead(SimpleNode head) {
        this.head = head;
        head.getEdgesOut().add(this);
    }

    public void execute(){
        try {
            consumer.accept(null);
        } catch (Exception e) {
            throw new GraphEngineExecuteException(e);
        }
    }

    @Override
    public SimpleNode getTail() {
        return tail;
    }

    @Override
    public SimpleNode getHead() {
        return head;
    }

    @Override
    public void setConsumer(CursorGraphConsumer consumer) {
        this.consumer=consumer;
    }

    @Override
    public void action(Cursor cursor) {

    }
}
