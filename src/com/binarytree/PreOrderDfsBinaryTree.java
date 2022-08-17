package com.binarytree;

import com.common.Node;

public class PreOrderDfsBinaryTree
{
    Node root;

    PreOrderDfsBinaryTree()
    {
        root = null;
    }

    private void preOrderDepthFirstSearchBinaryTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.printf(root.data + " ");
        preOrderDepthFirstSearchBinaryTree(root.left);
        preOrderDepthFirstSearchBinaryTree(root.right);
    }

    public void preOrderTraversal()
    {
        preOrderDepthFirstSearchBinaryTree(root);
    }

    public static void main(String[] args) {
        PreOrderDfsBinaryTree binaryTree = new PreOrderDfsBinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.right = new Node(6);

        System.out.printf("Pre Order Traversal :: ");
        binaryTree.preOrderTraversal();
    }
}
