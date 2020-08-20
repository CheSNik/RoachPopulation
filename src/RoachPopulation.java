public class RoachPopulation {
    private int _initRoachPopulation;

    /***
     *
     * @param initRoachPopulation - takes the size of the initial roach population
     */
    public RoachPopulation(int initRoachPopulation) {
        _initRoachPopulation = initRoachPopulation;
    }

    /***
     * when roaches breed, which doubles their population.
     */
    public void breed() {
        _initRoachPopulation *=2;
    }

    /***
     *simulates spraying with insecticide
     * @param percent - takes the percent on what population reduces
     */
    public void spray(double percent){
        _initRoachPopulation*=(1-percent/100);
    }

    /***
     *
     * @return current number of roaches
     */
    public int getRoaches(){
        return _initRoachPopulation;
    }

}
