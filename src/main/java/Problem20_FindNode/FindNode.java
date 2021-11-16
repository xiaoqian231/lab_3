package Problem20_FindNode;

import java.util.Iterator;
import java.util.LinkedList;

public class FindNode {
    //Given two singly linked lists that intersect at some point, find the intersecting node.
    // The lists are non-cyclical.
    //For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.
    //In this example, assume nodes with the same value are the exact same node objects.
    //Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
    public int findNode(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        Iterator<Integer> itr = list1.iterator();
        int node=0;
        while (itr.hasNext()) {
            if (list2.contains(itr.next())) {
                node=itr.next();
            }
        }
        return node;
    }


}
