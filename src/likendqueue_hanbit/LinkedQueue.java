package likendqueue_hanbit;


public class LinkedQueue {
    Node front;
    Node rear;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    public class Node {
        private int data;
        private Node link;

        public Node(int inputData) {
            this.data = inputData;
            this.link = null;
        }
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void enQueue(int inputData){
        Node newNode = new Node(inputData);

        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }

        else {
            rear.link = newNode;
            rear = newNode;
        }

        System.out.println("Inserted inputData!: "+inputData);
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Deleting fail! Linked Queue is empty!");
            return 0;
        }
        else {
            int inputData = front.data;
            front = front.link;
            if(front == null)
                rear = null;
            return inputData;
        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("Deleting fail! Linked Queue is empty!");
        }
        else {
            front = front.link;
            if(front == null){
                rear = null;
            }
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Peeking fail! Linked Queue is empty!");
            return 0;
        }
        else
            return front.data;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Linked Queue is empty! %n %n");
        }
        else {
            Node temp = front;
           while (temp != null){
               System.out.print(" "+temp.data);
               temp = temp.link;
           }
        }
        System.out.println();
    }
}
