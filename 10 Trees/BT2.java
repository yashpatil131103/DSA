class TreeNode {
    int data ;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        left=right=null;

    }
}
class BT2{
    int index=-1;
    
    TreeNode constructBT(int nodeArr[]){
        index++;
        if(nodeArr[index]==-1){
            return null;
        }
        TreeNode newnode=new TreeNode(nodeArr[index]);
        newnode.left=constructBT(nodeArr);
        newnode.right=constructBT(nodeArr);
    
        return newnode;
    }
    void preorder(TreeNode root){

        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

     void inorder(TreeNode root){

        if(root==null){
            return;
        }
      
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
   
     void postorder(TreeNode root){

        if(root==null){
            return;
        }
      
        postorder(root.left);    
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    int count(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftNodecount=count(root.left);
        int rightNodecount=count(root.right);

        return leftNodecount+rightNodecount+1;

    }

    public static void main(String [] arge ){
        int nodeArr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT2 bt = new BT2();
        TreeNode root =bt.constructBT(nodeArr);
        System.out.println("Preorder");
        bt.preorder(root); 
        System.out.println("Postorder");
        bt.postorder(root);
        System.out.print("Inorder");
        bt.inorder(root);

        int count = bt.count(root);
        System.out.println("Total count ="+ count);
    }
}