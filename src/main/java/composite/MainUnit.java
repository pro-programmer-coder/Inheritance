package composite;

public class MainUnit {
    public static void main(String[] ags)
    {
        IAAA root = new AAAStub();
        BBB parent = new BBB(root);

        parent.fooBar();

    }
}
