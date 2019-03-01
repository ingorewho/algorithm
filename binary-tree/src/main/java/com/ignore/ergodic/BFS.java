package com.ignore.ergodic;

import com.ignore.TreeNode;

import java.util.*;

/**
 * @Author: ignore1992
 * @Description: 广度优先遍历
 * @Date: 2019/3/1
 */
public class BFS {

    /**
     * 对一个二叉树进行广度遍历
     * @param root
     * @return
     */
    public static List<TreeNode> bfsOder(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<TreeNode> list = new ArrayList<>();
        TreeNode currentNode = null;
        queue.offer(root);
        while (queue.peek() != null){
            currentNode = queue.poll();
            list.add(currentNode);
            //将左节点入队
            if (currentNode.getLeft() != null){
                queue.offer(currentNode.getLeft());
            }
            //将右节点入队
            if (currentNode.getRight() != null){
                queue.offer(currentNode.getRight());
            }
        }
        return list;
    }
}
