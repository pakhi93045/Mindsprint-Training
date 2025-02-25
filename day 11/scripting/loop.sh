## for loop
for i in {1..5}
do
    echo "Number: $i"
done

#while loop
#!/bin/sh

count=1
while [ $count -le 5 ]  # The -le operator in shell scripting stands for “less than or equal to.
do 
    echo "Iteration: $count"
    ((count++))
done

