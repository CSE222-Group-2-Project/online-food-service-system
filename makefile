all:	compile

clear:
	clear

compile:
	javac -d bin Driver.java

run:
	cd bin && java Driver

clean:
	rm -r bin