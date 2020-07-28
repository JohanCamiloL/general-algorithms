def linearSearch(array, value):
    """
    Linear search algorithm implementation.

    Parameters
    ----------
    array: list
        List of elements where search will be made.
    value: int
        Value to be searched.

    Return
    ------
    int
        Element index on array, if not found returns -1.
    """
    for i in range(len(array)):
        if array[i] == value:
            return i

    return -1


array = [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
value = 5
print(linearSearch(array, value))
