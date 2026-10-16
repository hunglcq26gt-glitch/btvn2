public class Time_Test {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 58);
        System.out.println("Thoi gian ban dau: " + time);

        time.nextSecond();
        System.out.println("Cong 1 giay: " + time);

        time.nextSecond();
        System.out.println("Qua nua dem: " + time);

        time.previousSecond();
        System.out.println("Tru 1 giay: " + time);

        time.setTime(0, 0, 0);
        System.out.println("\nDat lai thoi gian: " + time);

        time.previousSecond();
        System.out.println("Lui ve hom qua: " + time);
    }
}
