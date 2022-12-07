package skole.algdat.oblig4;

class SjekkArray {

    public static int summer(int[] array, int fra, int til) {
        int sum = 0;
        for(int i = fra; i < til; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static boolean arrayLike(int[] a, int[] b) {
        if(a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static String arrayEksisterer(int[] array, int tall) {
        for(int n : array) {
            if(n == tall)
                return "Tallet finnes!";
        }
        return "Tallet finnes ikke!";
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
        int[] a = {1,5,3};
        int[] b = {1,2,3};
        System.out.println(SjekkArray.arrayEksisterer(a, 7));
    }
}
