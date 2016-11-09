# swap_nodes

A binary tree is a tree which is characterized by any one of the following properties:

a.It can be an empty (null).
b.It contains a root node and two subtrees, left subtree and right subtree. These subtrees are also binary tree.
Inorder traversal is performed as

a.Traverse the left subtree.
b.Visit root (print it).
c.Traverse the right subtree.
(For an Inorder traversal, start from the root and keep visiting the left subtree recursively until you reach the leaf,then you print the node at which you are and then you visit the right subtree.)

We define depth of a node as follow:

Root node is at depth 1.
If the depth of parent node is d, then the depth of current node wll be d+1.


Swapping: Swapping subtrees of a node means that if initially node has left subtree L and right subtree R, then after swapping left subtree will be R and right subtree L.
