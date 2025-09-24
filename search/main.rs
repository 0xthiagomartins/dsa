fn linear_search(arr: &[i32], target: i32) -> i32 {
    for item in arr.iter().enumerate() {
        let (index, &value): (usize, &i32) = item;
        if value==target {
            return index as i32
        }
    }
    return -1
}

fn main() {
    let arr = [1, 2, 6, 4, 2, 1, 1, 7, 2, 3, 4, 5, 9, 0, 1, 0];
    let target = 7;
    let index = linear_search(&arr, target);
    println!("{}", index)
}