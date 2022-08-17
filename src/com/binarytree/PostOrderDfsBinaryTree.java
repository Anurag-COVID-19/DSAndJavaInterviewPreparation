package com.binarytree;

import com.common.Node;

public class PostOrderDfsBinaryTree
{
    Node root;

    PostOrderDfsBinaryTree()
    {
        root = null;
    }

    private void postOrderDepthFirstSearchBinaryTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrderDepthFirstSearchBinaryTree(root.left);
        postOrderDepthFirstSearchBinaryTree(root.right);
        System.out.printf(root.data + " ");
    }

    public void postOrderTraversal()
    {
        postOrderDepthFirstSearchBinaryTree(root);
    }

    public static void main(String[] args) {
        PostOrderDfsBinaryTree postOrderDfsBinaryTree = new PostOrderDfsBinaryTree();
        postOrderDfsBinaryTree.root = new Node(1);
        postOrderDfsBinaryTree.root.left = new Node(2);
        postOrderDfsBinaryTree.root.right = new Node(3);
        postOrderDfsBinaryTree.root.left.left = new Node(4);
        postOrderDfsBinaryTree.root.left.right = new Node(5);
        postOrderDfsBinaryTree.root.right.right = new Node(6);

        System.out.printf("Post Order Traversal :: ");
        postOrderDfsBinaryTree.postOrderTraversal();
    }
}
