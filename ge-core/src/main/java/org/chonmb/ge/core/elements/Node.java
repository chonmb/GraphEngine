package org.chonmb.ge.core.elements;

import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/11 22:19
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface Node extends Element {

    List<? extends Edge> getEdgesIn();

    List<? extends Edge> getEdgesOut();

}
