package problems
/**
 * Calculates the maximum profit achievable from buying and selling a stock
 * on multiple occasions, given its daily prices.
 *
 * ## Approach: Greedy — Capture Every Upward Move
 * Since we can trade unlimited times, we never need to look more than one day
 * ahead. Whenever tomorrow's price is higher than today's, we "buy today, sell
 * tomorrow" and pocket the difference. Chaining these small gains is provably
 * equivalent to finding the best single buy/sell window for each rising segment.
 *
 * ## Example
 * ```
 * Prices: [1, 5, 3, 6]
 *
 * Day 1→2: 5 - 1 = +4   rising, capture it
 * Day 2→3: 3 - 5 = -2  falling, skip it
 * Day 3→4: 6 - 3 = +3   rising, capture it
 *
 * Total profit = 7
 * ```
 *
 * ## Complexity
 * - **Time:**  O(n) — single pass through the prices array.
 * - **Space:** O(1) — only a running profit counter is maintained.
 *
 * @param prices Array of daily stock prices where `prices[i]` is the price on day `i`.
 *               Must be non-empty.
 * @return The maximum total profit. Returns `0` if prices never rise (no
 *         profitable trade exists).
 */
fun maxProfit(prices: IntArray): Int {
    var profit = 0
    for (i  in  0 until prices.size-1) {
        if (prices[i] < prices[i + 1]) {
            profit += prices[i + 1] - prices[i]
        }
    }
    return profit
}

fun main() {
    println(maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}