/**
 * Created by federicoboaro on 16/09/2017.
 */
public class Compare {
    int a;
    int b;

    public Compare (int a, int b){
        this.a = a;
        this.b = b;
    }

    public int massimo(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
