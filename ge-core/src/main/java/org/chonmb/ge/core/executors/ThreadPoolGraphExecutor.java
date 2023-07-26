package org.chonmb.ge.core.executors;

import org.chonmb.ge.core.error.GraphEngineExecuteException;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chonmb
 * @date 2023/6/25 23:47
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class ThreadPoolGraphExecutor implements GraphExecutor{
    private final ThreadPoolExecutor poolExecutor;

    public ThreadPoolGraphExecutor(ThreadPoolExecutor poolExecutor) {
        this.poolExecutor = poolExecutor;
    }

    @Override
    public void submit(GraphConsumer consumer) {
        poolExecutor.submit(() -> {
            try {
                consumer.accept();
            } catch (Exception e) {
                throw new GraphEngineExecuteException(e);
            }
        });
    }

    @Override
    public void close() {
        poolExecutor.shutdown();
    }
}
