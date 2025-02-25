# function to add two nos
add_numbers(){
    sum=$(( $1 + $2 ))
    echo "Sum of $1 and $2 is: $sum"
}

add_numbers 10 20

# function to check if a file exists
check_file() {
    if [ -f "$1" ]; then
       echo "File '$1' exists."
    else
       echo "File '$1' does not exists."  

    fi   

}

check_file "file1.sh"

# function to display system info

system_info(){
    echo "Operating System: $(uname -o)"
    echo "Kernel Version: $(uname -r)"
    echo "Disk Usage"
    df -h | grep '^/dev/'
}

system_info