/**
 * Bynary search algorithm recursive implementation
 * @param {Array} array Array where the value is searched.
 * @param {Number} value Value to be searched.
 * @param {Number} left Left boundary.
 * @param {Number} right Right boundary.
 * @returns {Number} Number index, if not found, returns - 1;
 */
const binarySearchRecursive = (array, value, left, right) => {
    if (left > right) return -1;

    const mid = left + (right - left) / 2;

    if (value === array[mid]) {
        return mid;
    } else if (value > array[mid]) {
        return binarySearchRecursive(array, value, mid + 1, right);
    } else {
        return binarySearchRecursive(array, value, left, mid - 1);
    }
}

/**
 * Bynary search algorithm iterative implementation
 * @param {Array} array Array where the value is searched.
 * @param {Number} value Value to be searched.
 * @param {Number} left Left boundary.
 * @param {Number} right Right boundary.
 * @returns {Number} Number index, if not found, returns - 1;
 */
const binarySearchIterative = (array, value, left, right) => {
    while (left <= right) {
        const mid = left + (right - left) / 2;

        if (value === array[mid]) {
            return mid;
        } else if (value > array[mid]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}

module.exports = {
    binarySearchRecursive,
    binarySearchIterative
}