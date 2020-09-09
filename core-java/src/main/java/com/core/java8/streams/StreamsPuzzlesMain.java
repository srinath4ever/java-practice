package com.core.java8.streams;

import com.mockito.ex1.Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * all streams related puzzles
 *
 * @author Srinath.Rayabarapu
 */
public class StreamsPuzzlesMain {

    public static void main(String[] args) {

        findMaxStocksForLast7Days();

    }

    private static void findMaxStocksForLast7Days() {

        Map<String, List<Stock>> stocksMap = new HashMap<>();

        List<Stock> stockList1 = new ArrayList<>();
        stockList1.add(new Stock("01", "srinath", 100));
        stockList1.add(new Stock("02", "srinath", 101));
        stockList1.add(new Stock("03", "srinath", 102));
        stockList1.add(new Stock("04", "srinath", 103));
        stocksMap.put("01", stockList1);

        List<Stock> stockList2 = new ArrayList<>();
        stockList2.add(new Stock("11", "shubha", 104));
        stockList2.add(new Stock("12", "shubha", 101));
        stockList2.add(new Stock("13", "shubha", 102));
        stockList2.add(new Stock("14", "shubha", 100));
        stocksMap.put("02", stockList2);

        List<Stock> stockList3 = new ArrayList<>();
        stockList3.add(new Stock("01", "CG", 101));
        stockList3.add(new Stock("01", "CG", 100));
        stockList3.add(new Stock("01", "CG", 102));
        stockList3.add(new Stock("01", "CG", 106));
        stocksMap.put("03", stockList3);

        // TODO -

    }

}
