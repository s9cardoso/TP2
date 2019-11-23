public class Product {
    private String name, description, picture, category, price, unitytype;
    private Category categoria1;

    public Product(String name, String description, String picture, String category, String price, String unitytype) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unitytype = unitytype;
        this.categoria1 = categoria1;
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

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public String getUnitytype() {
        return unitytype;
    }

    public String getCategoryColor() {
        return categoria1.getColor();
    }

    public String getCategoryName() {
        return categoria1.getName();
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

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setUnitytype(String unitytype) {
        this.unitytype = unitytype;
    }

    public void setCategoria1(Category categoria1) {
        this.categoria1 = categoria1;
    }
}
