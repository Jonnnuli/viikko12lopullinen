package shopping.list;

public class Purchase {

    private String purchase;
    private String remember;
    private int order = 1;

    private String id;
    private String importantText;

    public Purchase(String purchase, String remember, int order) {
        this.purchase = purchase;
        this.remember = remember;
        this.order = order;

        id = "Kokeilu-" + (int)(Math.random());
    }

    public String getPurchase() {
        return purchase;
    }

    public String getRemember() {
        return remember;
    }
    public String getOrder() {
        //String orderString = Integer.toString(order++);
        return order + ".";
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void addImportantText(String text) {
        importantText = importantText + text;
    }

    public String getImportantText() {
        return importantText;
    }
}
