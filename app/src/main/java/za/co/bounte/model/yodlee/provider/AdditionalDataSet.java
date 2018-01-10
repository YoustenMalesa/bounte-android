package za.co.bounte.model.yodlee.provider;

import java.util.List;

/**
 * Created by Rocky on 2018/01/10.
 */

public class AdditionalDataSet {
    private String name;
    private List<Attribute> attribute = null;

    public AdditionalDataSet(String name, List<Attribute> attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public AdditionalDataSet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

}
