const reverseString = function (string) {
    let reverseStr = ''

    for (let i = string.length - 1; i > -1; i--){
        const str = string[i]

        reverseStr += str
    }

    return reverseStr
    
}

// console.log(reverseString("amit"))


const palindrome = function (str) {
    let reverseStr = ""

    for (let i = 0; i < str.length; i++){
        console.log(reverseStr)
        reverseStr = str[i] + reverseStr
    }

    if (reverseStr === str) {
        return true
    }

    return false

}

console.log(palindrome("abba"))