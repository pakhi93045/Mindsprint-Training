echo "Hello from bash"

name="pragya pakhi"
echo "Hello $name"

salary=9000
echo "Salary $salary"
echo "salary $((salary*20))"

num1=10
num2=20

echo "Sum $((num1+num2))"


# arrays

numbers=(10 20 30 40 50 60)
echo "First Number ${numbers[0]}"
echo "Fourth Number ${numbers[3]}"


names=("alex" "bob" "catty" "devid")
echo "First Name: ${names[0]}"

names=("alex" "bob" "catty" "devid")
echo "Second Name: ${names[1]}"


# environment variables
#inherited by script from Parent Shell

echo "Current User: $USER"
echo "Home Directory: $HOME"

# create constant variables
readonly PI=3.14
echo "value of pi: $PI" 

# IF ELSE
echo "Enter a number: "
read num

if [ $num -gt 10 ]; then
    echo "The number is greater than 10"
else
    echo "The number is 10 or less"
fi

# and or or operator


echo "Enter your age"
read age
echo "Are you Indian"
read citizen

if [ $age -ge 18 ] && { [ "$citizen" = "yes" ] || [ "$citizen" = "YES" ]; }; then  # -ge means greater than
    echo "You are eligible to vote"
else
    echo "You are not eligible to vote"
fi

# we have to end if using fi



