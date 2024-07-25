import java.util.*;

class Node {
   int  data;
   Node left;
   Node right;

   Node(int data){            //constructor 
          this.data=data;
        left=right=null;
   }
}
class BinaryTree{

    Scanner sc=new Scanner(System.in );
    Node constructBT(){
        System.out.println("Enter data for Node ");
        int data =sc.nextInt();

        Node newNode =new Node(data);
        System.out.println("Do You want to enter at left? "+ newNode.data);
        char leftNode=sc.next().charAt(0);
        if(leftNode=='y' || leftNode=='Y'){
            newNode.left=constructBT();
        }
        System.out.println("DO you want to enter at right"+newNode.data);
        char rightNode=sc.next().charAt(0);
        if(rightNode=='y'|| rightNode=='Y'){
            newNode.right=constructBT();
        }
        
        return newNode;
    }
    void preorderBT(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.data +"");
        preorderBT(root.left);
        preorderBT(root.right);

    }
    void postorderBT(Node root){
        if(root==null){
            return;
        }

        postorderBT(root.left);
        postorderBT(root.right);
        System.out.println(root.data +"");
    }
     void inorderBT(Node root){
        if(root==null){
            return;
        }
        
        inorderBT(root.left);
        System.out.println(root.data +"");
        inorderBT(root.right);
       
    }

    public static void main(String[] args){
        Node root =null;
        BinaryTree bt=new BinaryTree();
        root = bt.constructBT();
        System.out.println("Preorder traversal");
        bt.preorderBT(root);
       
        System.out.println("InOrder Traversal");
        bt.inorderBT(root);
        
        
        System.out.println("PostOrder Traversal");
        bt.postorderBT(root);
    } 
}