fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val newList = mutableList.map { it * 2 } 
    println(newList) // Output: [2, 4, 6, 8, 10]
    println(mutableList) // Output: [1, 2, 3, 4, 5] //Original list is unchanged

    //To modify the original list, use an in-place approach (e.g. forEachIndexed)
    mutableList.forEachIndexed { index, value -> mutableList[index] = value * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]
    
    // Alternatively, reassign the result of map 
    mutableList.clear() //Clear the list for reassignment 
    mutableList.addAll(mutableList.map { it * 2 })
    println(mutableList) //Output: [] // Note the original list has been cleared
}