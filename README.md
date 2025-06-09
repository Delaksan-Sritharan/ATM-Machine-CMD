---

# Simple ATM System

This is a basic command-line ATM (Automated Teller Machine) system developed in Java. It simulates core ATM functionalities such as **checking balance**, **depositing funds**, and **wierdthdrawing cash** for a single user.

---

## Features

* **User Authentication**: Requires a valid username and PIN for access.
* **Check Balance**: Allows the user to view their current account balance.
* **Deposit**: Enables the user to add funds to their account.
* **Withdraw**: Allows the user to withdraw funds, with checks for sufficient balance.
* **Input Validation**: Handles invalid input for amounts and menu choices.

---

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You'll need a **Java Development Kit (JDK)** installed on your system. This project was developed with Java 17, but any recent JDK version should work.

---

### Installation

1.  **Clone the repository (or copy the files)**:
    Save the `User.java`, `ATM.java`, and `Main.java` files into a single directory on your local machine.

2.  **Compile the Java files**:
    Open a terminal or command prompt, navigate to the directory where you saved the files, and compile them using the Java compiler:

    ```bash
    javac User.java ATM.java Main.java
    ```

---

## How to Run

After successful compilation, you can run the ATM system from your terminal:

```bash
java Main
