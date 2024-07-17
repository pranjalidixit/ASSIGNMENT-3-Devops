public class maxofthreenumbers {
    public static void main(String args[])
    {
        int a=5;
        int b=6;
        int c=7;
        String k=a>b && a>c ? "a is greater" : b>a && b>c ? "b is greater" : "c is greater";
        System.out.println(+k);
    }
    
}
