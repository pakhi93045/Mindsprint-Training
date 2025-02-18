const array = []; 
const arr1 = [1, 2, 3, 4, 5, 6, 7];
const arr2 = new Array(4);

console.log(array.length); // 0
console.log(arr1.length); // 7
console.log(arr2.length); // 4

array.push(10); 
array.push(20); 
array.push(30); // push element at last index

console.log('After Push', array);
array.unshift(5);
array.unshift(2); // add element at first index

console.log('After Unshift', array);
console.log(array.pop()); // remove last element

console.log('After Pop', array);
console.log(array.shift()); // remove first element

console.log('After Shift', array);
