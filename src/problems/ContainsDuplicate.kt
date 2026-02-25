package problems
/**
 * Determines whether any value appears at least twice in the given array.
 *
 * ## Approach: HashSet Lookup
 * We traverse the array once, storing each element in a [HashSet].
 * Before adding an element, we check if it already exists in the set —
 * if it does, we've found a duplicate and return `true` immediately.
 * If we finish the loop without a match, all elements are distinct.
 *
 * ## Example
 * ```
 * Input: [1, 2, 3, 1]
 *
 * num=1 → not in seen → seen = {1}
 * num=2 → not in seen → seen = {1, 2}
 * num=3 → not in seen → seen = {1, 2, 3}
 * num=1 → already in seen! → return true
 * ```
 *
 * ## Complexity
 * - **Time:**  O(n) — single pass through the array.
 * - **Space:** O(n) — worst case, every element is stored before a duplicate is found.
 *
 * @param nums The integer array to check.
 * @return `true` if any value appears more than once, `false` if all elements are distinct.
 */
fun containsDuplicate(nums: IntArray): Boolean {
    val seen = HashSet<Int>()
    for (num in nums) {
        if (num in seen) return true
        seen.add(num)
    }
    return false
}
fun main(){
    print(containsDuplicate(intArrayOf( 1,1,1,3,3,4,3,2,4,2)))
}