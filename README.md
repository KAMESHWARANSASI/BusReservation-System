# 🚌 Bus Reservation System – Java Console App

A simple and interactive **Bus Reservation System** built using **Core Java**, **OOP concepts**, and **Java Collections**. This project allows users to view buses, book seats, and see existing bookings — all via a console-based menu.

---

## ✨ Features

- View available buses with details
- Book a seat by entering passenger name, bus number, and date
- Prevents overbooking based on capacity
- View all bookings by date
- Uses `ArrayList` for in-memory data management

---

## 🧱 Technologies Used

- Java 17+ (or Java 8+)
- Object-Oriented Programming
- Collections (`ArrayList`)
- Console-based input/output (`Scanner`, `System.out`)
- Java Time API (`LocalDate`)

---

## 🧩 Class Structure

### `Bus`
- `int busNo`
- `boolean ac`
- `int capacity`

### `Booking`
- `String passengerName`
- `int busNo`
- `LocalDate date`

### `BusReservationSystem` (Main Class)
- Menu system
- Handles user input, booking logic, and output

---

## 📦 How to Run

1. Clone or copy the code into `BusReservationSystem.java`
2. Compile:
   bash
   javac BusReservationSystem.java
   
---

🖥️ Sample Menu

===== Bus Reservation System =====
1. Book a Bus
2. View All Bookings
3. View Available Buses
4. Exit

---
🔍 Sample Booking

Enter passenger name: Ramesh
Enter bus number: 101
Enter booking date (YYYY-MM-DD): 2025-08-15
✅ Booking confirmed for Ramesh

---
📌 Future Enhancements
Cancel bookings

Save/load bookings to file using serialization

Filter bookings by date or passenger

GUI version with Swing or JavaFX

👨‍💻 Author
Kameshwaran Sasi

GitHub: @kameshwaransasi
