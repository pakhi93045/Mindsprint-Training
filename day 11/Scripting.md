# Scripting 

## Basic Commands

1. **Create a file:**
   ```sh
   touch file1.sh
   ```
   This command creates a file named `file1.sh`.

2. **Run a script:**
   ```sh
   sh file1.sh
   ```
   This command runs the `file1.sh` script and prints its output.

3. **Clear the terminal:**
   ```sh
   clear
   ```
   Use this command to clear the terminal screen.

4. **Mathematical calculations:**
   To perform mathematical calculations, put the formula in brackets:
   ```sh
   result=$((2 + 3))
   echo $result
   ```

5. **Run a script with arguments:**
   ```sh
   sh file2.sh test true hello
   ```
   This command runs the `file2.sh` script with three arguments: `test`, `true`, and `hello`.

## Additional Tips

6. **Make a script executable:**
   ```sh
   chmod +x file1.sh
   ```
   This command makes the `file1.sh` script executable, allowing you to run it with `./file1.sh`.

7. **Shebang:**
   Add a shebang (`#!/bin/bash`) at the top of your script to specify the interpreter:
   ```sh
   #!/bin/bash
   echo "Hello, World!"
   ```

8. **Comments:**
   Use comments to explain your code:
   ```sh
   # This is a comment
   echo "This will be printed"
   ```

9. **Variables:**
   Assign values to variables and use them in your script:
   ```sh
   name="John"
   echo "Hello, $name"
   ```

10. **Conditional statements:**
    Use `if` statements to perform conditional operations:
    ```sh
    if [ "$name" == "John" ]; then
      echo "Welcome, John!"
    else
      echo "Who are you?"
    fi
    ```

11. **Loops:**
    Use loops to repeat commands:
    ```sh
    for i in {1..5}; do
      echo "Iteration $i"
    done
    ```

12. **Functions:**
    Define and use functions to organize your code:
    ```sh
    greet() {
      echo "Hello, $1"
    }
    greet "Alice"
    ```

