default: Navigating.java KadysAdventure.java Route.java Command.java
	javac Navigating.java KadysAdventure.java Route.java Command.java

run: Navigating.class KadysAdventure.java Route.class Command.java
	java Navigating

clean:
	rm -f *.class