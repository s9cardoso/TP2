import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Address adress2 = new Address("rua dois",5123,"312-11");
        Address adress1 = new Address("rua dali",12321,"412-12");
        User user1 = new User("Sergio", "scc@gmail.com","s9cardoso","123",adress1);
        User user3 = new User("Diogo","rgr@ada","dig","qwer",adress2);

        Category category1 = new Category("roupa","calças","azul");
        Category category2 = new Category("sapatilhas","adidas","cinzento");
        Category category3 = new Category("desporto","bolas","azul");

        Product product1 = new Product("levis","ganga","picture","category1",100,"un");
        Product product2 = new Product("carhartt","pretas","picture","category1",100,"un");
        Product product3 = new Product("stan smith","verde","picture","category2",120,"un");
        Product product4 = new Product("gazelle","vermelho","picture","category2",110,"un");
        Product product5 = new Product("chuteiras","nike","picture","category3",180,"un");
        Product product6 = new Product("bones","vermelho","picture","category3",10,"un");
        Product product7 = new Product("calçoes","puma","picture","category3",50,"un");

        List<User> UserList = new ArrayList<>();
        UserList.add(user1);
        UserList.add(user3);

        List<Product> newProductList1 = new ArrayList<>();
        newProductList1.add(product1);
        newProductList1.add(product2);
        newProductList1.add(product3);
        newProductList1.add(product4);
        newProductList1.add(product5);

        List<Product> newProductList2 = new ArrayList<>();
        newProductList2.add(product6);
        newProductList2.add(product7);

        ShoppingList lista=new ShoppingList("Lista1",user1,newProductList1,newProductList2,UserList);


        // utilizadores que partilham a lista
        System.out.println("Lista :");
        for (int i = 0;i<UserList.size();i++){
            System.out.println(UserList.get(i).getUsername());
        }
        //Nº de produtos + total dos produtos
        System.out.println("nº produtos: " + lista.getTotalOfProducts() + ": preço" + lista.getTotalPrice());
        System.out.println("nº produtos: " + lista.getTotalOfProductsOnShoppingCart() + "preço: " + lista.GetTotalPriceOnCart());

        //percentagem total %
        System.out.println(lista.getPercentageCompleted() + "%");



    }
}

