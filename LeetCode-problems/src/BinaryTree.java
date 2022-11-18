public class BinaryTree {

    public static  class Node{
        Node left,right;
        int data;
        public Node(int data){
            this.data = data;
        }

        //insert a new node to tree
        public void insert(int val){
            if(val<=data){
                if(left==null){
                    left = new Node(val);
                }
                else{
                    left.insert(val);
                }
            }
            else{
                if(right==null){
                    right = new Node(val);
                }
                else{
                    right.insert(val);
                }
            }
        }

        //search for value in tree
        public boolean search(int val){
            if(data==val) return true;
            else if(val<data){
              if(left==null) return false;
              else return left.search(val);
            } else if (val>data) {
                if(right==null) return false;
                else return right.search(val);
            }

                return false;

        }


        //print tree inorder
        public void inorder(){
            if(left != null){
                left.inorder();
            }
            System.out.println(data);

            if(right != null){
                right.inorder();
            }



        }


    }

    public static void main(String[] args) {
        Node node = new Node(4);
        node.insert(2);
        node.insert(5);
        node.insert(1);
        node.insert(3);

        System.out.println(node.search(6));
        node.inorder();

    }
}
