/**
 * Linear search algorithm implementation.
 * @param {Array} array Array of numbers.
 * @param {Number} number Number to be searched.
 * @returns {Number} Number index, if not found returns -1.
 */
const linearSearch = (array, number) => {
    for (let index in array) {
        if (array[index] === number) {
            return index;
        }
    }

    return -1;
}

/**
 * Linear search algorithm implementation with ES6.
 * @param {Array} array Array of numbers.
 * @param {Number} number Number to be searched.
 * @returns {Number} Number index, if not found returns -1.
 */
const linearSearchWithES6 = (array, number) => {
    return array.findIndex(num => num === number);

    array.forEach((num, index) => { if (num === number) return index });

    return -1;
}

module.exports = {
    linearSearch,
    linearSearchWithES6
};