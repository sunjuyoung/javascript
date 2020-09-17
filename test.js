const a =[5,2,8,5,99];

console.log(a[1]);


for(let i=0; i<a.length; i++){
    for(let j=1; j<a.length-i-1; j++){
        var temp = a[j];
        if(a[i]<=a[j]){
            
        }
    }
}
var num=a[0];
for(let i=0; i<a.length-1; i++){
    
    if(a[0]<a[i+1]){
        num=a[i+1]
    }

}
console.log(num);