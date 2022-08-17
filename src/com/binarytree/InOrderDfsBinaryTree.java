package com.binarytree;

import com.common.Node;

public class InOrderDfsBinaryTree
{
    private Node root;

    InOrderDfsBinaryTree()
    {
        root = null;
    }

    public void inOrderDepthFirstSearchBinaryTree(Node root)
    {
        if(root == null )
        {
            return;
        }
        inOrderDepthFirstSearchBinaryTree(root.left);
        System.out.printf(root.data+ " ");
        inOrderDepthFirstSearchBinaryTree(root.right);
    }

    public void inOrderTraversal()
    {
        inOrderDepthFirstSearchBinaryTree(root);
    }

    public static void main(String[] args) {
        InOrderDfsBinaryTree binaryTree = new InOrderDfsBinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.right = new Node(6);

        System.out.println("In-order traversal :: ");
        binaryTree.inOrderTraversal();
    }
}
