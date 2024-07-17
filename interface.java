interface display
{
    abstract void get();
}
interface print extends display
{
    abstract void show();
}
class Main implements print
{
    void show()
    {
        System.out.println("Hello");
    }
    void get()
    {
        System.out.println("GLA");
    }
    public static void main (String[] args)
    {
        Main A=new Main();
        A.get();
        A.show();
    }
}
