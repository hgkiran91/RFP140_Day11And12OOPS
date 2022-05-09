package com.bridgelabz;

import java.util.Scanner;

class StockPortfolio {

    private String stockName;
    private int numOfShares;
    private double sharePrice;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

}

public class StockAccountManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Stocks: ");
        int numOfStocks = sc.nextInt();

        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStockName("ADANI");
        stockPortfolio.setNumOfShares(10);
        stockPortfolio.setSharePrice(97.5);

        System.out.println("The Name of the Stock: " + stockPortfolio.getStockName());
        System.out.println("Number of Shares: " + stockPortfolio.getNumOfShares());
        System.out.println("Price of each Share: " + stockPortfolio.getSharePrice());
        System.out.println("Total price of shares purchased: " + numOfStocks * stockPortfolio.getSharePrice());
    }
}
