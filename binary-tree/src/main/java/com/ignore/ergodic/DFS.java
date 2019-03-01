package com.ignore.ergodic;

import com.ignore.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: ignore1992
 * @Description: 深度优先遍历
 * @Date: 2019/3/1
 */
public class DFS {

    /**
     * 对一个二叉树进行先序遍历
     * @param root
     * @return
     */
    public static List<TreeNode> preOder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> list = new ArrayList<>();
        TreeNode currentNode = null;
        stack.push(root);
        while (!stack.isEmpty()){
            currentNode = stack.pop();
            list.add(currentNode);
            if (currentNode.getRight() != null){
                stack.push(currentNode.getRight());
            }
            if (currentNode.getLeft() != null){
                stack.push(currentNode.getLeft());
            }
        }
        return list;
    }

    /**
     * 对一个二叉树进行中序遍历(暂未实现)
     * @param root
     * @return
     */
    public static List<TreeNode> inOrder(TreeNode root){
       return null;
    }
}
