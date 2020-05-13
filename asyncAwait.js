function delay(sec,callback){
    setTimeout(()=>{
        callback(new Date().toISOString());
    },sec+1000);
}


function delayP(sec){
    return new Promise((resolve,rej)=>{
        setTimeout(()=>{
            resolve(new Date().toISOString());
        },sec*1000)
    });
}


async function delayA(){
    await delayP(3).then((time)=>{
        console.log(time);
    });
    return 'async';
}

delayA().then((result)=>{
    console.log(result);
});
