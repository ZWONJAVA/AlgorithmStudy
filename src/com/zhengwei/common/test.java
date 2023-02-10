//import com.zhengwei.common.TreeNode;
//
//import java.util.*;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//
//    class RowCol implements Comparable {
//        public RowCol(int row, int col) {
//            this.row = row;
//            this.col = col;
//        }
//
//        public int row;
//        public int col;
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o instanceof RowCol) {
//                RowCol rowCol = (RowCol) o;
//                return this.row == rowCol.row && this.col == rowCol.col;
//            } else {
//                return false;
//            }
//
//        }
//
//        @Override
//        public int hashCode() {
//            int hashcode = 17;
//            hashcode = hashcode * 31 + this.row;
//            hashcode = hashcode * 31 + this.col;
//            return hashcode;
//        }
//
//        @Override
//        public int compareTo(Object o) {
//            if (equals(o)) {
//                return 0;
//            }
//            RowCol o1 = (RowCol) o;
//            if (o1.col < this.col) {
//                return 1;
//            } else if (o1.col > this.col) {
//                return -1;
//            } else {
//                return this.row - o1.row;
//            }
//        }
//    }
//
//
//    public List<List<Integer>> verticalTraversal(TreeNode root) {
//        Map<RowCol, ArrayList<Integer>> result = new TreeMap<>();
//        backTracking(root, 0, 0, result);
//        Map<Integer, List<Integer>> colResult = new TreeMap<>();
//        for (RowCol rowCol : result.keySet()) {
//            ArrayList<Integer> list = result.get(rowCol);
//            if (colResult.containsKey(rowCol.col)) {
//                colResult.get(rowCol.col).addAll(list);
//            } else {
//                colResult.put(rowCol.col, list);
//            }
//        }
//        List<List<Integer>> res = new ArrayList(colResult.values());
//        return res;
//    }
//
//    public void backTracking(TreeNode treeNode, int col, int row, Map<RowCol, ArrayList<Integer>> result) {
//        if (treeNode == null) return;
//        RowCol rowCol = new RowCol(row, col);
//        if (result.containsKey(rowCol)) {
//            result.get(rowCol).add(treeNode.val);
//            Collections.sort(result.get(rowCol));
//        } else {
//            result.put(rowCol, new ArrayList<>());
//            result.get(rowCol).add(treeNode.val);
//            Collections.sort(result.get(rowCol));
//        }
//        backTracking(treeNode.left, col - 1, row + 1, result);
//        backTracking(treeNode.right, col + 1, row + 1, result);
//    }
//}