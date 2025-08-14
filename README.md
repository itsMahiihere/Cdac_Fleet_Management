
# Fleet Management & Car Rental System - .NET Core Backend

## 📌 Overview
This is a **web-based .NET Core 8.0 Web API** service for the Fleet Management & Car Rental System.  
It handles backend operations such as authentication, booking management, vehicle management, billing, and other core services.  
It integrates with the **React frontend** and the **Java Spring Boot microservice** for full system functionality.

---

## 🛠️ Tech Stack

### **Backend**
- **.NET 8.0 Web API**
- Entity Framework Core 8.0
- JWT Authentication
- Docker (optional)

### **Database**
- MySQL 8

---

## 🎯 Features

### **For Customers (Users)**
- User registration and login (JWT-based)
- Browse available vehicles
- Book vehicles with optional add-ons
- View booking history

### **For Staff/Admin**
- Manage vehicles, hubs/locations, and add-ons
- Process vehicle handover and return
- Generate billing for completed rentals
- Update vehicle pricing and availability

---

## 🏗️ Architecture
- Microservices-based architecture alongside Java Spring Boot service
- REST APIs for frontend communication
- JWT-based authentication and authorization
- Optional Docker containerization for deployment

---
