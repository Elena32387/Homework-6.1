import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkYear(2021);
        checkYear(2024);
        checkYear(2014);

        defineAppVersion(0, 2011);
        defineAppVersion(1,2024);

        System.out.println("Количество дней доставки "+ cardDeliveryDays(15));
        System.out.println("Количество дней доставки "+ cardDeliveryDays(75));


    }
    public static void checkYear (int year) {
        if (year>=1584 && (year %4 == 0 && year %100 != 0 || year %400 ==0)){
            System.out.println(year + " год високосный");}
        else {
            System.out.println(year + " год невисокосный");
        }
    }

    public static void defineAppVersion (int mobileOS, int mobileYear){
        String mobileOSName;
        switch (mobileOS){
            case 0:
                mobileOSName= "iOS";
                break;
            case 1:
                mobileOSName= "Android";
                break;
            default:
                mobileOSName= "неизвестная";}
        int currentYear = LocalDate.now().getYear();
        if(mobileYear!=currentYear){
            System.out.println("Для ОС " + mobileOSName+ " установите lite-версию.");}
        else {
            System.out.println("Для ОС "+mobileOSName+ " установите обычную версию.");}
        }

        public static int cardDeliveryDays (int distance){
        int deliveryDays;
        if (distance<=20) {
            deliveryDays = 1;
        } else if (distance<=60) {
            deliveryDays = 2;
        } else {deliveryDays =3;}

        return deliveryDays;}

        }



