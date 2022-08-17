package com.customizedMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomizedMap<K, V> extends LinkedHashMap<K, V>
{
    private final int MAX_SIZE;

    public CustomizedMap(int maxSize)
    {
        this.MAX_SIZE = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size() > MAX_SIZE;
    }

    public static void main(String[] args) {

        /*CustomizedMap<Integer, Integer> map = new CustomizedMap<>(20);
        int count = 0;
        for(int i = 0; i < 25; i++)
        {
            map.put(count , i);
            count++;
        }
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry value = (Map.Entry) iterator.next();
            System.out.println("Key :: " + value.getKey() + " value :: "+ value.getValue());
        }*/
    }

}
