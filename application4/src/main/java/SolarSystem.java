public enum SolarSystem {
    MERCURY(0, 10, null),
    VENUS(100, 20, MERCURY),
    EARTH(200, 30, VENUS),
    MARS(300, 40, EARTH),
    JUPITER(400, 50, MARS),
    SATURN(500, 60, JUPITER),
    URANUS(600, 70, SATURN),
    NEPTUNE(700, 80, URANUS),
    PLUTO(800, 90, NEPTUNE);

    private int orderFromSun;
    private int distanceFromSun;
    private int radius;
    private SolarSystem prevPlanet;
    private int prevPlanetDistance;
    private SolarSystem nextPlanet;
    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPrevPlanet() {
        return prevPlanet;
    }

    public int getPrevPlanetDistance() {
        return prevPlanetDistance;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }

    public void setNextPlanet(SolarSystem nextPlanet) {
        this.nextPlanet = nextPlanet;
    }
    SolarSystem(int prevPlanetDistance, int radius, SolarSystem prevPlanet) {
        this.orderFromSun = ordinal() + 1; //returns position
        this.prevPlanetDistance = prevPlanetDistance;
        this.radius = radius;
        this.prevPlanet = prevPlanet;
        this.distanceFromSun = (prevPlanet == null) ? 0 : prevPlanetDistance + prevPlanet.getRadius() + prevPlanet.getDistanceFromSun();
        if (this.prevPlanet != null) this.prevPlanet.setNextPlanet(this);
    }

    public String print() {
        return "порядковий номер від сонця " + getOrderFromSun() +
                "\nвіддаленість від попередньої планети " + getPrevPlanetDistance() +
                "\nвіддаленість від сонця " + getDistanceFromSun() +
                "\nрадіус планети " + getRadius() +
                "\nпопередня планета " + getPrevPlanet() +
                "\nнаступна планета " + getNextPlanet();
    }

}