@echo off
title Fitness Tracker - Backend
color 0A
echo ====================================================
echo   Starting Spring Boot Backend (Port 8080)
echo ====================================================
echo.
cd backend
echo Running 'mvn spring-boot:run'...
call mvn spring-boot:run
if %ERRORLEVEL% NEQ 0 (
    color 0C
    echo.
    echo [ERROR] Backend failed to start.
    echo Check if Port 8080 is free or if MySQL is running.
    pause
    exit /b
)
pause
