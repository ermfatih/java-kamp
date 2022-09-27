package ReferanceDataTypes;

public class ReferanceTypes {
    public static void referanceDataTypes(){
        int[] sayilar= new int[]{
                1,2,3
        };
        int[] sayilar2= new int[]{
                4,5,6
        };
        sayilar2=sayilar;
        sayilar[0]=0;
        System.out.println(sayilar2[0]);
    }
}
