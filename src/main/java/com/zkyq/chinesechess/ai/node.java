package com.zkyq.chinesechess.ai;

public class node {
    boolean type; // true:极大层  false:极小层
    boolean update;
    int ex;
    node parent;
    public int from;
    public int to;
    node(boolean type, node parent) {
        this.update = false;
        this.type = type;
        this.parent = parent;
    }
}
