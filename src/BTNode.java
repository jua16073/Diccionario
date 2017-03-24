/*
 *  Java Program to Implement Binary Tree
 *  Extraido de: http://www.sanfoundry.com/java-program-implement-binary-tree/
 */
 
 /* Class BTNode */
 class BTNode<E>
 {    
     BTNode<E> left, right;
     E data;
 
     /* Constructor */
     public BTNode(E data)
     {
         left = null;
         right = null;
         this.data = data;
     }

     /* Function to set left node */
     public void setLeft(BTNode<E> n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(BTNode<E> n)
     {
         right = n;
     }
     /* Function to get left node */
     public BTNode<E> getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public BTNode<E> getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(E d)
     {
         data = d;
     }
     /* Function to get data from node */
     public E getData()
     {
         return data;
     }     
 }