package com.zty.datastructlearn;

import com.zty.datastructlearn.struct.queue.CircleQueue;
import com.zty.datastructlearn.struct.tree.TreeNode;
import com.zty.datastructlearn.struct.tree.ZTree;

import org.junit.Test;

import java.util.LinkedList;

public class TreeTest {

    @Test
    public void test() {
        LinkedList<String> linkedList=new LinkedList<String>(){
            {
                add("A");
                add("B");
                add("D");
                add(null);
                add(null);
                add(null);
                add("C");
                add("E");
                add(null);
                add(null);
                add("F");

            }
        };
        TreeNode<String> treeNode=ZTree.createBinaryTree(linkedList);
//        //先序遍历
//        ZTree.preOrderErgodic(treeNode);
//
//        //中序遍历
//        ZTree.midOrderErgodic(treeNode);
         //层序遍历
//          ZTree.levelOrderErgodic(treeNode);

        ZTree.midOrderWithStackErgodic(treeNode);

    }
}
