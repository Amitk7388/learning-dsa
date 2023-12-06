const arr1 = [1, 2, 3, 4, 5, 6, 7, 8]
const divideInto = 2

// make loop for each element
// push each element to subArr
// decrement value from number
// if number 0 then create empty array
// then push those elements to new array until number gets 0 and repeat same process
// and then push sub arr in result arr

const splitArrChunk = function (arr, number) {
    let tempArr = []
    let resultArr = []
    let tempNumber = number

    for (let i = 0; i < arr.length; i++) {
        tempNumber--
        let string = arr[i]
        tempArr.push(string)
        // console.log(tempArr)

        if (tempNumber === 0) {
            tempNumber = number
            resultArr.push(tempArr)
            tempArr = []
        }


    }
    return resultArr
}

console.log(splitArrChunk(arr1, divideInto))