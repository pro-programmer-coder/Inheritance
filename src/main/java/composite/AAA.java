package composite;

public class AAA implements IAAA{

    private int x =7;

    public AAA() {
    }

    public int fooBar(){
        x = 9;
        System.out.println("AAA::foorbar()");
        return 3;
    }

    public void f1(){};

    private void f2(){
        System.out.println("AAA::f2()");
    };

}
