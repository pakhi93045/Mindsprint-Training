const person={
    firstName:"John",
    lastName:"Doe",
    email:"john@gmail.com",
    age:45,
    address:{
        street:"XYZ",
        city:"New York",
        zipcode:544854,
        country:"US"
    },
    greeting: function(){
       // console.log('Welcome '+this.firstName+" "+this.lastName)
        console.log(`Welcome ${this.firstName} ${this.lastName}`)
    }

}

console.log("Address", person.address);
person.greeting()
console.log(person['email']);


// to iterate here we'll use for-in loop
for(let key in person){
    console.log(person[key]);
}

