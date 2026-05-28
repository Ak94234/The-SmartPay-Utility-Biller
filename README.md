SmartPay Utility Bill Generator

A simple Core Java console-based application that generates electricity/water utility bills using 
progressive slab rates.

This project demonstrates concepts of:
• Interfaces in Java
• OOP principles
• Input validation
• Exception handling
• Loops
• Console-based receipt generation

Problem Statement
A municipality wants to digitize electricity and water billing.
The application should:
• Calculate bills based on units consumed
• Apply slab-wise pricing
• Validate meter readings
• Generate a digital receipt
• Support multiple customer entries until the user exits


Features
1 Progressive slab billing system
 2 Interface implementation ( Billable )
 3 Input validation for meter readings
 4 Exception handling for invalid input
 5 Multiple customer billing support using loops
 6 Console-based digital receipt generation

 
Technologies Used
• Java
• OOP Concepts
• Scanner Class
• Exception Handling

1
Project Structure
SmartPay/
│── Smartpay.java
│── README.md

Billing Slab Logic
Units Consumed Rate Per Unit
0 – 100 ₹1
101 – 300 ₹2
Above 300 ₹5

Interface Used

interface Billable {
double calculateTotal();
}
The bill_genrator class implements the Billable interface and defines the bill calculation logic.

Input Validation

The program checks:
Previous meter reading cannot be greater than current reading
Invalid numeric input is handled using exception handling

Example:
Previous Reading Cannot Be Greater Than Current Reading


Sample Output

Please Enter Consumer Name ( Or Enter Exit To Quit The Application) :
Ayush
Please Enter Current Units :
450
Please Enter Previous Units :
100
====== SMARTPAY RECEIPT ======
Customer Name : Ayush
Units Consumed : 350.0
Tax Amount : Included in slab rates
Final Amount : ₹750.0


How to Run
Step 1: Compile the Program
javac Smartpay.java
Step 2: Run the Program
java Smartpay

Concepts Covered
• Java Interfaces
• Constructors
• Encapsulation
• Exception Handling
• Loops
• Conditional Statements
• User Input Handling
• Console Formatting


Future Improvements
• GUI version using Swing/JavaFX
• Database connectivity
• PDF bill generation
• GST/Tax calculation
• Save customer history
Author
Ayush Kumar
4
