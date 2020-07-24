const linearSearch = require('./LinearSearch')

const array = [4, 5, 6, 7, 3, 4, 6];
const number = 3;

console.log(linearSearch.linearSearch(array, number));
console.log(linearSearch.linearSearchWithES6(array, number));