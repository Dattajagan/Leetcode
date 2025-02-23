class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] preIndex={0};
        return construct(preorder,postorder,preIndex,0,preorder.length-1,preorder.length);
    }
    private TreeNode construct(int[] preorder, int[] postorder,int[] preIndex,int l,int r,int size){
        if(preIndex[0]>=size || l>r){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preIndex[0]]);
        preIndex[0]++;
        if(l==r){
            return root;
        }
        int i;
        for(i=l;i<=r;++i){
            if(preorder[preIndex[0]]==postorder[i]){
                break;
            }
        }
        if(i<=r){
            root.left=construct(preorder,postorder,preIndex,l,i,size);
            root.right=construct(preorder,postorder,preIndex,i+1,r-1,size);
        }
        return root;
    }
}