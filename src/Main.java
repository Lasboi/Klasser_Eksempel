public class Main {

    public static void main(String[] args) {

        Student ahmed = new Student();
        Student sune = new Student();

        ahmed.setName("Ahmed Hassan");
        sune.setName("Sune Bro");

        ahmed.setBirthYear(1997);
        sune.setBirthYear(1998);

        sune.setHomeTown("Slagelse");

        System.out.println("Den studerenes navn er: " + ahmed.getName() + " og er født i år: "+ ahmed.getBirthYear());
        System.out.println("Den studerenes navn er: " + sune.getName() + " og er født i år: " + sune.getBirthYear() +
                            " og kommer fra: " + sune.getHomeTown());



    }
}
