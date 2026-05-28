# SmartPay Utility Bill Generator

SmartPay Utility Bill Generator is a simple Core Java console based application that generates electricity and water utility bills using a progressive slab billing system.

This project demonstrates the implementation of Object Oriented Programming concepts, interfaces, exception handling, loops, and input validation in Java.

## Problem Statement

A municipality wants to digitize electricity and water billing. The application should:

Calculate bills based on units consumed

Apply slab wise pricing

Validate meter readings

Generate a digital receipt

Support multiple customer entries until the user exits

## Features

Progressive slab billing system

Interface implementation using Billable interface

Input validation for meter readings

Exception handling for invalid inputs

Multiple customer billing support using loops

Console based digital receipt generation

## Technologies Used

Java

Object Oriented Programming Concepts

Scanner Class

Exception Handling

## Project Structure

SmartPay

Smartpay.java

README.md

## Billing Slab Logic

0 to 100 Units  Rate per unit is 1 Rupee

101 to 300 Units  Rate per unit is 2 Rupees

Above 300 Units  Rate per unit is 5 Rupees

## Interface Used

```java
interface Billable {
    double calculateTotal();
}
```

The BillGenerator class implements the Billable interface and defines the bill calculation logic.

## Input Validation

The program validates the following conditions:

Previous meter reading cannot be greater than current meter reading

Invalid numeric inputs are handled using exception handling

## Sample Output

```text
Please Enter Consumer Name Or Enter Exit To Quit The Application : Ayush

Please Enter Current Units : 450

Please Enter Previous Units : 100

====== SMARTPAY RECEIPT ======

Customer Name : Ayush

Units Consumed : 350.0

Tax Amount : Included in slab rates

Final Amount : 750.0 Rupees
```

## How To Run

Step 1 Compile the Program

```bash
javac Smartpay.java
```

Step 2 Run the Program

```bash
java Smartpay
```

## Concepts Covered

Java Interfaces

Constructors

Encapsulation

Exception Handling

Loops

Conditional Statements

User Input Handling

Console Formatting

## Future Improvements

GUI version using Swing or JavaFX

Database connectivity

PDF bill generation

GST and Tax calculation

Customer billing history management

## Author

Ayush Kumar
