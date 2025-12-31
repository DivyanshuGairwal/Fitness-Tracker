# Fitness & Activity Tracker 🏃‍♂️

A full-stack fitness and activity tracking application built to understand real-world frontend–backend integration.  
The project allows users to register, log in, add workouts, and view workout history.

This repository is intended as a **learning-focused full-stack project**, demonstrating API communication, database handling, and UI state management. 


## 🚀 Features

- User authentication (Login & Register)
- Add fitness activities with duration, calories, and date
- View workout history
- Backend status detection (online/offline)
- Demo mode fallback when backend is unavailable
- Clean and minimal dark UI


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

## 📂 Project Structure

fitness-activity-tracker/
│
├── backend/ # Spring Boot REST API
├── frontend/ # React frontend
├── run-backend.bat # Backend startup script
├── run-frontend.bat# Frontend startup script
└── README.md


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





🧪 Demo Mode

If the backend is not running, the app automatically switches to Demo Mode:

Allows UI interaction

Uses temporary in-memory data

Displays backend status clearly

This helps showcase frontend functionality even without a live backend.

📌 Notes

This project is built for learning and portfolio purposes

Focuses on understanding full-stack flow, not production deployment

Authentication is simplified (no JWT/security hardening)

Can be extended with:

JWT authentication

Cloud database

Deployment (Render / Railway)

👤 Author

Divyanshu Gairwal
GitHub: https://github.com/DivyanshuGairwal

⭐ Acknowledgements

Built as part of personal learning to understand how real-world full-stack applications are structured and connected.


### What to do now (final steps)

1. Open `README.md`
2. Replace everything with the above
3. Save
4. Commit & push

```bash
git add README.md
git commit -m "Add complete project README"
git push
