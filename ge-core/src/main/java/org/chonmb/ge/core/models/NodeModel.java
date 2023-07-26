package org.chonmb.ge.core.models;

import org.chonmb.ge.core.elements.Edge;

import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/15 23:51
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class NodeModel implements Model {
    String name;
    List<Edge> in;
    List<Edge> out;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getIn() {
        return in;
    }

    public void setIn(List<Edge> in) {
        this.in = in;
    }

    public List<Edge> getOut() {
        return out;
    }

    public void setOut(List<Edge> out) {
        this.out = out;
    }
}
