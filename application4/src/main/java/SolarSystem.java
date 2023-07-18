public enum SolarSystem {
    MERCURY( 0, 2440, null),
    VENUS(108, 6052, MERCURY),
    EARTH(149, 6371, VENUS),
    MARS(227, 3389, EARTH),
    JUPITER(778, 69911, MARS),
    SATURN(1427, 58232, JUPITER),
    URANUS(2871, 25362, SATURN),
    NEPTUNE(4497, 24622, URANUS),
    PLUTO(5906, 1188, NEPTUNE);

    private int orderFromSun;
    private int prevDistance;
    private int distanceFromSun;
    private int radius;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem( int prevDistance, int radius, SolarSystem previousPlanet) {
        this.orderFromSun = ordinal()+1;
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = calculateDistanceFromSun();
        //this.nextPlanet = getNextPlanet();
    }

    private int calculateDistanceFromSun() {
        if (previousPlanet != null) {
            return previousPlanet.getDistanceFromSun() + prevDistance;
        }
        return 0;
    }
    public int getDistanceFromSun() {return distanceFromSun;}

    //---------------6) наступна планета           ?
    public SolarSystem getNextPlanet() {

        return null;
    }

   public String print() {
       return "порядковий номер від сонця " + this.orderFromSun +
             "\nвіддаленість від попередньої планети " + this.prevDistance +
             "\nвіддаленість від сонця " + this.prevDistance +
             "\nрадіус планети " + this.radius +
             "\nпопередня планета " + this.previousPlanet +
             "\nнаступна планета " + this.nextPlanet;
   }

}
