def linear_search(arr: list[int], target: int) -> int:
    """
    Linear Search - Sequential search through array
    Time Complexity: O(n)
    Space Complexity: O(1)
    """
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1  # Target not found


def binary_search_iterative(arr: list[int], target: int) -> int:
    """
    Binary Search - Iterative Implementation
    Time Complexity: O(log n)
    Space Complexity: O(1)
    """
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = left + (right - left) // 2  # Prevents overflow
        
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return -1  # Target not found




def main():
    # Test array (must be sorted for binary search)
    arr = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    target = 7
    
    print(f"Array: {arr}")
    print(f"Target: {target}")
    print()
    
    # Test linear search
    result_linear = linear_search(arr, target)
    print("Linear Search:")
    print(f"Result: {result_linear}")
    if result_linear != -1:
        print(f"Element found at index: {result_linear}")
    else:
        print("Element not found")
    print()
    
    # Test binary search
    result_binary = binary_search_iterative(arr, target)
    print("Binary Search:")
    print(f"Result: {result_binary}")
    if result_binary != -1:
        print(f"Element found at index: {result_binary}")
    else:
        print("Element not found")
    print()
    
    # Test with element not in array
    not_found = linear_search(arr, 4)
    print(f"Searching for 4 (not in array): {not_found}")


if __name__ == "__main__":
    main()
