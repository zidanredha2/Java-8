public class Villain implements Actor{

    @Override
    public void act() {
        System.out.println("The villain is plotting evil schemes!");
    }

    @Override
    public void speak() {
        System.out.println("The villain says: 'You cannot stop me!'");
    }


}
