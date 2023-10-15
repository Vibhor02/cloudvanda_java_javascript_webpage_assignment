// Prompt the user for input as a comma-separated string
const userInput = prompt("Enter a list of numbers separated by commas:");

// Split the user input into an array
const inputArray = userInput.split(",").map(Number);

// Check if the input is valid (an array of numbers)
if (Array.isArray(inputArray) && inputArray.every(number => !isNaN(number))) {
  // Sorting the array in descending order
  const descendingArray = inputArray.sort((a, b) => b - a);
  console.log("Sorted Array (Descending Order):", descendingArray);
} else {
  console.log("Invalid input. Please enter a list of numbers separated by commas.");
}
