package com.fracasapps.project1practice;

public class Stock {
    private String symbol;
    private String companyName;
    private Double latestPrice;
    private String sector;
    private Long marketCap;
    private Double yearHigh;
    private Double yearLow;

    public Stock() {
    }

    public Stock(String symbol, String companyName, Double latestPrice, String sector, Long marketCap, Double yearHigh, Double yearLow) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.latestPrice = latestPrice;
        this.sector = sector;
        this.marketCap = marketCap;
        this.yearHigh = yearHigh;
        this.yearLow = yearLow;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public Double getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(Double yearHigh) {
        this.yearHigh = yearHigh;
    }

    public Double getYearLow() {
        return yearLow;
    }

    public void setYearLow(Double yearLow) {
        this.yearLow = yearLow;
    }
}
