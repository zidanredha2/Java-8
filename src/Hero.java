public class Hero implements Actor{

    @Override
    public void act() {
        System.out.println("The hero is acting bravely!");
    }

    @Override
    public void speak() {
        System.out.println("The hero says: 'Justice will prevail!'");
    }

}
