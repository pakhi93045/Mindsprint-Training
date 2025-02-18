console.log(greeting('john doe'));
data(); // will throw error

function greeting(name){
    return 'Welcome '+name;
}

function print(){
    console.log('Hello World');
}

function cube(n){
    return n*n*n;
}

//function expression
const data= function(){
    console.log('data fetched successfully')
}

print();
const result = greeting('Pragya Pakhi'); //store result in variable
console.log(result);
console.log('Cube of 5', cube(5)); //call function directly in console

