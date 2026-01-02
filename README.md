# RSUniversity — School Website + E-Learning Platform

RSUniversity is an integrated platform combining a school website and an online learning system.  
Built with Java Spring Boot, PostgreSQL, and React, this project is designed for educational institutions that want to digitize academic systems and public information.

---

## Key Features

### School Website (Landing Page)
- School profile: vision, mission, history
- Academic information: majors, curriculum, academic calendar
- News & announcements
- Online registration form
- Additional features will be added later

### E-Learning Platform
- Roles: Admin, Teacher, Student
- Courses & learning materials
- Quizzes & grading
- Student progress tracking
- Discussion forum
- Additional features will be added later

---

## Tech Stack

| Layer        | Stack                          |
|--------------|--------------------------------|
| Backend      | Java 21, Spring Boot 4, JPA    |
| Database     | PostgreSQL, Redis              |
| Frontend     | React (planned)                |
| Mobile       | React Native (planned)         |
| Auth         | Spring Security + JWT          |
| API Comm     | REST + OpenFeign               |
| DevOps       | Docker, Maven                  |
| Env Config   | java-dotenv (for `.env` files) |

---

## Setup & Installation

```bash
# Clone the project
git clone https://github.com/username/rsuniversity.git
cd rsuniversity

# Setup environment
cp .env.example .env
# Ensure .env matches .env.example

# Build & run backend
./mvnw clean install
./mvnw spring-boot:run
