import java.util.ArrayList;
import java.util.List;

class preorder_traversal_recursion
{
	List<Integer> list_var = new ArrayList<Integer>();
	
	public class TreeNode
	{
		int val;
		
		TreeNode left;
		TreeNode right;

		TreeNode(int x)
		{
			val = x;
		}
	}

	public void preorder(TreeNode root)
	{
		list_var.add(root.val);
		if (root.left != null)
			preorder(root.left);
		if (root.right != null)
			preorder(root.right);
	}

	public List<Integer> preorderTraversal(TreeNode root)
	{
		if (root == null)
			return list_var;
		preorder(root);
		return list_var;

	}
}
