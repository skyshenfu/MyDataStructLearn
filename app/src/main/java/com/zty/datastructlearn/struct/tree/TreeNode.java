package com.zty.datastructlearn.struct.tree;

/**
 * 树的节点
 * @param <T> 树里面包裹的具体类型
 */
public class TreeNode<T> {
    //树的数据
    T data;
    //左节点
    TreeNode<T> leftChild;
    //右侧节点
    TreeNode<T> rightChild;

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
