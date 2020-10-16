package newtest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Toclass extends Oneclass {
    int x = 5;

    @Test

    public void starttest() throws IOException {
        boolean rez = x > 1;
        System.out.println(rez);
        /*Assertion a = new Assertion();
        a.assertFalse(rez);
        /*try (FileReader text = new FileReader("File.txt")) {
            System.out.println(text);
        }*/
        ;
        //text.close();


    }
}

   /* public void starttest() {
        /*boolean rez = x > 1;
        System.out.println(rez);
        Assertion a = new Assertion();
        a.assertFalse(rez);*/
     /*   String filename = "C:\\Users\\ACER\\IdeaProjects\\example\\src\\test\\java\\newtest\\File.txt";
        try {
            //Создание объекта класса, в котором лежит считанный файл
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String word = "", temp;

            //идем циклом по строкам файла
            while ((temp = reader.readLine()) != null) {
                word = word + temp;
            }
            if (word.contains("собака")) {
                System.out.println("true");
            }
            else {
                System.out.println("Такого слова в файле нет");
            }


        }
        catch(IOException ex){

                System.out.println(ex.getMessage());
            }

    }*/

