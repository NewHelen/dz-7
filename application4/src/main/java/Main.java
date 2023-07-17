public class Main {
        public static void main(String[] args) {
                SolarSystem mars = SolarSystem.MARS;
// 1) порядковий номер від сонця
                System.out.println("порядковий номер від сонця "+ mars.getOrderFromSun());
// 2) віддаленість від попередньої планети
                System.out.println("віддаленість від попередньої планети "+ mars.getPrevDistance());
// 3) віддаленість від сонця    ?
                System.out.println("віддаленість від сонця "+ mars.getDistanceFromSun());
// 4) радіус
                System.out.println("радіус "+ mars.getRadius());
// 5) попередня планета
                System.out.println("попередня планета "+ mars.getPreviousPlanet());
// 6) наступна планета    ?
                System.out.println("наступна планета "+ mars.getNextPlanet());
        }
}
