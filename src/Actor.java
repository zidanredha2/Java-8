public interface Actor {
    void act();
    void speak();
    default void stop(){
        System.out.println("The actor has stopped acting.");
    };
}
