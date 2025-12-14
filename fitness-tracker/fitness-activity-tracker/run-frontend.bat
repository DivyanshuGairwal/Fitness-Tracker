@echo off
title Fitness Tracker - Frontend
color 0B
echo ====================================================
echo   Starting React Frontend (Port 5173)
echo ====================================================
echo.
cd frontend
if not exist "node_modules" (
    echo [INFO] First time run detected. Installing dependencies...
    call npm install
)
echo.
echo Launching Dev Server...
echo If the backend is not running, the App will use DEMO MODE.
echo.
call npm run dev
pause
