//import javax.swing.JFrame;
import java.util.Scanner;
import java.util.ArrayList;



public class  match_main {

    public static void main(String[] args) {

//        JFrame frame = new JFrame("相性診断");
//        frame.setSize(640, 480);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setVisible(true);

        System.out.println("はい or いいえ　で答えてください");
        String[] question = {"肉より魚が好きだ",
                "ビールよりもハイボールが好きだ",
                "アウトドアよりもインドアだ",
                "スポーツを観るなら野球がいい",
                "ベイスターズが好きだ"};
        int scores = 0;
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<String>();
            System.out.print("答えを入力");
            list.add(scanner.nextLine());
            System.out.println(list.toString());
            if (list.contains("はい")) {
                scores++;
            }
        }
        if (scores == 5) {
            System.out.print("相性１００％　最高です！");
        } else if (scores == 4) {
            System.out.print("相性８０％　いい感じ！");
        } else if (scores == 3) {
            System.out.print("相性６０％　もう少し！");
        } else if (scores == 2) {
            System.out.print("相性４０％　これからです！");
        } else if (scores == 1) {
            System.out.print("相性２０％　残念！");
        } else {
            System.out.print("相性０％　・・・");
        }


    }
}

