package creational.prototype;

public class RegisterModel implements Clonable{

    private int pages;
    private int length;
    private int breadth;
    private int price;
    private String facts;
    private String coverType;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFacts() {
        return facts;
    }

    public void setFacts(String facts) {
        this.facts = facts;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public Clonable clone() {
        RegisterModel registerModel = new RegisterModel();
        registerModel.breadth = this.breadth;
        registerModel.length = this.length;
        registerModel.price = this.price;
        registerModel.pages = this.pages;
        registerModel.facts = this.facts;
        registerModel.coverType = this.coverType;

        return registerModel;
    }
}
