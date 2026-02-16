Smart Expense Tracker

A backend REST API built with Spring Boot and MySQL to manage and analyze daily expenses.
This project demonstrates real-world backend architecture, database integration, and clean API design suitable for portfolio and interview showcase.

Features

Add new expense records

Fetch all stored expenses

Structured layered architecture (Controller → Service → Repository → Model)

MySQL database integration using Spring Data JPA

Clean RESTful API design

Ready for future upgrades like JWT authentication and analytics dashboard

Tech Stack

Java

Spring Boot

Spring Data JPA

MySQL

Maven

Lombok

Project Structure
smart-expense-tracker
 ┣ src/main/java/com/expense/tracker
 ┃ ┣ controller
 ┃ ┣ service
 ┃ ┣ repository
 ┃ ┣ model
 ┃ ┗ SmartExpenseTrackerApplication.java
 ┣ src/main/resources
 ┃ ┗ application.properties
 ┗ pom.xml

API Endpoints
Add Expense

POST /api/expenses

Request body example:

{
  "title": "Lunch",
  "amount": 120,
  "category": "Food",
  "date": "2026-02-16"
}

Get All Expenses

GET /api/expenses

Returns list of all stored expenses.

Database Setup

Create database in MySQL:

CREATE DATABASE expense_db;


Update credentials in:

src/main/resources/application.properties

Run Locally

Make sure Java, Maven, and MySQL are installed.

Run command:

mvn spring-boot:run


Server starts at:

http://localhost:8080

Future Improvements

JWT authentication and user login

Expense filtering by date/category

Monthly analytics and charts

React frontend dashboard

Docker deployment

Author

Avadhoot Welde
Aspiring Full-Stack Developer focused on Java, Spring Boot, and modern web technologies.
