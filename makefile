Guesser: Guesser.java
	javac Guesser.java -g

run: Guesser.class
	java Guesser

debug: Guesser.class
	jdb Guesser

clean:
	rm *.class
