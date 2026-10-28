# 🎯 Number Guessing Game (Java)

## 📌 About the Project

This is a simple **Number Guessing Game** developed using Java. The computer generates a random number between 1 and 100, and the player tries to guess it within 5 attempts.

The game provides hints to help the player guess the correct number.

## ✨ Features

* 🎲 Generates a random number between 1 and 100.
* 🎯 Allows the player a maximum of 5 attempts.
* ⬆️ Displays "Too High" if the guess is greater than the random number.
* ⬇️ Displays "Too Low" if the guess is smaller than the random number.
* ✅ Displays a success message when the player guesses correctly.
* ❌ Shows the correct number if the player fails to guess it.
* 🔢 Validates input to ensure the guessed number is between 1 and 100.
* 📊 Displays the remaining attempts after each incorrect guess.
* 🚫 Invalid guesses do not consume an attempt.

## 🛠️ Technologies Used

* **Java**
* `Scanner` — for taking user input.
* `Random` — for generating a random number.
* `while` loop — for controlling the attempts.
* `if-else` statements — for checking the user's guess.
* `break` — to stop the loop when the player wins.
* `continue` — to skip invalid guesses.

## ▶️ How to Run

1. Make sure Java is installed on your computer.
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA or another Java IDE.
4. Run the `NumberGuessingGame.java` file.
5. Enter a number between 1 and 100 when prompted.
6. Try to guess the correct number within 5 attempts!

## 💻 Example Output

```text
-----Number Guessing Game-----
You have only 5 attempts
Please, enter the number between 1 and 100: 50
Too Low! Try again
Remaining attempts: 4
Please, enter the number between 1 and 100: 75
Too High! Try again
Remaining attempts: 3
Please, enter the number between 1 and 100: 65
Congratulations! Your number is correct
You won in 3 attempts!
```

*Note: The random number and results will vary each time you play.*

## 📚 What I Learned

While building this project, I practiced:

* Generating random numbers in Java.
* Taking user input using `Scanner`.
* Using `while` loops.
* Applying `if-else` conditions.
* Using `break` and `continue`.
* Validating user input.
* Counting attempts and calculating remaining attempts.
* Combining different Java concepts to build a small project.

## 👨‍💻 Author

**Zain Abid**

GitHub: [@ZainAbid-dev](https://github.com/ZainAbid-dev)

---

⭐ *This project is part of my journey to learn Java programming. More projects coming soon!*
