package Problem20_FindNode;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        LinkedList<Integer> list2=new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(5);
        list2.add(7);

        FindNode findNode=new FindNode();
        System.out.println( findNode.findNode(list1,list2));
    }

}
