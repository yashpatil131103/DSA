class TreeNode {
    int data ;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        left=right=null;

    }
}
class height{
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
    int hoftree(TreeNode root){
        
        if(root==null){
            return 0;

        }
        int heightofLST=hoftree(root.left);
        int heightofRST=hoftree(root.right);
        return max(heightofLST,heightofRST);

    }
    int max(int heightofLST, int heightofRST){
        if(heightofLST<=heightofRST){
            return heightofRST;
        }
        else
          return heightofRST;
    }
    public static void main(String [] arge ){
        int nodeArr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        height bt = new height();
        TreeNode root =bt.constructBT(nodeArr);
       int height = bt.hoftree(root);
       System.out.println("Height of tree "+ height);
     
    }
}