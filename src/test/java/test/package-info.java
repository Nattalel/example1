/**
 * Первый тестовый пакет
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;

class Test {
    public static int a = 15;
    private static int b = 10;
    protected String str2 = "Мир";
    public String str3 = "Енот";

    public static void main(String[] args) {
        int x = 5;
        String str = "Привет";
        /*System.out.println("Мир"); //sout - короткая запись

        if (x < 10) {
            System.out.println("x меньше 10");
        }

        if (a > b) {
            System.out.println("a больше b");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < str.length(); j++) {
            System.out.println(j);
        }

        while (x < 10) {
            x = x + 5;
            System.out.println(x);
        } */

        ArrayList<String> arr = new ArrayList<String>();   //массив
        arr.add("Собака");
        arr.add("Кот");
        arr.add("Волк");

        for (String i: arr) {
            System.out.println(i);
        }

        HashMap<String, String> maph = new HashMap<String, String>();  //HashMap
        maph.put("Ворона", "Голубь");
        maph.put("Синица", "Воробей");
        maph.put("Лебедь", "Чайка");

        for (String j: maph.keySet()) {
            System.out.println(j + " "+ maph.get(j));

        }

    }





  /*   public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
*/

    
}


