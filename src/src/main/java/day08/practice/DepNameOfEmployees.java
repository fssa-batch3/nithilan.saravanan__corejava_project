package day08.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepNameOfEmployees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> depMap = new HashMap<>();

        System.out.println("Enter Input Like: HR, Name");

        while (sc.hasNext()) {
            String str = sc.nextLine();

            if ("stop".equals(str)) {
                break;
            }

            if (str == null || "".equals(str)) {
                throw new IllegalArgumentException("Input cannot be empty or null");
            }

            String[] arrDepName = str.split(",");

            if (arrDepName.length != 2) {
                throw new IllegalArgumentException("Input must have a Department and the Employee Name");
            }

            if (depMap.get(arrDepName[0]) == null) {
                depMap.put(arrDepName[0], new ArrayList<>());
                depMap.get(arrDepName[0]).add(arrDepName[1]);
            } else {
                depMap.get(arrDepName[0]).add(arrDepName[1]);
            }
        }

        for (Map.Entry<String, List<String>> e : depMap.entrySet()) {
            String depName = e.getKey();
            List<String> empNames = e.getValue();
            System.out.println(depName + ": " + empNames);
        }

        sc.close();
    }

}

