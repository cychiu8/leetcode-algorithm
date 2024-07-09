package leetcode.algorithm.StockWithTransactionFee;

public class BasicSolution extends Solution {

    @Override
    public int stockWithTransactionFee(int[] prices, int fee) {
        // there are three actions on day i
        // no action (no matter there are stock or not)
        // buy (when there are no stocks on hands) -> after doing this, there is a stock on hands
        // sell (when there is stock on hands) -> after doing this, there is no stock on hands

        int days = prices.length;
        int[] stock_0 = new int[days];
        int[] stock_1 = new int[days];

        // initial
        // stock_0 -> begin with no stock -> profit 0
        // stock_1 -> begin with held stock -> profit minus the first day
        // consider the transaction fee when buying

        stock_0[0] = 0;
        stock_1[0] = -prices[0] - fee;

        for (int i = 1; i < days; i++) {
            // sell then period i will no stock
            stock_0[i] = Math.max(stock_1[i - 1] + prices[i], stock_0[i - 1]);
            // buy then period i will have stock
            stock_1[i] = Math.max(stock_0[i - 1] - prices[i] - fee, stock_1[i - 1]);
        }

        // final max profit -> last period no stock on hands
        return stock_0[days - 1];

    }

}
