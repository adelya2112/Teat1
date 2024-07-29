public class Paramedics extends Rescuers implements FirstAid{


    public Paramedics(String name, String jobTitle, int age, int backpack) {
        super(name, jobTitle, age, backpack);
    }

    @Override
    public void firstAd() {
        System.out.println("оказывать первую помощь");
    }
}
