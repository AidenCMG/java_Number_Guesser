# java_Number_Guesser

This project remakes my number guesser program using java

```
Use one class called Guesser

guess = int
correct = int
turntracker = int
keepGoing = true

main():
    call constructer

Guesser():
    while keepGoing:
        selection = menu()
        if selection = "0":
            keepGoing = false
        else if selection = "1":
            humanGuesser()
        else:
            computerGuesser()

    
menu():
    print("0) Exit")
    print("1) Human Guesser")
    print("2) Computer Guesser")

    choice = input("Choose 0-2: ")
    return choice

humanGuesser():
    this.correct = random int
    while keepGoing: 
        guess = input("Guess a number")
        if guess < correct:
            print("Too low!)
        else if guess > correct:
            print("Too high!")
        else:
            print("Correct!)
            keepGoing = false



computerGuesser():
    