let nums1 = [4,1,2], nums2 = [1,3,4,2]
var nextGreaterElement = function (nums1, nums2) {
    
    const obj = {} // with index
    const result = []


    for (let j = 0; j < nums2.length; j++){
        key = (nums2[j]).toString()
        obj[key] = j
    }
// console.log(obj)
    for(let i = 0; i < nums1.length; i++){
        // console.log(obj[nums1[i]])
        // if(obj[nums1[i]]){
            let index  = obj[nums1[i]]
            console.log(index, nums1[i])
            if( index === (nums2.length -1)){
                result.push(-1)
            }
            else if(nums1[i] < nums2[index+1]){
                result.push(nums2[index+1])
            }
            else {
                result.push(-1)
            }
            
        // }
    }

    return result;
};
nextGreaterElement (nums1, nums2)