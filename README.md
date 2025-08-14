# Fleet Management & Car Rental System

## 📌 Overview
This is a **web-based Fleet Management and Car Rental System** developed for a Rent-a-Car service company.  
It enables customers to **browse, book, and rent vehicles** with optional add-ons, while company staff can manage bookings, vehicles, locations, and billing.

---

## 🛠️ Tech Stack

### **Frontend**
- React.js

### **Backend**
- **Java/Jakarta EE**  
  - Spring Boot 3  
  - Spring Framework 6  
  - Maven 3  
  - REST API  
  - JPA/Hibernate  
  - JWT Authentication  
  - Docker (for containerization)  
  - Microservices architecture

- **Microsoft .NET Core**  
  - .NET Core Web API 8.0  
  - Entity Framework Core 8.0  

### **Database**
- MySQL 8

---

## 🎯 Features

### **For Customers (Users)**
- Browse available vehicles
- Select **pickup** & **return** hub
- Choose optional **add-ons** (e.g., GPS, child seat)
- Make bookings and manage them
- View booking history

### **For Staff/Admin**
- Handover and return vehicles
- Generate bills for completed rentals
- Manage fleet: add/update/remove vehicles
- Manage hubs/locations
- Manage add-ons and pricing

---

## 🏗️ Architecture
- **Microservices-based** backend (Java Spring Boot & .NET Core services)
- **REST APIs** for communication between frontend & backend
- **JWT** for secure authentication & authorization
- **Docker** for easy deployment

---

## 🚀 How to Run the Project

### **Backend (Spring Boot Java Service)**
1. Clone the repository
2. Navigate to the Spring Boot project folder
3. Configure `application.properties` with MySQL credentials
4. Run:
   ```bash
   mvn spring-boot:run
