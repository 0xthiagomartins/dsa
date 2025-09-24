# Search Algorithms

Collection of different search algorithms to find elements in arrays, each with different time and space complexities.

## Problem Statement

Given an array and a target element, find the index of the target element in the array. Return -1 if the element is not found.

## Implementations

### 1. Linear Search

```
LINEAR_SEARCH(arr, target):
    FOR i = 0 TO length(arr) - 1:
        IF arr[i] == target:
            RETURN i
    RETURN -1
```

**Characteristics:**
- Works on any array (sorted or unsorted)
- Simple and straightforward
- Checks every element sequentially

### 2. Binary Search

```
BINARY_SEARCH(arr, target):
    left = 0
    right = length(arr) - 1
    
    WHILE left <= right:
        mid = left + (right - left) / 2
        
        IF arr[mid] == target:
            RETURN mid
        ELSE IF arr[mid] < target:
            left = mid + 1
        ELSE:
            right = mid - 1
    
    RETURN -1
```

**Characteristics:**
- Requires sorted array
- Divides search space in half each iteration
- More efficient for large datasets
- Uses constant space (iterative implementation)

## Complexity Comparison

| Algorithm | Time Complexity | Space Complexity | Requirements |
|-----------|----------------|------------------|--------------|
| Linear Search | O(n) | O(1) | None |
| Binary Search | O(log n) | O(1) | Sorted array |

## When to Use Each Algorithm

### Use Linear Search when:
- ✅ Array is not sorted
- ✅ Array is small
- ✅ You need to search only once
- ✅ Simplicity is more important than performance

### Use Binary Search when:
- ✅ Array is sorted
- ✅ Array is large
- ✅ You need to perform multiple searches
- ✅ Performance is critical

## Performance Analysis

### Time Complexity Explanation

**Linear Search - O(n):**
- In the worst case, we need to check every element
- For an array of size n, we might need n comparisons

**Binary Search - O(log n):**
- Each iteration eliminates half of the remaining elements
- For an array of size n, we need at most log₂(n) comparisons
- Example: For 1000 elements, linear search might need 1000 comparisons, binary search needs at most 10

### Space Complexity Explanation

**Linear Search - O(1):**
- Uses only a constant amount of extra space (loop variable)

**Binary Search - O(1):**
- Uses only a constant amount of extra space (left, right, mid variables)

## Example Execution

```
Array: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
Target: 7

Linear Search:
- Check arr[0] = 1 ≠ 7
- Check arr[1] = 3 ≠ 7
- Check arr[2] = 5 ≠ 7
- Check arr[3] = 7 = 7 ✓
Result: 3 (4 comparisons)

Binary Search:
- left=0, right=9, mid=4, arr[4]=9 > 7
- left=0, right=3, mid=1, arr[1]=3 < 7
- left=2, right=3, mid=2, arr[2]=5 < 7
- left=3, right=3, mid=3, arr[3]=7 = 7 ✓
Result: 3 (4 comparisons)

Note: In this small example, both algorithms need the same number of comparisons,
but binary search becomes much more efficient with larger arrays.
```

## Running the Code

### Java
```bash
cd search
javac Main.java
java Main
```

### Python
```bash
cd search
python main.py
```