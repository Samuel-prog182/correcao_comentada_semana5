public class Semana5_exer2 {
    public static void main(String args[]) {
        int x = 13;

        while (x != 1){
        if (x % 2 == 0) {
            x = x / 2;
        }
        else {
            x = 3 * x + 1;
            // 3 * 13 + 1 = 40 va lor de x = 40
        }
        System.out.print(x + "-> ");
        
    }

}

}
// x = 40
// x = 20
// x = 10
// x = 5