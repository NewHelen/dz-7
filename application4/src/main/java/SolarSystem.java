
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
        orderFromSun = this.ordinal()+1;
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getPrevDistance() {
        return prevDistance;
    }

    //------------3) віддаленість від сонця         ?
    private int calculateDistanceFromSun() {
        return 0;
    }
    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    //---------------6) наступна планета           ?
    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }
}
