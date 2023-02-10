package com.zhengwei.DTGH;

/**
 * @Author: zhengwei
 * @Date: 4/15/21
 * @Description:
 */
public class CoinChange {

    private static final int [] coinSize = new int[] {25,21,10,5,1};

    private static final int returnMoney = 63;

    private static final int [] coinUsed = new int[returnMoney + 1];

    public static void main(String[] args) {

        int minCoins = 0;
        coinUsed[0] = 0;
        for(int i = 1 ; i<=returnMoney ; i++){
            minCoins = i;
            for(int j = 0 ; j< coinSize.length ; j++){
                if(i>coinSize[j]) {
                    int temp = coinUsed[i - coinSize[j]] + 1;
                    if(temp<minCoins) minCoins = temp;
                }
            }
           coinUsed[i] = minCoins;
        }
        System.out.println(minCoins);
    }
}
