package Homework3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        Student li = new Student("李帅兵","2019311329","男");
        System.out.println("输入学科");
        Scanner l = new Scanner(System.in);
        li.setMajor(l.nextLine());
        try{
            int n = -1;
            int i = 0;
            byte [] a = new byte[100];
            File f = new File("src\\Experience1\\changhenge.txt");
            FileInputStream in = new FileInputStream(f);
            File targetFile = new File("src\\Experience1\\B.txt");
            Writer out = new FileWriter(targetFile,true);
            out.append(li.toString());
            System.out.println(li.toString());
            out.flush();
            while((n = in.read(a,0,2)) != -1){
                String s = new String (a,0,n);
                i++;
                out.write(s);
                out.flush();
                if(i%7 == 0 && i%14 != 0){
                    
                    out.append("，");
                    out.flush();
                }

                else if(i%14 == 0){
                    out.append("。\n");                
                    out.flush();
                }
                else{
                   
                    out.flush();
                }
            }

            in.close();

        }
        catch(IOException n){
            System.out.println("ReadError");
        }
        catch(Exception n){
            System.out.println("error");
        }
        finally{}
        System.out.println("输入您想查询的字符");
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        Count.count("src\\Experience1\\changhenge.txt",s);
        MultiThread demo = new MultiThread();
        demo.run("src\\Experience1\\B.txt");

    }

   