public class Firefighters  extends Rescuers implements PutOutTheFire {


    public Firefighters(String name, String jobTitle, int age, Backpack backpack) {
        super(name, jobTitle, age, backpack);
    }

    @Override
    public void putOutTheFire() {
        System.out.println("тушить пажар");
    }
}
