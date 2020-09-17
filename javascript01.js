
//쿼리 스트링을 분리하여 객체에 담는다
function parse(qs){
    var queryString = qs.substr(1);
    var chunks = qs.split('&');
    /* var result = {}; */
    
    /* 
    for(var i=0; i<chunks.length; i++){
        var parts = chunks[i].split("=");
        var key = parts[0];
        var value = parts[1];
        result[key] = value;
    }
 */

//forEach

/* 
chunks.forEach((chunk)=>{
    const parts = chunk.split('=');
    const key = parts[0];
    const value = Number.isNaN(Number(parts[1]))? parts[1]: Number(parts[1]);
    result[key] = value;

}) */

//좀더 간단히
/* 
chunks.forEach((chunk)=>{
    const [key,value]= chunk.split('=');
    result[key]= value; 
})
 */

 //map
const result = chunks.map((chunk)=>{
    const [key,value]=  chunk.split('=');
    return {key:key,value:value};

})

    return result;
}



var a = "band=10&apple=20";

console.log(a.substr(1));
console.log(a.split('&'));
var b = a.split('&');
console.log(b.length);

console.log(parse(a));

console.log(Number.isNaN('weferg'));