public class Product {

    private String name;
    private String description;
    private String picture;
    private Category category;
    private float price;
    private String unitytype;

    public Product(){

    }

    public Product(String name){
        this.name=name;
    }

    public Product(String name, String description, String picture, Category category,float price, String unitytype){
        this.name=name;
        this.description=description;
        this.picture=picture;
        this.category=category;
        this.price=price;
        this.unitytype=unitytype;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public Category getCategory() {
        return category;
    }

    public String getCategoryName(){
        return category.getName();
    }

    public String getCategoryColor(){
        return category.getColor();
    }

    public float getPrice() {
        return price;
    }

    public String getUnitytype() {
        return unitytype;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setUnitytype(String unitytype) {
        this.unitytype = unitytype;
    }
}
