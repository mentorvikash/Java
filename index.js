// reverse the string without using any internal methord
const str = "this is my string xyz"
str.trim();
const arrayOfWords = []
let n = 1000;

let newWord = ""
for (let i = 0; i < n; i++) {
    const ch = str.charAt(i);
    if (ch == "") {
        arrayOfWords.unshift(newWord)
        let reverseWord = ""
        for (let j = 0; j < 100; j++) {
            if (arrayOfWords[j]) {
                if (reverseWord) {
                    reverseWord = reverseWord + " " + arrayOfWords[j]
                } else {
                    reverseWord = reverseWord + arrayOfWords[j]
                }

            } else {
                reverseWord.trim()
                console.log("reverse: ", reverseWord)
                break;
            }
        }
        break;
    } else if (ch == " ") {
        arrayOfWords.unshift(newWord)
        newWord = ""
    } else {
        newWord = newWord.concat(ch)
    }
}
