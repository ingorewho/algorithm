package com.ignore;

import lombok.ToString;

/**
 * @Author: ignore1992
 * @Description: 二叉树结构定义
 * @Date: 2019/3/1
 */
@ToString
public class TreeNode {
    /**左节点.**/
    private TreeNode left;
    /**右节点.**/
    private TreeNode right;
    /**节点名称.**/
    private String name;

    public TreeNode(String name){
        this.name = name;
    }

    public TreeNode(String name, TreeNode left, TreeNode right){
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
