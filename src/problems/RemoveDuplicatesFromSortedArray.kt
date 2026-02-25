package problems

/**
 * Removes duplicates from a sorted integer array **in-place**, returning the count
 * of unique elements. The first [k] elements of [nums] will contain the unique
 * values in their original order after the function returns.
 *
 * ## Approach: Two Pointers
 * Two pointers (`i` and `k`) traverse the array simultaneously:
 * - `i` — the write pointer, tracks the position of the last confirmed unique element.
 * - `k` — the read pointer, scans ahead to find the next unique element.
 *
 * At each step:
 * - If `nums[i] == nums[k]`, the element at `k` is a duplicate → advance `k`.
 * - Otherwise, a new unique element is found → write it to `nums[i + 1]`,
 *   then advance both pointers.
 *
 * ## Example
 * ```
 * Input:  [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
 * Output: 5  (first 5 elements → [0, 1, 2, 3, 4])
 * ```
 *
 * ## Complexity
 * - **Time:**  O(n) — each element is visited at most once via the read pointer.
 * - **Space:** O(1) — sorting is done in-place with no extra allocations.
 *
 * @param nums A **sorted** array of integers (may contain duplicates).
 * @return The number of unique elements [k]. Only the first [k] elements
 *         of [nums] are meaningful after this call.
 */
fun removeDuplicates(nums: IntArray): Int {
    var k = 1
    var i = 0
    while (i<nums.size && k<nums.size) {
        if(nums[i] == nums[k]) {
            k++
        }else{
            nums[i+1] = nums[k]
            k++
            i++
        }
    }
    return i+1
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}