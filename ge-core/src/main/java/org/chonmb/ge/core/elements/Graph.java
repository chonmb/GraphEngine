package org.chonmb.ge.core.elements;

/**
 * @author chonmb
 * @date 2023/6/25 23:31
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public interface Graph {
    boolean hasNextStep(Cursor cursor);

    void step(Cursor cursor);
}
