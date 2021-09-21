
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
    System.out.print("Введите День: ");
    int Day =scanner.nextInt();
    month-=1;
    int days=Day -1;
        switch (month) {
            case 0:
                System.out.println(Day+" января было "+ temp[month][days]+" градусов.");
                break;
            case 1:
                System.out.println(Day+" февраля было "+ temp[month][days]+" градусов.");
                break;
            case 2:
                System.out.println(Day+" марта было "+ temp[month][days]+" градусов.");
                break;
            case 3:
                System.out.println(Day+" апреля было "+ temp[month][days]+" градусов.");
                break;
            case 4:
                System.out.println(Day+" мая было "+ temp[month][days]+" градусов.");
                break;               
            case 5:
                System.out.println(Day+" июня было "+ temp[month][days]+" градусов.");
                break;
            case 6:
                System.out.println(Day+" июля было "+ temp[month][days]+" градусов.");
                break; 
            case 7:
                System.out.println(Day+" августа было "+ temp[month][days]+" градусов.");
                break;
            case 8:
                System.out.println(Day+" сентября было "+ temp[month][days]+" градусов.");
                break;
            case 9:
                System.out.println(Day+" октября было "+ temp[month][days]+" градусов.");
                break; 
            case 10:
                System.out.println(Day+" ноября было "+ temp[month][days]+" градусов.");
                break;
            case 11:
                System.out.println(Day+" декабря было "+ temp[month][days]+" градусов.");
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
        System.out.println("Максимальная температура была "+maxday+" июня: "+maxTemp);
        break;
        case 6:
        System.out.println("Максимальная температура была "+maxday+" июля: "+maxTemp);
        break;
        case 7:
        System.out.println("Максимальная температура была "+maxday+" августа: "+maxTemp);
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
        System.out.println("Минимальная температура была "+minday+" января: "+minTemp);
        break;
        case 1:
        System.out.println("Минимальная температура была "+minday+" февраля: "+minTemp);
        break;
        case 11:
        System.out.println("Минимальная температура была "+minday+" декабря: "+minTemp);
        break;
    }
    int jan=0;
    int feb=0;
    int mart=0;
    int apr=0;
    int mai=0;
    int jun=0;
    int jul=0;
    int aug=0;
    int sep=0;
    int okt=0;
    int nov=0;
    int des=0;
    for(int i=0;i<temp.length;i++){
        for(int j=0;j<temp[i].length;j++){
            jan+=temp[0][j];
            mart+=temp[2][j];
            mai+=temp[4][j];
            jul+=temp[6][j];
            aug+=temp[7][j];
            okt+=temp[9][j];
            des+=temp[11][j];
        } 
    }
    for(int i=0;i<29;i++){
        for(int j=0;j<i;j++){
            feb+=temp[1][j];

            }
    }
        for(int i=0;i<30;i++){
            for(int j=0;j<i;j++){
                apr+=temp[3][j];
                jun+=temp[5][j];
                sep+=temp[8][j];
                nov+=temp[10][j];
        }
    }
    jan=jan/31;
    feb=feb%28;
    mart=mart%31;
    apr=apr%30;
    mai=mai%31;
    jun=jun%30;
    jul=jul%31;
    aug=aug%31;
    sep=sep%30;
    okt=okt%31;
    nov=nov%30;
    des=des%31;    
    System.out.println("Cредняя темп. за январь: "+jan+", за февраль "+feb+", за март "+mart+", за апрель "+apr+", за май "+mai+", за июнь "+jun+", за июль "+jul+", за август "+aug+", за сентябрь "+sep+", за октябрь "+okt+", за ноябрь "+nov+", за декабрь "+des+"");
        }
    }