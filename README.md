# The-fifth-java-experiment
# 模拟学生作业处理
## 实验目的
1.掌握字符串String及其方法的使用；

2.掌握文件的读取/写入方法；

3.掌握异常处理结构；
## 实验内容
1.在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。

2.文件A包括两部分内容：

一是学生的基本信息；

二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：

每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；

允许提供输入参数，统计古诗中某个字或词出现的次数；

输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A；

考虑操作中可能出现的异常，在程序中设计异常处理程序
## 实验要求
1.设计学生类（可利用之前的）；

2.采用交互式方式实例化某学生；

3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 核心代码
1.断句的实现
```
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
```
2.查找字词的实现
```
public static void strfind(String file){
File f = new File(file);
int m = 0;
try
{
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    List<String> list = new ArrayList<String>();
    String str = null;
    int num = 1;
    while ((str = br.readLine()) != null)
    {
        list.add(str);
    }
    System.out.println("请输入查找的单词");
    Scanner sc = new Scanner(System.in);
    String strword = sc.nextLine();
    for (String s : list)
    {
        boolean b = Containstr(s, strword);
        if (b)
        {
            //System.out.println(num + ":" + s);
            m++;
        }
        //num++;
    }
    System.out.println("出现"+strword+"的次数是："+m);
} catch (FileNotFoundException e)
{
    e.printStackTrace();
} catch (IOException e)
{
    e.printStackTrace();
}
}*/
}
   
```
3.学生类的实现
```
public class Student {
    String name;
    String studentNumber;
    String sex;
    String major;
    Student(){}
    Student(String name,String studentNumber,String sex){
        this.name = name;
        this.studentNumber = studentNumber;
        this.sex = sex;
```
4.字节长度的计算
```
public class Count {
    public static int count(String srcname,String code){
        int i = 0;
        int n = -1;
        byte [] a = new byte[100];
        File f = new File(srcname);
        try{
            FileInputStream in = new FileInputStream(f);
            int m = code.length();
            while((n = in.read(a,0,2*m)) != -1){
                String s = new String (a,0,n);
                if(code.equals(s)){
                    i++;
                }
            }
```
5.异常抓捕
```
}catch(IOException ne){
            System.out.println("ReadError");
        }
        catch(Exception ne){
            System.out.println("error");
        }
```
## 实验结果
```
学生姓名：李帅兵性别:男学号:2019311329主修:计算机科学与技术
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
```
## 实验感想
每一次的实验都是各种知识的综合运用。最后这一次实验，还是花了很多时间，但还是有很多感触。这次实验对文件的读取和输出以及对文件内容的各种处理等，同时，对String和异常处理有了更深的了解


