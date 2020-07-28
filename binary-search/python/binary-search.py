def binarySearchRecursive(array, value, left, right):
    """
    Binary search algorithm recursive implementation.

    Parameters
    ----------
    array: list
        Contains the elements where the search will be performed.
    value: int
        Number to be searched.
    left: int
        Left boundary where search will start.
    right: int
        Right boundary where search will stop, it's exclusive.

    Returns
    -------
    int
        Element index, if not in array, returns -1.

    """
    if (left > right):
        return -1

    mid = int(left + (right - left) / 2)

    if array[mid] == value:
        return mid
    elif array[mid] > value:
        return binarySearchRecursive(array, value, left, mid - 1)
    else:
        return binarySearchRecursive(array, value, mid + 1, right)


def binarySearchIterative(array, value, left, right):
    """
    Binary search algorithm iterative implementation.

    Parameters
    ----------
    array: list
        Contains the elements where the search will be performed.
    value: int
        Number to be searched.
    left: int
        Left boundary where search will start.
    right: int
        Right boundary where search will stop, it's exclusive.

    Returns
    -------
    int
        Element index, if not in array, returns -1.

    """

    while(left <= right):
        mid = int(left + (right - left) / 2)

        if array[mid] == value:
            return mid
        elif array[mid] > value:
            right = mid - 1
        else:
            left = mid + 1

    return -1


array = [1, 3, 5, 7, 9, 11, 13, 15]
value = 9

print(binarySearchRecursive(array, value, 0, len(array) - 1))
print(binarySearchIterative(array, value, 0, len(array) - 1))
