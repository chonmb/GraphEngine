package org.chonmb.ge.core.executors;

import org.chonmb.ge.core.elements.Cursor;

/**
 * @author chonmb
 * @date 2023/6/12 23:59
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface CursorGraphConsumer {
    void accept(Cursor cursor) throws Exception;
}
