package org.chonmb.ge.core.models;

import org.chonmb.ge.core.elements.Node;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/15 23:51
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class EdgeModel implements Model {
    Node head;
    Node tail;
    GraphConsumer action;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public GraphConsumer getAction() {
        return action;
    }

    public void setAction(GraphConsumer action) {
        this.action = action;
    }
}
