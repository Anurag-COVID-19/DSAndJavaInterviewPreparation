package com.main.executor;

import com.bean.Department;
import com.bean.Employee;
import com.customizedMap.CustomizedMap;

import java.util.*;
import java.util.stream.Collectors;

public class EmpDepartmentSetIterator
{
    private static List<Integer> mostLikedTweets = new ArrayList<Integer>();

    static
    {

    }
    static {
        mostLikedTweets.add(1);
        mostLikedTweets.add(2);
        mostLikedTweets.add(2);
        mostLikedTweets.add(5);
        mostLikedTweets.add(3);

        System.out.printf("");
        /*Collections.sort(mostLikedTweets, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return Integer.compare(o1, o2);
            }
        });*/
        Integer[] newArr = mostLikedTweets.toArray(new Integer[mostLikedTweets.size()]);
        int count = 1;
        int check = 0;
        Arrays.sort(newArr);
        for(int i = 1; i <= newArr.length; i++)
        {
            if(count < 4)
            {
                if(check != newArr[newArr.length-i])
                {
                    check = newArr[newArr.length-i];
                    count++;
                    System.out.println("Last three :: "+ i + "index of ::" + check );
                }
            }
            else
                break;

        }

        Integer inte = mostLikedTweets.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.printf("biggest :: "+inte);
        Iterator<Integer> iterator = mostLikedTweets.iterator();
        while (iterator.hasNext())
        {
            Integer i = iterator.next();
            System.out.printf("list soreted :: " + i + "\n");
        }
    }

    public static void main(String[] args) {
        Department department = new Department("1", "dept1");
        Set<Department> departmentSet = new HashSet<>();
        departmentSet.add(department);
        Employee employee = new Employee("1", departmentSet);
        Map<String, Set<Department>> map = new HashMap<>();
        map.put(employee.getEmpId(), departmentSet);
        if(map.containsKey(employee.getEmpId()))
        {
            Set<Department> departments = map.get(employee.getEmpId());
            String query = departments.stream().map(value -> value.getDepartmentName()).collect(Collectors.joining());
            System.out.printf("query result :: " + query);
        }
        CustomizedMap<Integer, Integer> map1 = new CustomizedMap<>(20);
        int count = 0;
        for(int i = 0; i < 25; i++)
        {
            map1.put(count , i);
            count++;
        }
        Iterator iterator = map1.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry value = (Map.Entry) iterator.next();
            System.out.println("Key :: " + value.getKey() + " value :: "+ value.getValue());
        }
    }
}
