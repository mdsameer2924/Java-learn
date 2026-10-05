# The TerminalMart E-Commerce Backend.
It runs entirely in the console (using Scanner for input) and forces you to use every single OOP concept you just learned.
The Architecture Requirements
1. **The Foundation (Encapsulation & The Object Class)**
- Create a Product class.
- Make the fields name, price, and stockQuantity private (Encapsulation).
- Create getter and setter methods to access them.
- Override the toString() method to print the product nicely: "[Laptop] - $999.00 (In Stock: 5)".
2. **The Shared State (Static & Final)**
- Create a Store class to manage the system.
- Give it a public static final String STORE_NAME = "TerminalMart";
- Give it a private static double totalRevenue = 0.0;
- Create a static method addRevenue(double amount) that updates the total.
3. **The Users (Abstraction, Inheritance, Polymorphism)**
- Create an abstract class called User. Give it a protected string username and a constructor.
- Give User an abstract method called showDashboard().
- Create two child classes: Admin and Customer that inherit from User.
- Polymorphism: Override showDashboard() differently for both.
  - The Admin dashboard should print the Store.totalRevenue.
  - The Customer dashboard should show a welcome message and their shopping options.
4. **The Shopping Logic (Aggregation - Weak Composition)**
- Create a Cart class.
- It should have an array (or just a simple variable if you want to keep it to 1 item for now) to hold a Product.
- Write a method addToCart(Product p). This is Aggregation because the Product is built outside in the store and passed into the cart.
5. **The Checkout (Strict Composition - Strong Composition)**
- Create a Receipt class. Give it a final String transactionId (you can just pass a random string or use java.util.UUID.randomUUID().toString()).
- Create an Order class.
- Strict Composition Rule: The Order constructor must take the Cart details and create the Receipt object internally (this.receipt = new Receipt(...)).
- When the Order is processed, it should call Store.addRevenue().
How the Console Should Flow
When you run public static void main, it should look something like this in your terminal:
Plaintext
``` bash
Welcome to TerminalMart!
Are you logging in as: (1) Admin (2) Customer?
> 2
Enter your username:
> Sameer

--- Customer Dashboard ---
Hello Sameer!
1. View Products
2. Add to Cart
3. Checkout
> 1
1. [MacBook Air] - $999.0 (In Stock: 5)
2. [Mechanical Keyboard] - $80.0 (In Stock: 10)

keep all of this inot markdown code block
``` 
>**That's how it's must look in terminal**