package za.co.bounte.model.yodlee.provider;

import java.util.List;

/**
 * Created by Rocky on 2018/01/10.
 */

public class Attribute {
    private String name;
    private List<String> container = null;

    public Attribute() {
    }

    public Attribute(String name, List<String> container) {
        this.name = name;
        this.container = container;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContainer() {
        return container;
    }

    public void setContainer(List<String> container) {
        this.container = container;
    }

}
