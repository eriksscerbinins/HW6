public class homeWork {

    public static void main (String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain!;
        System.out.println("Могу ли я прогулятся: " + canWalk);

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду: " + canBuy);

        int temperature1 = 110;
        int temperature2 = 90;

        boolean isDeviceWorking = temperature1 > 100 && temperature2 < 100;
        System.out.println("Устройство работает корректно: " + isDeviceWorking);

    }
}