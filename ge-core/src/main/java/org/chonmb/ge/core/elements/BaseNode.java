package org.chonmb.ge.core.elements;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/25 23:29
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public abstract class BaseNode<N extends Edge> implements Node{
    private final List<N> in=new ArrayList<>();
    private final List<N> out=new ArrayList<>();

    @Override
    public List<N> getEdgesIn() {
        return in;
    }

    @Override
    public List<N> getEdgesOut() {
        return out;
    }
}
