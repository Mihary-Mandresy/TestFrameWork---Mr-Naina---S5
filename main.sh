find src -name "*.java" > sources.txt
javac -parameters -cp "lib/*" -d bin @sources.txt
java -cp "bin:lib/*" app.App