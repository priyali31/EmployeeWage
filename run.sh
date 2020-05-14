#! /bin/bash/

for file in `find ./ -type f -name "*.class"`
do
	echo $file
done

java -classpath ./classes/ com/empwage/$1
