package Day5;
//--- Hotel Booking System: Interface ---
interface ServiceAvailable {
 java.util.List<String> getServices();
}

//--- Hotel Booking System: Abstract Class (for bookable entities) ---
abstract class BookingEntity {
 public abstract boolean bookRoom();
 public abstract boolean cancelBooking();
 public abstract String getBookingStatus();
}

//--- Hotel Booking System: Base Class ---
abstract class Room extends BookingEntity implements ServiceAvailable {
 private String roomNumber;
 protected double basePrice; // Base price before any type-specific calculation
 private boolean isBooked;

 public Room(String roomNumber, double basePrice) {
     this.roomNumber = roomNumber;
     this.basePrice = basePrice;
     this.isBooked = false; // Initially not booked
 }

 // Encapsulation: Public getters
 public String getRoomNumber() { return roomNumber; }
 public double getBasePrice() { return basePrice; }

 @Override
 public boolean bookRoom() {
     if (!isBooked) {
         this.isBooked = true;
         System.out.println("  Room " + roomNumber + " successfully booked.");
         return true;
     } else {
         System.out.println("  Room " + roomNumber + " is already booked.");
         return false;
     }
 }

 @Override
 public boolean cancelBooking() {
     if (isBooked) {
         this.isBooked = false;
         System.out.println("  Booking for Room " + roomNumber + " successfully cancelled.");
         return true;
     } else {
         System.out.println("  Room " + roomNumber + " was not booked.");
         return false;
     }
 }

 @Override
 public String getBookingStatus() {
     return isBooked ? "Booked" : "Available";
 }

 // Abstract method: Each room type will calculate its price differently
 public abstract double calculatePrice();

 // Abstract method: Each room type will provide its specific services
 @Override
 public abstract java.util.List<String> getServices();

 // Common method for all rooms to display details
 public void displayRoomInfo() {
     System.out.println("\n  --- Room " + roomNumber + " Details ---");
     System.out.println("  Type: " + this.getClass().getSimpleName()); // Gets the actual subclass name
     System.out.printf("  Base Price: Rs. %.2f%n", basePrice);
     System.out.printf("  Calculated Price: Rs. %.2f%n", calculatePrice());
     System.out.println("  Status: " + getBookingStatus());
     System.out.println("  Services: " + String.join(", ", getServices()));
     System.out.println("  --------------------------");
 }
}

//--- Hotel Booking System: Subclasses ---
class SingleRoom extends Room {
 private static final double SINGLE_ROOM_SURCHARGE = 50.0;

 public SingleRoom(String roomNumber, double basePrice) {
     super(roomNumber, basePrice);
 }

 @Override
 public double calculatePrice() {
     return getBasePrice() + SINGLE_ROOM_SURCHARGE;
 }

 @Override
 public java.util.List<String> getServices() {
     return java.util.Arrays.asList("Free Wi-Fi", "Basic Toiletries", "Single Bed", "TV");
 }
}

class DoubleRoom extends Room {
 private static final double DOUBLE_ROOM_DISCOUNT = 20.0;

 public DoubleRoom(String roomNumber, double basePrice) {
     super(roomNumber, basePrice);
 }

 @Override
 public double calculatePrice() {
     return getBasePrice() - DOUBLE_ROOM_DISCOUNT;
 }

 @Override
 public java.util.List<String> getServices() {
     return java.util.Arrays.asList("Free Wi-Fi", "Premium Toiletries", "Double Bed", "TV", "Coffee Maker");
 }
}

class Suite extends Room {
 private static final double SUITE_PREMIUM_PERCENTAGE = 0.20; // 20% premium
 private boolean hasBalcony;

 public Suite(String roomNumber, double basePrice, boolean hasBalcony) {
     super(roomNumber, basePrice);
     this.hasBalcony = hasBalcony;
 }

 // Encapsulation
 public boolean hasBalcony() { return hasBalcony; }

 @Override
 public double calculatePrice() {
     double price = getBasePrice() * (1 + SUITE_PREMIUM_PERCENTAGE);
     if (hasBalcony) {
         price += 100.0; // Extra charge for balcony
     }
     return price;
 }

 @Override
 public java.util.List<String> getServices() {
     java.util.List<String> services = new java.util.ArrayList<>(java.util.Arrays.asList(
         "Free Wi-Fi", "Luxury Toiletries", "King Bed", "Smart TV", "Minibar", "Room Service"
     ));
     if (hasBalcony) {
         services.add("Private Balcony");
     }
     return services;
 }
}

//--- Hotel Booking System: Demonstration Class ---
class HotelBookingSystemDemo {

 public static void main(String[] args) {
     java.util.List<Room> hotelRooms = new java.util.ArrayList<>();

     // Creating room instances
     hotelRooms.add(new SingleRoom("S101", 1000.0));
     hotelRooms.add(new SingleRoom("S102", 1100.0));
     hotelRooms.add(new DoubleRoom("D201", 1800.0));
     hotelRooms.add(new DoubleRoom("D202", 1900.0));
     hotelRooms.add(new Suite("301", 3000.0, true)); // Suite with balcony
     hotelRooms.add(new Suite("302", 2800.0, false)); // Suite without balcony

     System.out.println("--- Hotel Booking System Demonstration ---");

     System.out.println("\n--- Initial Room Details ---");
     for (Room room : hotelRooms) {
         room.displayRoomInfo(); // Polymorphic call
     }

     System.out.println("\n--- Simulating Booking Operations ---");

     // Attempt to book SingleRoom S101
     System.out.println("\nAttempting to book S101:");
     hotelRooms.get(0).bookRoom(); // S101
     hotelRooms.get(0).displayRoomInfo();

     // Attempt to book an already booked room
     System.out.println("\nAttempting to book S101 again:");
     hotelRooms.get(0).bookRoom();

     // Attempt to book Suite 301
     System.out.println("\nAttempting to book 301:");
     hotelRooms.get(4).bookRoom(); // Suite 301 (index 4)
     hotelRooms.get(4).displayRoomInfo();

     // Cancel booking for S101
     System.out.println("\nAttempting to cancel S101:");
     hotelRooms.get(0).cancelBooking();
     hotelRooms.get(0).displayRoomInfo();

     // Cancel an unbooked room
     System.out.println("\nAttempting to cancel D201 (not booked):");
     hotelRooms.get(2).cancelBooking();

     System.out.println("\n--- Final Room Status ---");
     for (Room room : hotelRooms) {
         System.out.println("Room " + room.getRoomNumber() + " is " + room.getBookingStatus());
     }
     System.out.println("\n--- End of Hotel Booking System Report ---");
 }
}