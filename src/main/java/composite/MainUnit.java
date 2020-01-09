package composite;

public class MainUnit {
    public static void main(String[] ags)
    {
        AAA root = new AAA();
        BBB parent = new BBB(root);

        parent.fooBar();

    }
}
