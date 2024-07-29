import java.awt.image.renderable.ParameterBlock;

public abstract class Rescuers  {

    private String name;
    private String  jobTitle;
    private int age;

    private Backpack  backpack;

    public Rescuers(String name, String jobTitle, int age, Backpack backpack) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.backpack = backpack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Rescuers{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", backpack='" + backpack + '\'' +
                '}';
    }
}
