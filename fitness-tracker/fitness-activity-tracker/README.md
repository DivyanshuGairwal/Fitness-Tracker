# Fitness & Activity Tracker (Full-Stack)

A professional full-stack web application designed to track fitness activities. This project demonstrates a production-grade architecture using **Spring Boot** (Backend) and **React** (Frontend), robust enough for real-world usage but simple enough for learning.

**🔗 Key Features:**
*   **Full-Stack Integration**: Seamless communication between Java backend and React frontend.
*   **Resilient Architecture**: Frontend runs in **"Demo Mode"** if the backend is offline.
*   **RESTful APIs**: Clean endpoints for Auth and Workouts.
*   **Data Persistence**: MySQL database integration.

---

---

## 🗄️ Database Schema
The app automatically creates tables, but here is the structure for reference:
```sql
CREATE DATABASE fitness_db;
use fitness_db;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255)
);

CREATE TABLE workouts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    type VARCHAR(255),
    duration DOUBLE,
    calories_burned DOUBLE,
    date DATE,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
```

---

## 🛠 Tech Stack

### Frontend (User Interface)
*   **React (Vite)**: Modern, fast web framework.
*   **Axios**: For API communication.
*   **React Router**: For client-side navigation.
*   **Port**: `http://localhost:5173`

### Backend (Server Logic)
*   **Java Spring Boot**: Robust enterprise-grade framework.
*   **Maven**: Dependency management.
*   **Spring Data JPA**: Hibernate-based ORM.
*   **H2 Database**: In-memory database (Default).
*   **MySQL**: Optional production database.
*   **Port**: `http://localhost:8080` (CORS configured for any localhost port).

---

## 🚀 How to Run (Beginner Guide)

You can run each part independently.

### 1️⃣ Run Frontend (Website)
Double-click `run-frontend.bat`
*   Starts the React app on **http://localhost:5173**.
*   **Note**: If the backend is OFF, the app will auto-switch to **Demo Mode** (using mock data). This prevents the app from breaking.

### 2️⃣ Run Backend (Server)
Double-click `run-backend.bat`
*   Starts the Spring Boot server on **http://localhost:8080**.
*   **Database**: Uses **H2 (In-Memory)** by default. No installation needed.
    *   *Note*: Data resets when you restart the server in H2 mode.
    *   *Optional*: To use MySQL, edit `backend/src/main/resources/application.properties` and uncomment the MySQL section.

---

## 🔌 API Endpoints (Test via Postman)

Even without the frontend, you can test the backend logic:

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/auth/register` | Register a new user (`{ "email": "a@a.com", "password": "123", "name": "Test" }`) |
| `POST` | `/api/auth/login` | Login user (`{ "email": "a@a.com", "password": "123" }`) |
| `POST` | `/api/workouts` | Add workout (`{ "user": {"id": 1}, "type": "Run", "duration": 30, "date": "2023-12-01" }`) |
| `GET` | `/api/workouts/{id}` | Get history for user ID. |

---

## 📂 Project Structure

```text
fitness-activity-tracker/
├── backend/            # Java Spring Boot Server
├── frontend/           # React Web Application
├── run-backend.bat     # One-click start script for Server
├── run-frontend.bat    # One-click start script for UI
└── README.md           # This file
```

---

*Project created for GitHub Portfolio & Learning.*
