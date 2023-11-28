public class Main {
    public static void main(String[] args) {
        House house = new House(1, 20.0, 30.0, 2);
        Villa villa = new Villa(2, 25.0, 35.0, 3);
        Hotel hotel = new Hotel(3, 30.0, 40.0, 4);

        System.out.println("House Price: " + house.calculatePrice());
        System.out.println("Villa Price: " + villa.calculatePrice());
        System.out.println("Hotel Price: " + hotel.calculatePrice());
    }
}
