public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buy_price = prices[0];
        int profit = 0;
        for (int i=0;i<prices.length;i++) {
            if(buy_price>prices[i]){
                buy_price = prices[i];
            }
            profit = Math.max(profit, prices[i]-buy_price);
        }
        System.out.println(profit);
    }
}
