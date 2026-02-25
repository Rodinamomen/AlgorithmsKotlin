package search

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