public class Hangar {

    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", 20000);

        Boat queenMary = new Boat("Queen Mary 2", 400000);

        System.out.println(mercedes.doStuff() + ", j'ai " + mercedes.getKilometers());

        mercedes.setKilometers(100000);

        System.out.println(mercedes.doStuff() + " j'ai beacuoup roulé, j'ai maintenant " + mercedes.getKilometers()
                + " kilomètres");

        System.out.println(queenMary.doStuff());
        queenMary.setBrand("Queen Mary 3");

        System.out.println("Le Queen Mary 2 s'appelle maintent: " + queenMary.getBrand());

    }
}
