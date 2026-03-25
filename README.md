# 🚗 Vehicle Rental System

A **Vehicle Rental System** built using **Java and Object-Oriented Programming principles**, currently implemented as a **console-based application**, with a roadmap to evolve into a **full-stack application with UI and database integration**.

---

## 📌 Project Vision

This project simulates a **real-world vehicle rental platform** with scalability in mind.
The current version uses a **CLI (Command Line Interface)** and **file-based storage**, and is designed to be extended into:

* 🌐 Web / GUI-based application
* 🗄️ Database-driven system (PostgreSQL)
* 🔐 Secure authentication
* 💳 Payment-enabled platform

---

## ✨ Current Features (CLI Version)

### 👨‍💼 Admin

* Add new vehicles
* View all vehicles

### 👤 User

* Register account
* Login
* View available vehicles
* Book a vehicle

---

## 🚧 Upcoming Features

* Cancel booking functionality
* Booking history per user
* Vehicle search & filters
* Improved validation & error handling
* Admin analytics dashboard

---

## 🧱 Project Structure

```bash
DriveEasy/
│
├── model/
├── service/
├── util/
├── main/
└── data/
```

---

## ⚙️ Tech Stack (Current)

* Java (Core Java)
* Object-Oriented Programming (OOP)
* File Handling (Serialization)
* Collections (ArrayList)

---

## 🧠 System Design

### 🔹 Models

* **User** → stores user details
* **Vehicle** → stores vehicle info & availability
* **Booking** → stores rental information

---

### 🔹 Services

* **UserService** → handles registration & login
* **VehicleService** → manages vehicles
* **BookingService** → handles booking creation

---

### 🔹 Utility

* **FileUtil** → handles file read/write using serialization

---

## 🔄 Application Flow

### Admin

```text
1. Add Vehicle
2. View Vehicles
3. Exit
```

### User

```text
1. Register
2. Login
3. View Vehicles
4. Book Vehicle
5. Exit
```

---

## 💾 Data Storage (Current)

Data is stored locally using `.dat` files:

* `users.dat`
* `vehicles.dat`
* `bookings.dat`

> ⚠️ Note: This will be replaced with a database in future versions.

---

## 🚀 Future Roadmap

* 🎨 GUI (JavaFX / Web UI)
* 🗄️ Database integration (PostgreSQL)
* 🔐 Secure authentication system
* 🔄 Booking cancellation feature
* 📊 Admin dashboard
* 💳 Payment integration

---

## 🚀 Getting Started

### 🔧 Prerequisites

* Java JDK 8+
* Git

---

### 📥 Clone the Repository

```bash
git clone https://github.com/arpansinha7/DriveEasy.git
cd DriveEasy
```

---

### ▶️ Compile

```bash
javac main/*.java service/*.java model/*.java util/*.java
```

---

### ▶️ Run

#### Admin Panel

```bash
java main.Admin
```

#### User Panel

```bash
java main.UserMain
```

---

## 🤝 Contributing

Contributions are welcome! 🚀

### Steps:

1. Fork the repository

2. Clone your fork

```bash
git clone https://github.com/arpansinha7/DriveEasy.git
```

3. Create a branch

```bash
git checkout -b feature/your-feature
```

4. Make changes & commit

```bash
git commit -m "Added: feature description"
```

5. Push changes

```bash
git push origin feature/your-feature
```

6. Open Pull Request

---

## 💡 Contribution Ideas

* Implement booking cancellation
* Add search/filter feature
* Improve UI/UX (CLI → GUI/Web)
* Integrate database
* Refactor code

---

## 📚 Learning Outcomes

* OOP in real-world systems
* File handling & persistence
* Clean architecture (Model-Service separation)
* Building scalable applications

---

## 📜 License

GPL-3.0 License

---

## 👨‍💻 Author

**Arpan Sinha**
