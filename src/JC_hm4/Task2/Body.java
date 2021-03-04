package JC_hm4.Task2;

public class Body {

    private String type;

    Body (String type) {
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void changeType(String type1 ) {
        type= type1;
    }

    @Override
    public String toString() {
        return "Body [type=" + type + "]";
    }
}
