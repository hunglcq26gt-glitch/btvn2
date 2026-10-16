public class Ball_Test {
    public static void main(String[] args) {
        Ball ball = new Ball(1.1f, 2.2f, 10, 0.5f, 0.5f);
        System.out.println("Trang thai ban dau: " + ball);

        ball.move();
        System.out.println("Sau khi di chuyen 1 buoc: " + ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println("Sau khi nay tuong ngang va di chuyen: " + ball);

        ball.reflectVertical();
        ball.move();
        System.out.println("Sau khi nay tuong doc va di chuyen: " + ball);
        
        ball.setX(10.0f);
        ball.setY(20.0f);
        System.out.println("Sau khi thiet lap lai vi tri: " + ball);
    }
}
