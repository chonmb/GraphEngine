package org.chonmb.ge.core.models;

import java.util.List;

/**
 * @author chonmb
 * @date 2023/6/25 23:09
 * @application GraphEngine
 * @email weichonmb@foxmail.com
 */
public class OrthogonalListGraphModel implements Model{

    List<OrthogonalListItem> list;

    public List<OrthogonalListItem> getList() {
        return list;
    }

    public void setList(List<OrthogonalListItem> list) {
        this.list = list;
    }
}
