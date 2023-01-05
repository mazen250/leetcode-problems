import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraverseBinaryTree {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        if(root == null) {
            return result;
        }

        while (current !=null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;

    }
}

