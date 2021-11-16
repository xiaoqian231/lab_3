package Problem40_FindNonDuplicated;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        FindNonDuplicated FD=new FindNonDuplicated();
        ArrayList<Integer> input=new ArrayList<>();
        input.add(3);
        input.add(3);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(5);
        input.add(5);

        System.out.println(FD.FindNonDuplicated(input));
    }
}
