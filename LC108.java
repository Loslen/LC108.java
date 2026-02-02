class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        //昇順配列を平衡に分探索木に変換する
        //将升序数组转换为平衡二叉树
        return dfs(nums, 0, nums.length - 1);
    }
    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        //昇順配列の中央要素をルートノードとする
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        //再帰的にルートの左部分木と右部分木を構築する
        root.left = dfs(nums, lo, mid -1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }
};
