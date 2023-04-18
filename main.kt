fun main() {
    print(maximumWealth(
        accounts = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1)
        )
    ))
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    val rows = accounts.size
    val cols = accounts[0].size

    var i = 0
    var maxSum = -1
    while (i < rows) {
        var sum = 0
        var j = 0
        while (j < cols) {
            sum += accounts[i][j]
            j++
        }
        if (sum > maxSum) {
            maxSum = sum
        }
        i++
    }

    return maxSum   
}