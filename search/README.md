# Search Algorithms

Collection of search algorithms to find elements in arrays, organized by learning priority.

## Problem Statement

Given an array and a target element, find the index of the target element. Return -1 if not found.

## Algorithms by Learning Priority

### Foundation (Current)
1. **Linear Search** - O(n) time, O(1) space
   - **Use when**: Unsorted arrays, small datasets, one-time searches
   - **Don't use when**: Large sorted arrays, frequent searches

2. **Binary Search** - O(log n) time, O(1) space
   - **Use when**: Sorted arrays, large datasets, frequent searches
   - **Don't use when**: Unsorted arrays, small datasets

### Intermediate (Next to Learn)
3. **Jump Search** - O(√n) time, O(1) space
   - **Use when**: Large sorted arrays, limited random access
   - **Don't use when**: Small arrays, unsorted data

4. **Exponential Search** - O(log n) time, O(1) space
   - **Use when**: Unbounded arrays, very large datasets
   - **Don't use when**: Small arrays, known array size

5. **Interpolation Search** - O(log log n) average, O(n) worst case
   - **Use when**: Very large arrays, uniformly distributed data
   - **Don't use when**: Non-uniform data, small arrays

### Advanced (Later)
6. **Ternary Search** - O(log₃ n) time, O(1) space
7. **Fibonacci Search** - O(log n) time, O(1) space
8. **Hash-based Search** - O(1) average, O(n) space
9. **Tree-based Search** - O(log n) time, O(log n) space
10. **Graph Search** - O(V + E) time, O(V) space

## Current Implementations

### Linear Search
```
LINEAR_SEARCH(arr, target):
    FOR i = 0 TO length(arr) - 1:
        IF arr[i] == target:
            RETURN i
    RETURN -1
```

### Binary Search
```
BINARY_SEARCH(arr, target):
    left = 0, right = length(arr) - 1
    
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

## Complexity Comparison

| Algorithm | Best | Average | Worst | Space | Requirements |
|-----------|------|---------|-------|-------|--------------|
| Linear | Ω(1) | Θ(n) | O(n) | O(1) | None |
| Binary | Ω(1) | Θ(log n) | O(log n) | O(1) | Sorted |
| Jump | Ω(1) | Θ(√n) | O(√n) | O(1) | Sorted |
| Exponential | Ω(1) | Θ(log n) | O(log n) | O(1) | Sorted |
| Interpolation | Ω(1) | Θ(log log n) | O(n) | O(1) | Sorted, uniform |
| Hash-based | Ω(1) | Θ(1) | O(n) | O(n) | Hash table |
| Tree-based | Ω(1) | Θ(log n) | O(log n) | O(log n) | Balanced tree |
| Graph (BFS/DFS) | Ω(1) | Θ(V + E) | O(V + E) | O(V) | Graph structure |

## Key Insights

- **Interpolation Search** has the best average case (Θ(log log n)) but worst worst case (O(n))
- **Hash-based Search** has the best average case (Θ(1)) but requires O(n) space
- **Binary Search** is the most practical for general use cases
- **Linear Search** is the simplest and works on any data
