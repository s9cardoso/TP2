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



        System.out.println(.toString());
    }
}
