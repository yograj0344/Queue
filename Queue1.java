import java.util.*;
class Queue1  //  Queue extends the collection interface 
              // Queue is follow the FIFO approch(First in First out)
              //  Queue not allow null valuse
              //Queue  interface is implementation  2 type
              // 1:-LinkedList
              //2:- PriorityQueue

{
    public static void main(String[] args)
    {
        Queue<String> list=new LinkedList<String>();
        list.add("yograj");
        System.out.println(list);
        list.add("dak");
        list.add(null);
        list.add("amar");
        System.out.println(list);
        list.peek();
        System.out.println(list);
        list.poll();
        System.out.println(list);
        list.remove();
        System.out.println(list);
        System.out.println(list.peek());

        PriorityQueue<String> list1=new PriorityQueue<String>(); // sort in element count order

        list1.add("am");
        list1.add("naj");
        list1.add("yograj");
        list1.add("zaju");
        System.out.println(list1);


    }

}
