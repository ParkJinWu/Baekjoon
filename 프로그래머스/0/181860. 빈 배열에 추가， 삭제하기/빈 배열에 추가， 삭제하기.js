function solution(arr, flag) {
    var a = [];
    for(i = 0 ; i< arr.length ; i++){
        if(flag[i])
        {
          a.push(...Array(arr[i]*2).fill(arr[i]));
        } 
        else
        {
          a.splice(a.length-arr[i],arr[i]);  
        }
        
    }
   
    return a;
}