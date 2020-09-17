

function a (sec,callback){
   setTimeout(()=>{
    callback(new Date().toISOString());
   },sec*1000)
}


//가독성 쉣
/* a(1,(result)=>{
    console.log(1,result);
    a(1,(result)=>{
        
        a(1,(result)=>{
            console.log(3,result);
        })
        console.log(2,result);  
        
    })
})
 */

function delayP(sec){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(new Date().toISOString());
        },sec*1000);
    });
}


/* delayP(1).then((result)=>{
    console.log(result);
    return delayP(1);
}).then((result)=>{
    console.log(2,result);
    return delayP(1);
}).then((result)=>{
    console.log(3,result);
}).catch((err)=>{
    console.log(err);
}).finally(()=>{
    console.log("wow");
})

 */



function sun(sec){
   return new Promise((resolve,reject)=>{
       setTimeout(()=>{
           resolve("hi yo"+sec);
       },sec*1000);
   })
   
}

sun(2).then((result)=>{
    console.log(result);
    return sun(1);
}).then((result)=>{
    console.log(result);
})
/* 

const promise = new Promise((resolve,reject)=>{
   resolve( console.log("1:hi"));
  
   return "2:hi";
}).then((result)=>{
    console.log(result);
})





promise.then((result)=>{
    console.log(result);
    
}).catch((error)=>{
    console.log(error);
})

 */