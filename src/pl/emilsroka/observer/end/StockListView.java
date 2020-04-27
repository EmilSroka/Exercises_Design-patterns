package pl.emilsroka.observer.end;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("(StockListView) Stock: " + subject.toString() + " got updated");
    }
}
