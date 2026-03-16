# CGPA Generator

## Overview
CGPA Generator is a desktop application built with Java and Swing that helps students calculate and track their Cumulative Grade Point Average (CGPA). The application features dedicated modules for various engineering disciplines, such as CSE, CIVIL, EEE, IPE, and ME. It utilizes an Apache Derby database for storing and managing academic records.

## Features
* **Discipline-Specific Calculations**: Tailored calculations and courses for multiple departments including:
  * Computer Science and Engineering (CSE)
  * Civil Engineering (CIVIL)
  * Electrical and Electronic Engineering (EEE)
  * Industrial and Production Engineering (IPE)
  * Mechanical Engineering (ME)
* **Semester-wise Data Entry**: Forms to input academic grades and credits for each semester individually (e.g., 1.1, 1.2, up to 4.2).
* **Database Integration**: Built-in Apache Derby database connectivity to store and securely retrieve CGPA information.
* **Graphical User Interface**: An intuitive desktop UI built with Java Swing for simple and fast interactions, featuring customized themes and backgrounds.

## Technologies Used
* **Language:** Java
* **UI Framework:** Java Swing
* **Database:** Apache Derby / JavaDB (JDBC)
* **IDE:** NetBeans
* **Build Tool:** Ant

## Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher.
* NetBeans IDE (recommended for building and running directly, as it uses NetBeans `.form` files natively).
* Apache Derby Database Server (Needs to be running on `localhost:1527`).

### Setup and Installation
1. Clone or download the repository to your local machine.
2. Open the project in NetBeans IDE.
3. Start the Java DB (Derby) server. If you are using NetBeans, this can be done from the `Services` tab.
4. Ensure the database `CGPA_info` exists with the necessary table schemas. The default credentials are user: `piyal` and password: `204204204` (You can modify this in `src/cgpa/generator/connect.java`).
5. Build and Run the project using NetBeans.

## Project Structure
* `src/cgpa/generator/`: Contains all Java source code, assets (images/gifs), and Swing `.form` GUI files.
  * Includes the data input forms and display modules (e.g., `DataInput`, `CSE_1_1`, `DisplayCSE`, etc.).
  * `connect.java` handles database connections.
* `nbproject/`: NetBeans project configuration files.
* `build.xml`: Ant build script.
