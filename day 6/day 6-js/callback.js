let data = []
 
const fetchData = () =>{
    setTimeout(() => {
        data = [1,2,3,4,5,6,7];
        console.log("data fetched successfully");
    }, 2000)
}
const displayData= () =>{
    console.log('Display function : ', data);
}
fetchData(displayData); //passing function as argument
//which consider here callback
// displayData();