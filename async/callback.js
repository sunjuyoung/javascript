setTimeout(()=>{
    console.log('2');
},1000);




function printDelay(print,timeout){
    setTimeout(print,timeout);
}

printDelay(()=>console.log('hi'),2000);