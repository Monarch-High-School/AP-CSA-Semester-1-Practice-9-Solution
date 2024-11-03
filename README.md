# AP CSA Semester 1 Practice 9
In this practice assignment, you will work with arrays by accessing them and modifying them.

## MoHiArray Class
This assignment depends on a new class that contains an array as its private instance variable. There are different methods that access and possibly modify the array.

Each method is discussed below. Some have suggested algorithms.

### `min()`
This method finds the minimum value in the array. Return `Integer.MAX_VALUE` if the array length is 0.

1. Set a `m` variable to `Integer.MAX_VALUE`, which is the maximum value an integer can hold. It's like $+\infty$.

2. Check each array value against the current value of `m`. If that value is `<` than `m`, set `m` to that value.
    
3. Return `m` when done. 

### `max()`
This method finds the maximum value in the array. Return `Integer.MIN_VALUE` if the array length is 0. This works similar to `min()`

### `mean()`
This method finds the arithmetic mean of the values in the array. If the array length is 0, then return 0.

### `scale()`
This method multiples all values in the array by an integer scale value `c`.

### `inOrderAsc()`
This method determines whether all the values in the array are in ascending order. Arrays of length 0 or 1, should return `true`.

1. Iterate over the array from index 0 to length - 1.

2. Check if the value at `i` is `>` the value at `i+1`, return `false` because the ordering is not met.

3. If you successfully iterate over the entire array, return `true`.

### `inOrderDesc()`
This method determines whether all the values in the array are in descending order. Use the same logic for `inOrderAsc()` but switched for descending order.
Arrays of length 0 or 1, should return `true`.

### `trimAbove()`
This method looks at each item in the array. If it's above a certain value, it replaces it with another value.
For example, in the array: `{0, 1, 2, 3, 4, 5, 6, 7, 8}` if the `trimTheshold` is 5 and the `trimValue` is 5. The array would look like: `{0, 1, 2, 3, 4, 5, 5, 5, 5}`

### `clamp()`
This method looks at each item in the array. If the value is less than a lower value, it is replaced with that lower value. If it is greater than an upper value, it is replaced with that upper value. For example, in the array: `{0, 1, 2, 3, 4, 5, 6, 7, 8}` if the lower value is 2 and the upper value is 6, the arrya would be: `{2, 2, 2, 3, 4, 5, 6, 6, 6}`
