import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Main {
    public static void main(String[] args) {
       Hero hero = new Hero();
       Villain villain = new Villain();
       List<Integer> list = Arrays.asList(1,2,3,4,5);
       list.forEach(i -> doubleit(i));
       hero.act();
       villain.act();
       hero.stop();
       villain.stop();
       Hello hello = name -> System.out.println("Hello, " + name + "!");
       hello.sayHello("Zidan");
       hello.greet("Zidan");
       list.stream().map(i -> i*i).sorted((a, b) -> b - a).forEach(System.out::println);
    }
    static void doubleit(int i){
        System.out.println(i*2);
    }
}