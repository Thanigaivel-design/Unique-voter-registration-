# Unique Voter Registration System – README

## 📌 Project Overview

The **Unique Voter Registration System** is a Java-based console application used to manage voter registrations.
It allows registering new voters, viewing all voters, searching for a voter by ID, deleting voter records, and counting total registered voters.
The system uses **MySQL** as the backend database.

---

## 🚀 Features

### ✅ 1. Register New Voter

You can enter full voter details such as:

* Voter ID
* Name
* Age
* Address
* Parent’s Name
* Gender
* Mobile Number
* Email ID
* Aadhaar
* Date of Birth
* Nationality
* District
* State
* Pincode
* Constituency
* Booth Number
* Voter Type (General/Postal/Overseas)
* Auto-generated Registration Date

All data is inserted into the MySQL database.

---

### ✅ 2. View All Registered Voters

Displays all voter details from the database using:

```
SELECT * FROM voters
```

---

### ✅ 3. Search Voter by ID

Searches the database using a voter ID and displays complete voter information.

---

### ✅ 4. Delete Voter

Deletes a voter record from the database using:

```
DELETE FROM voters WHERE voterId = ?
```

---

### ✅ 5. Count Registered Voters

Displays the total number of voters using:

```
SELECT COUNT(*) FROM voters
```

---

## 🗂️ Project File Structure

| File                             | Description                                                      |
| -------------------------------- | ---------------------------------------------------------------- |
| **Main.java**                    | Provides menu options and accepts user inputs.                   |
| **DBConnection.java**            | Handles MySQL database connection using JDBC.                    |
| **Voter.java**                   | Model class that stores all voter fields with getters.           |
| **VoterRegistrationSystem.java** | Contains all CRUD operations (Add, View, Search, Delete, Count). |
| **voters.txt**                   | Sample old file not used in MySQL version.                       |

---

## 🛢️ Database Requirements

### Database Name:

```
voterdb
```

### Create Table:

```sql
CREATE TABLE voters (
    voterId VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    address VARCHAR(200),
    fatherMotherName VARCHAR(100),
    gender VARCHAR(20),
    mobile VARCHAR(15),
    email VARCHAR(100),
    aadhaar VARCHAR(20),
    dob VARCHAR(20),
    nationality VARCHAR(50),
    district VARCHAR(50),
    state VARCHAR(50),
    pincode VARCHAR(10),
    constituency VARCHAR(100),
    boothNo VARCHAR(20),
    voterType VARCHAR(20),
    registrationDate VARCHAR(20)
);
```

---

## ⚙️ How to Run

1. Install **MySQL** and create the database + table.
2. Update your MySQL username/password inside `DBConnection.java`.
3. Compile the project:

```
javac *.java
```

4. Run the program:

```
java Main
```

---

## 📘 Technology Stack

* Java (Core Java)
* JDBC
* MySQL
* Console Based Application

---

## 📝 Conclusion

This project is a complete voter registration management system built using Java and MySQL. It performs all essential CRUD operations and provides a simple console-based interface for managing voter data effectively.
