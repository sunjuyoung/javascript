function increase(number){
   const promise =  new Promise((resolve,reject)=>{
        setTimeout(()=>{

            const result = number + 10;
            if(result >40){
                return reject("FFFUUUCCCKK");
            }
            resolve(result);

        },2000)

    })
    return promise;
}

increase(10).then(result=>{
    console.log(result);
    return increase(result);
})
.then((result)=>{
    console.log(result);
    return increase(result);
})
