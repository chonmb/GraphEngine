package org.chonmb.ge.core.executors;

import org.chonmb.ge.core.error.GraphEngineExecuteException;
import org.chonmb.ge.core.executors.GraphExecutor;
import org.chonmb.ge.core.executors.GraphConsumer;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chonmb
 * @date 2023/6/14 23:34
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SingleGraphExecutor extends ThreadPoolGraphExecutor {

    public SingleGraphExecutor() {
        super(new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>()));
    }
}
