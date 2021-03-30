class Result {

  /*
   * Complete the 'stockmax' function below.
   *
   * The function is expected to return a LONG_INTEGER. The function accepts
   * INTEGER_ARRAY prices as parameter.
   */

  public static long stockmax(List<Integer> prices) {
    // Write your code here
    if (prices.size() < 2) {
      return 0;
    }

    int buy = 0;
    int sell = 1;
    long maxProfit = 0;

    while (sell < prices.size()) {
      if (prices.get(buy) < prices.get(sell)) {
        long profit = prices.get(sell) - prices.get(buy);
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buy = sell;
      }
      sell += 1;
    }
    return maxProfit;

  }

}
