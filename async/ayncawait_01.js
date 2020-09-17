function a(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(new Date().toISOString());
        },2000);
       
    });
  
}

async function b(){
  const result  = await a().then((time)=>{
      return 'x';
  });
  console.log(result);
    return 'hi 2';
}



b().then((result)=>{
    console.log(result);
})

