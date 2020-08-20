/**
 * @author Sergei Chekhonin
 * Assingment 2 lab2 p3.10
 * This program "RoachSimulation" simulates the growth of a roach population
 */

public class Main {

    public static void main(String[] args) {
	RoachPopulation roachPopulation = new RoachPopulation(10);
        System.out.println("Roach population is: "+  roachPopulation.getRoaches());

	    roachPopulation.breed();
        roachPopulation.spray(10);
        System.out.println("Roach population is: "+roachPopulation.getRoaches());

        roachPopulation.breed();
        roachPopulation.spray(10);
        System.out.println("Roach population is: "+ roachPopulation.getRoaches());

        roachPopulation.breed();
        roachPopulation.spray(10);
        System.out.println("Roach population is: "+roachPopulation.getRoaches());

        roachPopulation.breed();
        roachPopulation.spray(10);
        System.out.println("Roach population is: "+roachPopulation.getRoaches());
    }
}
