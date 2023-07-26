package org.chonmb.ge.core.models;

import org.chonmb.ge.core.elements.Edge;
import org.chonmb.ge.core.elements.Node;

/**
 * @author chonmb
 * @date 2023/6/25 23:15
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class OrthogonalListItem {
    NodeModel node;
    EdgeModel in;
    EdgeModel out;

    public NodeModel getNode() {
        return node;
    }

    public void setNode(NodeModel node) {
        this.node = node;
    }

    public EdgeModel getIn() {
        return in;
    }

    public void setIn(EdgeModel in) {
        this.in = in;
    }

    public EdgeModel getOut() {
        return out;
    }

    public void setOut(EdgeModel out) {
        this.out = out;
    }
}
