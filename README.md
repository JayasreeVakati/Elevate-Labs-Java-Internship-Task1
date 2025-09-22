# Elevate-Labs-Java-Internship-Task1
Basic Calculator Using Methods in Java – Explanation

In this program, I created a simple calculator using the Java programming language. The calculator can perform basic arithmetic operations like addition, subtraction, multiplication, and division. I used separate methods for each operation to make the code clean and easy to manage.

How the Program Works:

Using Methods:
I created different methods for each operation:

addition()

subtraction()

multiplication()

division()

Each method takes two numbers as input and returns the result after performing the operation.

Using Static Methods:
Since the main method in Java is static, I made all the arithmetic methods static too. This allows me to call them directly without creating an object of the class.

Taking User Input:
I used the Scanner class to get input from the user. The user is asked to enter two numbers and then choose which operation they want to perform.

Switch Statement for Choices:
Based on the user's choice (1 for addition, 2 for subtraction, etc.), I used a switch statement to call the correct method and display the result.
Example:

If the user enters:

First number: 10

Second number: 5

Choice: 1 (for addition)
Then the program will display:
Addition: 15
