package trywithresources;

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing resource...");
    }
    public void foo() {
        System.out.println("foo!");
    }
}

class Bar {
    public void bar() {
        System.out.println("bar!");
    }
}

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(var myResource = new MyResource()) {
            var myBar = new Bar();
            myResource.foo();
            myBar.bar();
        } catch (Exception ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}
