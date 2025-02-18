let name = "test"; //global variable

function hello(){
    if(true){
    let a=10;
    const b=20;
    var c=30;

    console.log('Inside if block Let', a);
    console.log('Inside if block Const', b);
    console.log('Inside if block Var', c);
}
console.log('outside if block Let', a);
 console.log('outside if block const', b);
 console.log('outside if block Var', c);
}


function myFunction(){
    let a=10;
    const b=20;
    var c=30;

    // console.log('Inside Function Let', a);
    // console.log('Inside Function Const', b);
    console.log('Inside Function Var', c);
}
myFunction()
hello()
// you can't access functional variable outside function
// console.log('Outside Function', c);
// console.log('const', c);
// console.log('Var', c);
