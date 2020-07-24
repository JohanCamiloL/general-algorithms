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

module.exports = { linearSearch };