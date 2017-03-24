 /* Class BT */
// Extraido de:  http://algorithms.tutorialhorizon.com/binary-search-tree-complete-implementation/
 public class BinaryTree<E extends Comparable<E>>
 {
		// Variable del nodo
		private BTNode<E> root;

		
		// Obtener el nodo
		public BTNode<E> getRoot() {
			return root;
		}

		
		// Colocar un nodo
		public void setRoot(BTNode<E> root) {
			this.root = root;
		}


		// Constructor
		public BinaryTree() {
			this.root = null;
		}

		
		// Encontrar y devolver un elemento del BST
		public E find(E id) {
			BTNode<E> current = root;
			while (current != null) {
				if (current.data.equals(id)) {
					return current.data;
				} else if (current.data.compareTo(id) > 0) {
					current = current.left;
				} else {
					current = current.right;
				}
			}
			return null;
		}

		
		// Eliminar un elemento
		public boolean delete(E id) {
			BTNode<E> parent = root;
			BTNode<E> current = root;
			boolean isLeftChild = false;
			while (!current.data.equals(id)) {
				parent = current;
				if (current.data.compareTo(id) > 0) {
					isLeftChild = true;
					current = current.left;
				} else {
					isLeftChild = false;
					current = current.right;
				}
				if (current == null) {
					return false;
				}
			}	
			// Case 1: Si el nodo no tiene hijos
			if (current.left == null && current.right == null) {
				if (current == root) {
					root = null;
				}
				if (isLeftChild == true) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			// Case 2 : Si el nodo solo tiene un hijo
			else if (current.right == null) {
				if (current == root) {
					root = current.left;
				} else if (isLeftChild) {
					parent.left = current.left;
				} else {
					parent.right = current.left;
				}
			} else if (current.left == null) {
				if (current == root) {
					root = current.right;
				} else if (isLeftChild) {
					parent.left = current.right;
				} else {
					parent.right = current.right;
				}
			} else if (current.left != null && current.right != null) {

				BTNode<E> successor = getSuccessor(current);
				if (current == root) {
					root = successor;
				} else if (isLeftChild) {
					parent.left = successor;
				} else {
					parent.right = successor;
				}
				successor.left = current.left;
			}
			return true;
		}

		
		// Obtener el nodo sucesor
		public BTNode<E> getSuccessor(BTNode<E> deleleBTNode) {
			BTNode<E> successsor = null;
			BTNode<E> successsorParent = null;
			BTNode<E> current = deleleBTNode.right;
			while (current != null) {
				successsorParent = successsor;
				successsor = current;
				current = current.left;
			}
			if (successsor != deleleBTNode.right) {
				successsorParent.left = successsor.right;
				successsor.right = deleleBTNode.right;
			}
			return successsor;
		}

		
		// Insertar un nuevo elemento
		public void insert(E id) {
			BTNode<E> newBTNode = new BTNode<E>(id);
			if (root == null) {
				root = newBTNode;
				return;
			}
			BTNode<E> current = root;
			BTNode<E> parent = null;
			while (true) {
				parent = current;
				if (current.data.compareTo(id) > 0) {
					current = current.left;
					if (current == null) {
						parent.left = newBTNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newBTNode;
						return;
					}
				}
			}
		}

		
		// Mostrar el nodo
		public void display(BTNode<E> root) {
			if (root != null) {
				display(root.left);
				System.out.print(" " + root.data);
				display(root.right);
			}
		}
	}


