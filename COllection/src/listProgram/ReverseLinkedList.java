package listProgram;




public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node5 = new Node(5, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		
		Node node = node1;
		while(node != null) {
            System.out.print(node.data+" ");
            node=node.next;
        }

       Node head = reverseLinkList(node1);
        System.out.println(" ");

        node = head;
       while(node != null) {
           System.out.print(node.data+" ");
           node=node.next;
       }

	}
	
	public static Node reverseLinkList(Node head)
	{
		Node next= null;
		Node previus = null;
		Node current = head;
		
		while(current != null) {
			
			next = current.next;
			current.next = previus;
			previus = current;
			current = next;
		}
		return previus;
		
	}

}
