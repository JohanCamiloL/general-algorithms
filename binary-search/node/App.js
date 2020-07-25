const binarySearch = require('./BinarySearch');
const array = [1, 3, 5, 7, 9, 11];
const value = 11;

console.log(binarySearch.binarySearchRecursive(array, value, 0, array.length));
console.log(binarySearch.binarySearchIterative(array, value, 0, array.length));