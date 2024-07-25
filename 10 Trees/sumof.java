class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        right=left=null;
    }
}

class sumof{

   int index=-1;
   TreeNode constructBT(int[] nodeArr){
        index++;
        if(nodeArr[index]==-1){
            return null;
        }

        TreeNode newnode=new TreeNode(nodeArr[index]);

        newnode.left=constructBT(nodeArr);
        
        newnode.right=constructBT(nodeArr);

        return newnode;
       
   }
    int  sumoftree(TreeNode root){
        if(root==null){
            return 0;
        }

        int LSTsum=sumoftree(root.left);
        int RSTsum =sumoftree(root.right);
        return LSTsum+RSTsum+root.data;
   }

    public static void main(String[] args ){
      
      int nodeArr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      
      sumof sm =new sumof();
      
      TreeNode root=sm.constructBT(nodeArr);
       
      int totalsum= sm.sumoftree(root);
      System.out.println("TOTla sum of tree "+totalsum);


    }




}