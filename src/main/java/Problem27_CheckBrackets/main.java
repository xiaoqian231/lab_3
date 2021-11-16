package Problem27_CheckBrackets;

public class main {
    public static void main(String[] args) {
        CheckBrackets cb=new CheckBrackets();
        System.out.println(cb.CheckBrackets("({[]})"));
        System.out.println(cb.CheckBrackets("({[])"));
    }
}
