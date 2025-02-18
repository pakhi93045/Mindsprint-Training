// 1. create an array of nos and write a logic to remove duplicate numbers from an array

let numbers = [1, 2, 3, 4, 3, 2, 1, 5, 6, 7, 5];
function removeDuplicates(arr) {
    return [...new Set(arr)];
}
let uniqueNumbers = removeDuplicates(numbers);
console.log(uniqueNumbers); 


//2. create js file which takes numbers form the user and calculate the average of all numbers

const readline = require('readline');

function calculateAverage(numbers) {
    let sum = numbers.reduce((acc, num) => acc + num, 0);
    return sum / numbers.length;
}
function getNumbersFromUser(callback) {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter numbers separated by commas: ', (input) => {
        let numberArray = input.split(',')
                               .map(num => num.trim())
                               .filter(num => num !== '' && !isNaN(num))
                               .map(Number);
        rl.close();
        callback(numberArray);
    });
}
function main() {
    getNumbersFromUser((numbers) => {
        if (numbers.length > 0) {
            let average = calculateAverage(numbers);
            console.log(`The average of the entered numbers is: ${average}`);
        } else {
            console.log("No valid numbers entered.");
        }
    });
}



//3. write a function that returns the largest number from an array

function findLargestNumber(arr) {
    if (arr.length === 0) {
        throw new Error("Array is empty");
    }
    return Math.max(...arr);
}
const number = [3, 5, 7, 2, 8, 1];
const largestNumber = findLargestNumber(number);

console.log(`The largest number in the array is: ${largestNumber}`);


//4. write a function that counts the number of vowels(a,e,i,o,u) in a given string
function countVowels(str) {
    const vowels = 'aeiouAEIOU';
    let count = 0;

    for (let char of str) {
        if (vowels.includes(char)) {
            count++;
        }
    }

    return count;
}

const inputString = "Hello, how are you?";
const vowelCount = countVowels(inputString);

console.log(`The number of vowels in the string is: ${vowelCount}`);


//5. write a function that finds duplicate elements in an array
// Function to find duplicate elements in an array
function findDuplicates(arr) {
    let duplicates = [];
    let seen = new Set();

    for (let num of arr) {
        if (seen.has(num)) {
            if (!duplicates.includes(num)) {
                duplicates.push(num);
            }
        } else {
            seen.add(num);
        }
    }

    return duplicates;
}

const num = [1, 2, 3, 4, 3, 2, 1, 5, 6, 7, 5];
const duplicates = findDuplicates(num);

console.log(`Duplicate elements in the array are: ${duplicates}`);


//6. create an array of strings which contains the values like ["Mind", "SpRInT", "Pvt", "Ltd"] 
// then replace the array values with corresponding upper case values only.
// ["MIND", "SPRINT", "PVT", "LTD"]


let strings = ["Mind", "SpRInT", "Pvt", "Ltd"];

function convertToUpperCaseUsingFilter(arr) {
    return arr.filter(str => true).map(str => str.toUpperCase());
}

let upperCaseStrings = convertToUpperCaseUsingFilter(strings);
console.log(upperCaseStrings); 


// 7. write a js program which takes input from the user in string and 
// print all values and its length as well.
// sonam:5
// alex:4
// catherine:9

const prompt = require('prompt-sync')();

// Function to get input from the user
function getInputFromUser() {
    const input = prompt('Enter names separated by commas: ');
    return input.split(',').map(name => name.trim());
}

// Function to print names and their lengths using filter and map
function printNamesAndLengths(names) {
    names
        .filter(name => name !== '') // Filter out empty names
        .map(name => `${name}:${name.length}`) // Map to the desired format
        .forEach(output => console.log(output)); // Print each formatted string
}

function main() {
    const names = getInputFromUser();
    if (names.length > 0) {
        printNamesAndLengths(names);
    } else {
        console.log("No names entered.");
    }
}

main();
