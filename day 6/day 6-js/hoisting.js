console.log(a); //undefined
var a = 20;
console.log(a);

// console.log(b); //hoisting is not possible
// let b = 20;
// console.log(b);

//if you want to use for callback you can use annonymous function
const test=function(){
    console.log('test triggered');
}

// for debugging, for recursion, use named function
const myFunction=function test(){
    console.log('test triggered');
}