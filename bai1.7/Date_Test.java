public class Date_Test {
    public static void main(String[]args){
        Date d = new Date(16,10,2026);
        System.out.println("Ngay: " + d.getDay());
        System.out.println("Thang: " + d.getMonth());
        System.out.println("Nam: " + d.getYear());
         System.out.println("Ngay Thang Nam: " + d.toString());
    
}
}
