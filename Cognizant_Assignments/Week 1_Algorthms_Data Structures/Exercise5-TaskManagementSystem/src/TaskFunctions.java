class Node{
    Task task;
    Node next;

    public Node(Task task){
        this.task=task;
        this.next=null;
    }

}
    public class TaskFunctions {
        Node head;
        public TaskFunctions(){
            this.head=null;
    }

    public void addTask(Task work){
            Node newNode=new Node(work);
            if(head==null){
                head=newNode;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=newNode;
            }
    }

    public Task searchLL(String taskID){
            Node curr=head;
            while(curr!=null){
                if(curr.task.getTaskID().equals(taskID)){
                    return curr.task;
                }
                curr=curr.next;
            }
            return null;
    }

    public void Traversal(){
            Node curr=head;
            while(curr!=null){
                System.out.println(curr.task);
                curr=curr.next;
            }
    }

    public void delete(String taskID){
            if(head==null) return;
            if(head.task.getTaskID().equals(taskID)){
                head=head.next;
                return;
            }
            Node curr=head;
            while(curr.next!=null && !curr.next.task.getTaskID().equals(taskID)){
                curr=curr.next;
            }

            if(curr.next!=null){
                curr.next=curr.next.next;
            }
    }

}
