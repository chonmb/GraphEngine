package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.elements.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/11 22:25
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleNode implements Node {
    public List<SimpleEdge> in=new ArrayList<>();
    public List<SimpleEdge> out=new ArrayList<>();


    @Override
    public List<SimpleEdge> getEdgesIn() {
        return in;
    }

    @Override
    public List<SimpleEdge> getEdgesOut() {
        return out;
    }
}
