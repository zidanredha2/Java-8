@FunctionalInterface
public interface Hello {
    void greet(String name);
    default void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
