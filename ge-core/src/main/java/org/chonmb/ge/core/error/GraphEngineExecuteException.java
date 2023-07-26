package org.chonmb.ge.core.error;

/**
 * @author chonmb
 * @date 2023/6/15 00:01
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class GraphEngineExecuteException extends RuntimeException{
    public GraphEngineExecuteException() {
        super();
    }

    public GraphEngineExecuteException(String message) {
        super(message);
    }

    public GraphEngineExecuteException(String message, Throwable cause) {
        super(message, cause);
    }

    public GraphEngineExecuteException(Throwable cause) {
        super(cause);
    }

    public GraphEngineExecuteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
