package interfaces;

public class MyInterfaceExample implements MyInterface {

    public void foobar() {
        System.out.println("Calling default method bar() from local method foobar()");
        bar();
    }

    public static void main(String[] args) {
        var my = new MyInterfaceExample();
        my.foobar();
        MyInterface.buzz();
    }

}
