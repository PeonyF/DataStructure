package arraylistqueueQ7_2;

public class Main {
   public static void main(String[] args){
       int queueSize = 4;
       char deletedItem;
       ArrayQueue circularQ = new ArrayQueue(queueSize);

       circularQ.enQueue('A');
       circularQ.printQueue();

       circularQ.enQueue('B');
       circularQ.printQueue();

       deletedItem = circularQ.deQueue();

       if(deletedItem != 0){
           System.out.println("deleted Item: "+deletedItem);
       }
       circularQ.printQueue();

       circularQ.enQueue('C');
       circularQ.printQueue();

       circularQ.enQueue('D');
       circularQ.printQueue();

       circularQ.enQueue('E');
       circularQ.printQueue();

   }

}
