package org.chonmb.ge.example.simple;

import org.chonmb.ge.core.elements.Cursor;

/**
 * @author chonmb
 * @date 2023/6/11 22:37
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class SimpleCursor implements Cursor {
    private SimpleNode currentNode;
    private String content;

    @Override
    public SimpleNode getCurrentNode() {
        return currentNode;
    }


    public void setCurrentNode(SimpleNode currentNode) {
        this.currentNode = currentNode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
