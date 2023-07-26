package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.executors.GraphExecutor;
import org.chonmb.ge.core.executors.SingleGraphExecutor;

import java.util.concurrent.TimeUnit;

/**
 * @author chonmb
 * @date 2023/6/12 23:41
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleGraphManager {
    private final GraphExecutor graphExecutor = new SingleGraphExecutor();
    private final SimpleGraph simpleGraph;


    public SimpleGraphManager(SimpleGraph simpleGraph) {
        this.simpleGraph = simpleGraph;
    }

    public void startGraphFlow(SimpleCursor simpleCursor) {
        graphExecutor.submit(() -> {
            while (simpleGraph.hasNext(simpleCursor)) {
                TimeUnit.SECONDS.sleep(1);
                simpleGraph.step(simpleCursor);
            }
        });
    }

    public void close() {
        graphExecutor.close();
    }

}
