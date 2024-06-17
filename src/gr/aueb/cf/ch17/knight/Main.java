package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
        IKnight joaDarc = new Knight();
        IKnight saintGeorge = new Knight();

        joaDarc.embrakInMission(new IMission() {
            @Override
            public void embrak() {
                killTheDragon();
            }
        });

        saintGeorge.embrakInMission(new IMission() {
            @Override
            public void embrak() {
                System.out.println("Kill the dragon.");
            }
        });

        joaDarc.embrakInMission(() -> System.out.println("Save the princess."));
        saintGeorge.embrakInMission(() -> killTheDragon());

        saintGeorge.embrakInMission(Main::killTheDragon);
        joaDarc.embrakInMission(Main::saveThePrincess);
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess.");
    }

    public static void killTheDragon() {
        System.out.println("Kill the dragon.");
    }
}
