package problems
/**
 * Rotates a given integer array to the right by [k] steps, in-place.
 *
 * ## Approach: Index Mapping with a Temporary Array
 * Instead of shifting elements one step at a time, we calculate each element's
 * final position directly using the formula `(i + steps) % nums.size`.
 * This works like a circular array — when an element moves past the last index
 * it wraps back around to the beginning.
 *
 * ## Example
 * ```
 * Input:  [1, 2, 3, 4, 5, 6, 7],  k = 3
 *
 * i=0 (1) → (0+3) % 7 = 3
 * i=1 (2) → (1+3) % 7 = 4
 * i=2 (3) → (2+3) % 7 = 5
 * i=3 (4) → (3+3) % 7 = 6
 * i=4 (5) → (4+3) % 7 = 0  ← wraps around
 * i=5 (6) → (5+3) % 7 = 1  ← wraps around
 * i=6 (7) → (6+3) % 7 = 2  ← wraps around
 *
 * Output: [5, 6, 7, 1, 2, 3, 4]
 * ```
 *
 * ## Complexity
 * - **Time:**  O(n) — two passes through the array.
 * - **Space:** O(n) — a temporary array of the same size is used.
 *
 * @param nums The integer array to rotate.
 * @param k    Number of steps to rotate to the right. If [k] exceeds the array
 *             size, `k % nums.size` gives the effective number of steps.
 */
fun rotate(nums: IntArray, k: Int): Unit {
    var steps = k % nums.size
    var newArray = IntArray(nums.size)
    for(i in nums.indices){
        newArray[(i+steps) % nums.size] = nums[i]
    }
    for (j in nums.indices){
        nums[j] = newArray[j]
    }
    print(nums.contentToString())
}
fun main(){
    rotate(intArrayOf(1,2), 7)
}