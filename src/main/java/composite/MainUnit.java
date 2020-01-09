package composite;

public class MainUnit {
    public static void main(String[] ags)
    {
        BBB parent = new BBB(new AAA());

        parent.fooBar();
    }
}
