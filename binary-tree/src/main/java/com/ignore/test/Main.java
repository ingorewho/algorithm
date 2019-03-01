package com.ignore.test;

import com.ignore.TreeNode;
import com.ignore.ergodic.BFS;
import com.ignore.ergodic.DFS;

import java.util.List;

/**
 * @Author: ignore1992
 * @Description: 测试类
 * @Date: 2019/3/1
 */
public class Main {
    public static void main(String[] args){
        //构建二叉树
        TreeNode root = new TreeNode("根节点");
        TreeNode left = new TreeNode("左节点$", new TreeNode("左节点$-$"), new TreeNode("右节点$-$"));
        TreeNode right = new TreeNode("右节点#", new TreeNode("左节点#-#"), new TreeNode("右节点#-#"));
        root.setLeft(left);
        root.setRight(right);
        //1.测试广度优先遍历二叉树
        List<TreeNode> orderResult = BFS.bfsOder(root);
        System.out.println("广度优先.");
        for (TreeNode node : orderResult){
            System.out.println(node.getName() + ";");
        }
        System.out.println("===================");
        //2.测试深度优先先序遍历二叉树
        orderResult = DFS.preOder(root);
        System.out.println("深度优先-先序");
        for (TreeNode node : orderResult){
            System.out.println(node.getName() + ";");
        }
    }
}
