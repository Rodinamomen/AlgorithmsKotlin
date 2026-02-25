package problems

fun search(nums: IntArray, target: Int): Int {
    var high = nums.lastIndex
    var low = 0
    while (low <= high) {
        val mid = ((low + high) / 2)
        if(nums[mid] == target) {
            return mid
        }else if(nums[mid]>target){
            high = mid - 1
        }else{
            low = mid + 1
        }
    }
    return -1
}

fun main(){
   println(search(intArrayOf(1,2,3,4,5,6,7,8,9,10), 3))
}