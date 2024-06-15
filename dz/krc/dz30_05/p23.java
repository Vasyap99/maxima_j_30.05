package dz.krc.dz30_05;

public class p23{
    public static void main(String[]s){
        double v1=45,v2=50;
        if(v1<0 || v2<0){
            System.out.println("Я не хочу работать с отрицательными числами");
            return;
        }
        System.out.println(v1*v2);
    }
}