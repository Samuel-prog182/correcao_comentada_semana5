public class Semana5_exer1{
    public static void main(String args []){
        //fazer o fatorial , testar  20, 30..40;
        //5*4*3*2*1 = 120
        // long no lugar de int para numeros maiores
        long fatorial=1;
        for(int f=5;f>=1;f--){
            fatorial=f*fatorial;
        }
        System.out.println(fatorial);
    }
}
