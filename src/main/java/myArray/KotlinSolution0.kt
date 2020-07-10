package myArray

class KotlinSolution0 {

    fun removeDuplicates(nums: IntArray): Int {
        var a: Int? = null

        for (i in nums.indices) {
            if (a != nums[i]){

            }
        }
        return 0
    }

    fun main() {
        var nums = intArrayOf(1,1,2)
        val len = removeDuplicates(nums)

        for (i in 0..len) {
            println(nums[i])
        }
    }
}