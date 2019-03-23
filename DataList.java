package oshin.tasnuva.recyclerview;

public class DataList {
    String name;
    String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataList() {
    }

    public DataList(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
