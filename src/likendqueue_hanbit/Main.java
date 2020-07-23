package likendqueue_hanbit;

public class Main {
    public static void main(String[] args){
        int deletedItem;
        LinkedQueue LQ = new LinkedQueue();

        LQ.enQueue(1);
        LQ.printQueue();

        LQ.enQueue(2);
        LQ.printQueue();

        deletedItem = LQ.deQueue();
        if(deletedItem != 0){
            System.out.println("deleted item: "+deletedItem);
        }
        LQ.printQueue();
        LQ.enQueue(3);
        LQ.printQueue();

    }
}
