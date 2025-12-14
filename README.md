# Fitness & Activity Tracker 🏃‍♂️

A full-stack fitness and activity tracking application built to understand real-world frontend–backend integration.  
The project allows users to register, log in, add workouts, and view workout history.

This repository is intended as a **learning-focused full-stack project**, demonstrating API communication, database handling, and UI state management.

---

## 🚀 Features

- User authentication (Login & Register)
- Add fitness activities with duration, calories, and date
- View workout history
- Backend status detection (online/offline)
- Demo mode fallback when backend is unavailable
- Clean and minimal dark UI

---

## 🛠 Tech Stack

### Frontend
- React (Vite)
- JavaScript
- HTML5
- CSS3
- Axios

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST APIs
- H2 / MySQL (configurable)

---

## 📂 Project Structure

fitness-activity-tracker/
│
├── backend/ # Spring Boot REST API
├── frontend/ # React frontend
├── run-backend.bat # Backend startup script
├── run-frontend.bat# Frontend startup script
└── README.md


---

## ⚙️ How to Run Locally

### 1️⃣ Start Backend
```bash
cd backend
mvn spring-boot:run


Backend runs on:-

http://localhost:8080


Start Frontend
cd frontend
npm install
npm run dev


Frontend runs on:

http://localhost:5173
