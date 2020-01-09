package composite;

public class BBB{
    //decoupling testing
    //    Quick
    //    Isolated
    //    No extended influence. No I/O

    private AAA parent;

    public BBB(AAA parent) {
        this.parent = parent;
    }

    public int fooBar(){
        parent.fooBar();

        System.out.println("BBB::fooBar()");
        return 99;
    }

    public void f1() {
        System.out.println("Shouldn't be here");
    }


}
