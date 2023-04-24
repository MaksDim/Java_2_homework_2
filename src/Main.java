public class Main {
    public static void main(String[] args) {
       //входные данные
       int balance = 1250;
       boolean bool = true;
       int percent;


       //Расчет
        if (balance > 1000) {
            percent = 10;
        } else {
            percent = 0;
        }
        int bonus = balance * percent / 1000;
        int new_balance = bonus + balance;
        System.out.println("Cумма средст на счете " + new_balance + " Кол-во бонусов " + bonus);
    }
}
