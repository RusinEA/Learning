public class searchsimplenums {

    public static void main (String [] args){
       int i, x;

       for (i = 2; i <= 1000; i++ ){ //перебираем делимое

           int tst = 0;

           for (x = 2; x <= i; x++ ){ //перебираем делитель от двух до i

               if (i != x & (i % x) == 0) {//если в данной итерации делитель не равен делимому, и остаток равен нулю - значит делимое не натуральное число
                   tst = i; //т.к. выяснили что делимое в данной итерации не натуральное число, запоминаем его
                   break;
               }
           }

           if (tst != i)
              System.out.println(i);

       }
    }

}
