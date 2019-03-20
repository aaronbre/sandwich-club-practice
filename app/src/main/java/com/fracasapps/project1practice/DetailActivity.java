package com.fracasapps.project1practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.fracasapps.project1practice.MainActivity.INTENT_EXTRA_POSITION;

public class DetailActivity extends AppCompatActivity {
    public static final int DEFAULT_POSITION = -1;
    private TextView stockNameTv;
    private TextView stockSymbolTv;
    private TextView stockPriceTv;
    private TextView stockYearHighTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        stockNameTv = findViewById(R.id.stock_name);
        stockPriceTv = findViewById(R.id.stock_price);
        stockSymbolTv = findViewById(R.id.stock_symbol);
        stockYearHighTv = findViewById(R.id.stock_high_price);

        Intent intent = getIntent();
        int position = intent.getIntExtra(INTENT_EXTRA_POSITION, DEFAULT_POSITION);
        if(position == DEFAULT_POSITION) finish();

        String[] stocks = getResources().getStringArray(R.array.json_stocks);
        String json = stocks[position];
        Stock stock = JsonUtils.convertJsonToStock(json);
        updateUi(stock);
    }

    private void updateUi(Stock stock){
        stockNameTv.setText(stock.getCompanyName());
        stockPriceTv.setText(stock.getLatestPrice().toString());
        stockSymbolTv.setText(stock.getSymbol());
        stockYearHighTv.setText(stock.getYearHigh().toString());
    }
}
