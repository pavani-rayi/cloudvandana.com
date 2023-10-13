// Function to perform descending sort
function descendingSort(arr) {
    return arr.sort(function(a, b) {
      return b - a;
    });
  }
  
  // Example usage
  const originalArray = [3, 6, 7, 1, 9];
  const sortedArray = descendingSort(originalArray.slice()); // Use slice to create a copy
  
  console.log("Original Array:", originalArray);
  console.log("Sorted Array (Descending):", sortedArray);
  