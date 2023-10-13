function reverseWords(sentence) {
    // Split the sentence into an array of words
    const words = sentence.split(' ');
  
    // Reverse each word in the array
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage
  const inputSentence = "This is a sunny day";
  const outputSentence = reverseWords(inputSentence);
  
  console.log(outputSentence);
  