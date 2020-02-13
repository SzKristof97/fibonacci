package me.szkristof.test3;

public class Main {

    public static void main(String[] args) {
        int[] t = new int[20]; //A tömb neve: 't', a mérete bele van égetve a kódba!

        if(!meretEllenprzes(t)){
            System.out.printf("A kódba égetett tömb nem megfelelő méretű!\n" +
                    "Kérem ellenőrizze a kódot, hogy a tömb legalább 2 elemet el tud-e tárolni!");
            return;
        }

        //feltöltöm a tömböt a fibonacci számsorozattal
        fibonacci(t);

        //Kiíratom a képernyőre
        kiiras(t);

        //Átrendezem csökkenő sorrendre
        bubrendCsokkeno(t);

        //Ismét kiírom
        kiiras(t);

        //Vissza rendezem növekvő sorrendre
        bubrendNovekvo(t);

        //És legvégül ezt is kiíratom a képernyőre
        kiiras(t);
    }

    /**
     * A beadott tömböt kiírja a konzolra
     *
     * @param t tetszőleges méretű egész számokat tároló tömb
     */
    public static void kiiras(int[] t){
        for (int i : t) { //Végig megy a listán sorban
            System.out.printf("%d ", i); //Kiírja az aktuális elemet a konzolra szünettel elválasztva egymástól
        }
        System.out.printf("\n"); //Sortörést rak a kiírt elemek végére
    }

    /**
     * A beadott listát feltölti a tömb méretének megfelelően
     * a fibonacci számsorozattal!
     *
     * @param t tetszőleges méretű egész számokat tároló tömb
     */
    public static void fibonacci(int[] t){
        //A számsorozat első két eleme 0 és 1
        //ezt bele égettem a kódba, mivel nem változik!
        //Ez alapján fog növekedni a lista
        t[0] = 0;
        t[1] = 1;

        //Mivel az első 2 elem megvan így a 3. elemmel (2) indítom a listát
        for(int i = 2; i < t.length; i++){
            t[i] = t[i - 2] + t[i - 1]; //A jelenlegi elem értékét az előző két elem értékének összege adja
        }
    }

    /**
     * A beadott tömböt csökkenő sorrendbe rendezi
     * buborékos rendezi módszerrel
     *
     * @param t tetszőleges méretű egész számokat tároló tömb
     */
    public static void bubrendCsokkeno(int[] t){
        for(int i = 0; i < t.length; i++){ //Annyiszor futtatja le, ahány elem van a listában!
            for(int j = 0; j < t.length - 1; j++){ //Annyiszor fut le, ahány elem van a listában - 1!
                if(t[j] < t[j + 1]){ //Ha a jelenlegi elem kissebb mint a sorban következő, akkor kicseréli a kettőt
                    int temp = t[j]; //Ideiglenes változó, hogy eltároljuk a jelenlegi elemet
                    t[j] = t[j + 1]; //A jelenlegi elem felveszi a sorban következő elem értékét
                    t[j + 1] = temp; //A sorban következő elem felveszi a korábban eltárolt értéket a temp-ből!
                }
            }
        }
    }

    /**
     * A beadott tömböt növekvő sorrendbe rendezi
     * buborékos rendezi módszerrel
     *
     * @param t tetszőleges méretű egész számokat tároló tömb
     */
    public static void bubrendNovekvo(int[] t){
        for(int i = 0; i < t.length; i++){ //Annyiszor futtatja le, ahány elem van a listában!
            for(int j = 0; j < t.length - 1; j++){ //Annyiszor fut le, ahány elem van a listában - 1!
                if(t[j] > t[j + 1]){ //Ha a jelenlegi elem kissebb mint a sorban következő, akkor kicseréli a kettőt
                    int temp = t[j]; //Ideiglenes változó, hogy eltároljuk a jelenlegi elemet
                    t[j] = t[j + 1]; //A jelenlegi elem felveszi a sorban következő elem értékét
                    t[j + 1] = temp; //A sorban következő elem felveszi a korábban eltárolt értéket a temp-ből!
                }
            }
        }
    }

    /**
     * Ellenőrzi, hogy a tömb mérete megfelelő-e
     * Ha > mint 2 akkor IGAZ (TRUE)
     * Ha < mint 2 akkor HAMIS (FALSE)
     *
     * @param t tetszőleges méretű egész számokat tároló tömb
     */
    public static boolean meretEllenprzes(int[] t){
        return !(t.length < 2);
    }
}
