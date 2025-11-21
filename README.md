# quadratic-roots-finder
A simple Java program that calculates the roots of a quadratic equation using the quadratic formula.
# Quadratic Equation Solver (Java)

This is a simple Java program that solves quadratic equations of the form:

\[
ax^2 + bx + c = 0
\]

The program takes input values for **a**, **b**, and **c**, calculates the discriminant, and prints the roots depending on their nature (real & distinct, real & equal, or imaginary).

---

## 📌 Features
- Calculates the discriminant: **d = b² - 4ac**
- Handles all three cases:
  - Real & distinct roots
  - Real & equal roots
  - Imaginary roots
- Clean and simple code, beginner-friendly

---

## 🧮 Formula Used
The quadratic formula:

\[
x = \frac{-b \pm \sqrt{d}}{2a}
\]

Where:  
- **a**, **b**, **c** = user inputs  
- **d** = discriminant *(b² - 4ac)*  

---

## 🏃 How to Run

### **1. Compile**
```bash
javac index.java
