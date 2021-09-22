package temp_homework;


import java.util.Random;
import java.util.Scanner;

public class Temp_Homework {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random =new Random();
        int[][] temp =new int [12][];
        temp[0] = new int[31];
        temp[1] = new int[28];
        temp[2] = new int[31];
        temp[3] = new int[30];
        temp[4] = new int[31];
        temp[5] = new int[30];
        temp[6] = new int[31];
        temp[7] = new int[31];
        temp[8] = new int[30];
        temp[9] = new int[31];
        temp[10] = new int[30];
        temp[11] = new int[31];
        for (int i=0;i<2;i++){
            for(int j =0;j<temp[i].length;j++){
                temp[i][j]=random.nextInt(15)-12;
                //System.out.println(temp[i][j]);                
           }
    }
        for (int i=2;i<5;i++){
            for(int j =0;j<temp[i].length;j++){
                temp[i][j]=random.nextInt(17);
                //System.out.println(temp[i][j]); 
            }
        }
        for (int i=5;i<8;i++){
            for(int j =0;j<temp[i].length;j++){
                temp[i][j]=random.nextInt(10)+15;
                //System.out.println(temp[i][j]); 
            }
        }
        for (int i=8;i<11;i++){
            for(int j =0;j<temp[i].length;j++){
                temp[i][j]=random.nextInt(10)-3;
                //System.out.println(temp[i][j]); 
            }
        }  
       
        for (int i=11;i<12;i++){
            for(int j =0;j<temp[i].length;j++){
                temp[i][j]=random.nextInt(15)-12;
                //System.out.println(temp[i][j]); 
            }
        }
    System.out.print("Введите месяц в виде числа: ");
    int month =scanner.nextInt();
    System.out.print("Введите день: ");
    int Day =scanner.nextInt();
    month-=1;
    int days=Day -1;
        switch (month) {
            case 0:
                System.out.println(Day+" января "+ temp[month][days]+" градусов");
                break;
            case 1:
                System.out.println(Day+" февраля "+ temp[month][days]+" градусов");
                break;
            case 2:
                System.out.println(Day+" марта "+ temp[month][days]+" градусов");
                break;
            case 3:
                System.out.println(Day+" апреля "+ temp[month][days]+" градусов");
                break;
            case 4:
                System.out.println(Day+" марта "+ temp[month][days]+" градусов");
                break;               
            case 5:
                System.out.println(Day+" июня "+ temp[month][days]+" градусов");
                break;
            case 6:
                System.out.println(Day+" июля "+ temp[month][days]+" градусов");
                break; 
            case 7:
                System.out.println(Day+" августа "+ temp[month][days]+" градусов");
                break;
            case 8:
                System.out.println(Day+" сентября "+ temp[month][days]+" градусов");
                break;
            case 9:
                System.out.println(Day+" октября "+ temp[month][days]+" градусов.");
                break; 
            case 10:
                System.out.println(Day+" ноября "+ temp[month][days]+" градусов.");
                break;
            case 11:
                System.out.println(Day+" декабря "+ temp[month][days]+" градусов.");
                break;                
        }
    int maxTemp=temp[0][0];
    int maxday=1;
    int months=0;
    for (int i =0;i<temp.length;i++){
        for(int j=0;j<temp[i].length;j++){
            if(temp[i][j]>maxTemp){
                maxTemp=temp[i][j];
                maxday+=j;
                months=i;
                break;                
            }
        }   
    }
    switch(months){
        case 5:
        System.out.println("Максимальная темп. была "+maxday+" июня: "+maxTemp);
        break;
        case 6:
        System.out.println("Максимальная темп. была "+maxday+" июля: "+maxTemp);
        break;
        case 7:
        System.out.println("Максимальная темп. была "+maxday+" августа: "+maxTemp);
        break;
    }
    int minTemp=temp[0][0];
    int minday=1;
    int minmonth=0;
    for (int i =0;i<temp.length;i++){
        for(int j=0;j<temp[i].length;j++){
            if(temp[i][j]<minTemp){
                minTemp=temp[i][j];
                minday+=j;
                minmonth=i;
                break;
                }    
        }
    }
    switch(minmonth){
        case 0:
        System.out.println("минимальная темп. была "+minday+" января: "+minTemp);
        break;
        case 1:
        System.out.println("минимальная темп. была "+minday+" февраля: "+minTemp);
        break;
        case 11:
        System.out.println("минимальная темп. была "+minday+" декабря: "+minTemp);
        break;
    }
    double[] average= new double[12];
    for (int i=0;i<temp.length;i++){
        int dayss=-1;
        for(int j=0;j<temp[i].length;j++){
            average[i]+=(double)temp[i][j];
            dayss=j-1;
        }
    average[i]=average[i]/dayss;
    }
    System.out.println("Средняя темп в месяц");
    for(int i=0;i<average.length;i++){
        switch (i){
            case 0:
                System.out.printf(" Январь: %-4.2f%n ", average[i]);
                break;
            case 1:
                System.out.printf("Февраля: %-4.2f%n ", average[i]);
                break;
            case 2:
                System.out.printf("Март: %-4.2f%n ", average[i]);
                break;
            case 3:
                System.out.printf("Апрель: %-4.2f%n ", average[i]);
                break;
            case 4:
                System.out.printf("Май: %-4.2f%n ", average[i]);
                break;               
            case 5:
                System.out.printf("Июнь: %-4.2f%n ", average[i]);
                break;
            case 6:
                System.out.printf("Июль: %-4.2f%n ", average[i]);
                break; 
            case 7:
                System.out.printf("Август: %-4.2f%n ", average[i]);
                break;
            case 8:
                System.out.printf("Сентябрь: %-4.2f%n ", average[i]);
                break;
            case 9:
                System.out.printf("Октябрь: %-4.2f%n ", average[i]);
                break; 
            case 10:
                System.out.printf("Ноябрь: %-4.2f%n ", average[i]);
                break;
            case 11:
                System.out.printf("Декабря: %-4.2f%n ", average[i]);
                break;
        }
    }
        }
    }