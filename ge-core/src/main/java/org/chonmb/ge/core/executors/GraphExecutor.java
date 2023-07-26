package org.chonmb.ge.core.executors;

/**
 * @author chonmb
 * @date 2023/6/13 00:07
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface GraphExecutor {

    void submit(GraphConsumer consumer);

    void close();
}
