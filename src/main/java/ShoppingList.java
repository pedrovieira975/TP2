import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private String name;
    private User user;
    private User userlist;

    private List<User> UserList = new ArrayList<>();
    //comprar
    public List<Product> ProductList1 = new ArrayList<>();
    private List<Product> ProductList2 = new ArrayList<>();
    //carrinho
    public void setProductlist1(List<Product> Productlist1){
        Productlist1 = Productlist1;
    }
    public void setProductlist2(List<Product> Productlist2){
        Productlist2 = Productlist2;
    }
    public ShoppingList(String name,User user,List<Product> productlist1,List<Product> productlist2,List<User> userList){
        this.name = name;
        this.user = user;
        this.userlist = userlist;
        ProductList1 = productlist1;
        ProductList2 = productlist2;
        UserList = userList;
    }
    public String getListname(){
        return  name;
    }
    public  User username(){
        return user;
    }
    public List<Product> getTotalOfProducts(){
        return ProductList1;
    }
    public List<Product> getTotalOfProductsOnShoppingCart() {
        return ProductList2;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double GetPercentageCompleted(){
        double p = 0;
        int Tlist = ProductList1.size();
        int Tcarrinho = ProductList2.size();
        p = (Tcarrinho*100)/ Tlist;
        return p;
    }
    public double GetTotalPrice(){
        double tp = 0;
        for(int i = 0;i<ProductList1.size();i++){
            tp = tp + ProductList1.get(i).getPrice();
        }
        return tp;
    }
    public double GetTotalPriceOnCart(){
        double tpc = 0;
        for (int i = 0;i<ProductList2.size();i++){
            tpc = tpc + ProductList2.get(i).getPrice();
        }
        return tpc;
    }
    public boolean addProduct(Product product){
        return addProduct(product);

    }
    public boolean removeProduct(Product product){
        return removeProduct(product);
    }
    public boolean AddProductToShoppingCart(Product product){
        boolean ad = ProductList2.add(product);
        return ad;
    }

    public boolean RemoveProductFromShoppingCart(Product product){
        return  removeProduct(product);
    }
}
