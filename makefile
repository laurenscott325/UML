all: Main.java RegisterUser.java Login.java Admin.java DataPersistence.java SchoolManagementSystem.java Teacher.java Course.java MenuSystem.java User.java
	javac Main.java
	javac Admin.java
	javac DataPersistence.java
	javac SchoolManagementSystem.java
	javac Teacher.java
	javac Course.java
	javac MenuSystem.java
	javac User.java
	javac RegisterUser.java
	javac Login.java

run: all
	java Main

clean:
	rm *.class
