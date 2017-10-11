package com.example.uzair.fragmenttoactivity.dummy;

/**
 * Created by UZAIR on 10/11/2017.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {


    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();


    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {

        addItem(new DummyItem("1", "Item 1"));
        addItem(new DummyItem("2", "Item 2"));
        addItem(new DummyItem("3", "Item 3"));
        addItem(new DummyItem("4", "Item 4"));
        addItem(new DummyItem("5", "Item 5"));
        addItem(new DummyItem("6", "Item 6"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
