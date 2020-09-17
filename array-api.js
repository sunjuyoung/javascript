const fruits = ['a','b','c'];
const items = fruits.join(','); //Adds all the elements of an array separated by the specified separator string.

console.log(items);

const number1 = [1,2,3,4,5,6];

const b = number1.slice(2,5);

console.log(b);

const a = {title:"hi",name:"ni",age:23};


//조건에 맞는 첫번재 값 반환 
const c= number1.find((value,index)=>{
   return value>=2;
})
console.log(c);


const items1=  [
    {title:'test',name:'s'},
    {title:'test1',name:'c'},
    {title:'test2',name:'d'}
]

const result1 = items1.filter((value)=>value.name=='s');
console.log(result1);

//기존 배열 
const result2 = items1.map((value)=>{
    return value.name;
})

console.log(result2);


const result3= items1.reduce((prev,curr)=>{
    console.log('----');
    console.log(prev);
    console.log(curr);
})