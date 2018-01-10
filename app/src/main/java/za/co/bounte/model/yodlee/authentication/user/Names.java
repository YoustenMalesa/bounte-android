package za.co.bounte.model.yodlee.authentication.user;

/**
 * Created by Rocky on 2018/01/10.
 */

public class Names {
    private String first;
    private String last;

    public Names() {
    }

    public Names(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {

        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
