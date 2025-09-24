/**
 * Linear Search - Sequential search through array
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
function linearSearch(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return i;
        }
    }
    return -1; // Target not found
}

/**
 * Binary Search - Iterative Implementation
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
function binarySearch(arr, target) {
    let left = 0;
    let right = arr.length - 1;
    
    while (left <= right) {
        const mid = Math.floor(left + (right - left) / 2); // Prevents overflow
        
        if (arr[mid] === target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return -1; // Target not found
}

function main() {
    // Test array (must be sorted for binary search)
    const arr = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19];
    const target = 7;
    
    console.log(`Array: [${arr.join(', ')}]`);
    console.log(`Target: ${target}`);
    console.log();
    
    // Test linear search
    const resultLinear = linearSearch(arr, target);
    console.log("Linear Search:");
    console.log(`Result: ${resultLinear}`);
    if (resultLinear !== -1) {
        console.log(`Element found at index: ${resultLinear}`);
    } else {
        console.log("Element not found");
    }
    console.log();
    
    // Test binary search
    const resultBinary = binarySearch(arr, target);
    console.log("Binary Search:");
    console.log(`Result: ${resultBinary}`);
    if (resultBinary !== -1) {
        console.log(`Element found at index: ${resultBinary}`);
    } else {
        console.log("Element not found");
    }
    console.log();
    
    // Test with element not in array
    const notFound = linearSearch(arr, 4);
    console.log(`Searching for 4 (not in array): ${notFound}`);
}

// Run the main function
main();
