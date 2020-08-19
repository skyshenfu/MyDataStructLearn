package com.zty.datastructlearn.struct.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZTree{
    //根据LinkedList创建一个二叉树
    //先序遍历 就是中 左右
    public static  <T>  TreeNode<T> createBinaryTree(LinkedList<T> inputList){
        TreeNode<T> node=null;
        if (inputList==null||inputList.isEmpty()){
            return node;
        }else {
            T asRootData=inputList.removeFirst();
            if (asRootData!=null){
                node=new TreeNode<>(asRootData);
                node.setLeftChild(createBinaryTree(inputList));
                node.setRightChild(createBinaryTree(inputList));
            }
        }
        return node;
    }


    //先序遍历 就是中 左右
    public static  <T> void preOrderErgodic(TreeNode<T> node){
        if (node==null){
            return;
        }
        System.out.println(node.getData().toString());
        preOrderErgodic(node.leftChild);
        preOrderErgodic(node.rightChild);
    }

    //中序遍历 就是左中右
    public static  <T> void midOrderErgodic(TreeNode<T> node){
        if (node==null){
            return;
        }
        midOrderErgodic(node.leftChild);
        System.out.println(node.getData().toString());
        midOrderErgodic(node.rightChild);
    }

    //后序遍历
    public static  <T> void postOrderErgodic(TreeNode<T> node){
        if (node==null){
            return;
        }
        postOrderErgodic(node.leftChild);
        postOrderErgodic(node.rightChild);
        System.out.println(node.getData().toString());
    }

    //层序遍历使用队列
    public  static <T> void levelOrderErgodic(TreeNode<T> root){
        if (root==null){
            return;
        }
        Queue<TreeNode<T>> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
           //出队列就打印
           TreeNode<T> node=queue.poll();
            System.out.println(node.data);

            //左
            if (node.leftChild!=null){
                queue.offer(node.leftChild);
            }

            //右
            if (node.rightChild!=null){
                queue.offer(node.rightChild);
            }
        }
    }



    //先序遍历使用栈
    public  static <T> void preOrderWithStackErgodic(TreeNode<T> root){
        if (root==null){
            return;
        }
        Stack<TreeNode<T>> stack=new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            TreeNode<T> node=stack.pop();
            System.out.println(node.data);

            //右
            if (node.rightChild!=null){
                stack.push(node.rightChild);
            }

            //左
            if (node.leftChild!=null){
                stack.push(node.leftChild);
            }


        }
    }

    //中序遍历使用栈
    public  static <T> void midOrderWithStackErgodic(TreeNode<T> root){
        if (root==null){
            return;
        }

        Stack<TreeNode<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            while (stack.peek().leftChild != null) {
                stack.push(stack.peek().leftChild);
            }
            while (!stack.isEmpty()) {
                TreeNode<T> node = stack.pop();
                System.out.print(node.data + " ");

                if (node.rightChild != null) {
                    stack.push(node.rightChild);
                    break;
                }
            }
        }
    }

    //后序遍历使用栈
    public  static <T> void postOrderWithStackErgodic(TreeNode<T> root){
        if (root==null){
            return;
        }

        Stack<TreeNode<T>> stack = new Stack<>();
        stack.push(root);
        TreeNode<T> lastNode = null;
        while (!stack.isEmpty()) {
            while (stack.peek().leftChild != null) {
                stack.push(stack.peek().leftChild);
            }
            while (!stack.isEmpty()) {
                if (lastNode == stack.peek().rightChild || stack.peek().rightChild == null) {
                    TreeNode<T>  node = stack.pop();
                    System.out.print(node.data + " ");
                    lastNode = node;
                } else if (stack.peek().rightChild != null) {
                    stack.push(stack.peek().rightChild);
                    break;
                }
            }
        }
    }

}
