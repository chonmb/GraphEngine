package org.chonmb.ge.core.elements;

import org.chonmb.ge.core.error.GraphEngineExecuteException;
import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/25 23:27
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public abstract class BaseEdge<N extends Node> implements Edge {
    private N tail;
    private N head;
    private CursorGraphConsumer consumer;

    BaseEdge(N head, N tail, CursorGraphConsumer consumer) {
        this.consumer = consumer;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public N getTail() {
        return tail;
    }

    @Override
    public N getHead() {
        return head;
    }

    @Override
    public void setConsumer(CursorGraphConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void action(Cursor cursor) {
        try {
            consumer.accept(cursor);
        } catch (Exception e) {
            throw new GraphEngineExecuteException(e);
        }
    }
}
