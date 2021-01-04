import java.util.*;
public class MakeStars {
    public static void main(String[] aaa) {
        Scanner n = new Scanner(System.in);
        while (n.hasNextLine()) {
            Scanner l = new Scanner(n.nextLine());
            while (l.hasNext()) {
                System.out.print(l.next());

                if (l.hasNext()) {
                    System.out.print(" ");
                }
            }

            if (n.hasNextLine()) {
                System.out.println("");
            }
        }
    }
}