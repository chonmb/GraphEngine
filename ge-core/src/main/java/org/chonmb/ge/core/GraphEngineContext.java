package org.chonmb.ge.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/25 23:35
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class GraphEngineContext {
    private final List<GraphManager> graphs=new ArrayList<>();

    void addGraphManager(GraphManager graphManager){
        graphs.add(graphManager);
    }
}
