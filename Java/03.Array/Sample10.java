public class Sample10 {
    public static void main(String[] args) {
        // 配列の取り出し
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("test1" + i + ": " + numbers[i]);
        }

        // 配列の合計値取得
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int number3 : numbers2) {
            sum += number3;
        }
        System.out.println("test2: " + sum);

        // 配列の文字列結合 StringBuilder使用
        String[] chara3 = { "Test01", "Test02", "Test03", "Test04", "Test05" };
        StringBuilder chara = new StringBuilder();

        for (String chara1 : chara3) {
            chara.append(chara1).append("");
        }
        System.out.println("test2: " + chara.toString().trim());
    }
}