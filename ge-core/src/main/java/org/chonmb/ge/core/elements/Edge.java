package org.chonmb.ge.core.elements;

import org.chonmb.ge.core.executors.CursorGraphConsumer;
import org.chonmb.ge.core.executors.GraphConsumer;

/**
 * @author chonmb
 * @date 2023/6/11 21:40
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface Edge extends Element {

    Node getTail();

    Node getHead();

    void setConsumer(CursorGraphConsumer consumer);

    void action(Cursor cursor);

}
