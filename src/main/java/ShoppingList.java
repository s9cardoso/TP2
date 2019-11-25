import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String name;
    private User user;
    private User userlist;

    private List<Product>ProductList1 = new ArrayList<>();
    private List<Product>ProductList2 = new ArrayList<>();
    private List<User>UserList = new ArrayList<>();

    public ShoppingList(String name, User user, User userlist, List<Product> productList1, List<Product> productList2, List<User> userList) {
        this.name = name;
        this.user = user;
        this.userlist = userlist;
        ProductList1 = productList1;
        ProductList2 = productList2;
        UserList = userList;
    }
    public void setProductList1(List<Product>Productlist1){
        Productlist1=Productlist1;
    }
    public void setProductList2(List<Product>Productlist2){
        Productlist2=Productlist2;
    }



    public String getListName(){
        return name;
    }

    public String getUserName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUser(User user){
        this.user = user;
    }

    public boolean addProduct(Product product){
        boolean success = ProductList1.add(product);
        return success;
    }
    public boolean remProduct(Product product){
        return remProduct(product);
    }
    public void AddProductToShoppingCart(Product product){
        ProductList1.add(product);
    }

    public void RemProductFromShoppingCart(Product product){
        ProductList1.add(product);
    }








}
