package core;

public abstract class AAA {

    private int x =7;

    public AAA() {
    }

    public int fooBar(){
        x = 9;
        System.out.println("AAA::foorbar()");
        return 3;
    }

    public abstract void f1();
}
