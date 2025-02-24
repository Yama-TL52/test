import java.util.Random;

public class Sample11 {
    public static void main(String[] args) {
        Random random = new Random();

        // 0から99までの乱数を生成
        for (int i = 0; i <= 5; i++) {

            int randomNumber = random.nextInt(100);
            System.out.println("乱数の生成1" + randomNumber);
        }
    }
}