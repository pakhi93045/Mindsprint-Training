const array = [1,2,3,4,5,6,7,8,9,10];

//want to create new array by multiplying all elements using 3

const resultArray=[];
for(let num of array){
    resultArray.push(num*3);
}

console.log(resultArray);

const newArray = array.map((num) => num*3);
console.log(newArray);

const evenArray = array.filter((num)=>num%2===0);
console.log(evenArray)

//if first match found it will return that no
// if no match found then it will return undefined
const found = array.find((num)=>num===6);
console.log(found?'Found '+found: 'Not found');

// find index of match
const foundindex = array.findIndex((num)=>num===9);
console.log(foundindex?'Found at Index '+foundindex: 'Not found');


// return no of 2's in this array
const array1 = [1, 2, 3, 2, 4, 5, 2, 6, 7, 2, 8, 2];
const count = array1.filter(num => num === 2).length;

console.log('Total count of 2:', count);

result = [35, 67, 89, 65, 94];
console.log(result.every(num=>num>=35)); //this for all
console.log(result.some(num=>num>=90)); // for any one

console.log([[1,2],2,[3,4,5]].flat());


console.log(array.includes(5));
console.log("pragya pakhi" .indexOf('p'));
console.log("pragya pakhi" .lastIndexOf('p'));

const myarray=[10,20,30,40,50];
console.log(myarray.slice(2)); //starts from 2 till last
console.log(myarray.slice(2, 4)); //starts from 2 till index 4

//let's insert new element in between
// 60 between 30 and 40

myarray.splice(3,0,60); // start index, delete count, no. of elements
console.log(myarray);

myarray.splice(3,0,60,70); // start index, delete count, no. of elements
console.log(myarray);

// delete 60
myarray.splice(3,1);
console.log('after delete', myarray);

// replace 70 by 35
myarray.splice(4,1,35);
console.log('after replace', myarray);