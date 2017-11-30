public class JavaQuiz{
	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		public int val;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void append(int new_data)
    {
        ListNode new_node = new ListNode(new_data);

        if (head == null)
        {
            head = new ListNode(new_data);
            return;
        }
      
        new_node.next = null;
 
        ListNode last = head; 
        while (last.next != null)
            last = last.next;
 
        last.next = new_node;
        return;
    }
	
	public ListNode deleteLast(ListNode head){
		if(head == null){
			return head;
		}
		
		ListNode last = head;
		ListNode previousToLast = null;
		
		while(last.next !=null) {
			previousToLast = last;
			last = last.next;
		}
		
		previousToLast.next = null;
		return last;
	}
	
	public ListNode removeElements(ListNode head, int val) {
	    ListNode helper = new ListNode(0);
	    helper.next = head;
	    ListNode p = helper;
	 
	    while(p.next != null){
	        if(p.next.val > val){
	            ListNode next = p.next;
	            p.next = next.next; 
	        }else{
	            p = p.next;
	        }
	    }
	 
	    return helper.next;
	}
}