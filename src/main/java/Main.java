import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String args[]) {

        Category category1 = new Category("Fruta", "Fruta é rica em vitamina D", "Verde" );
        Category category2 = new Category("Laticinios","100% biologicos","Azul");
        Category category3 = new Category("Higiene","Boa hiegiene é essencial ","Vermelho");

        Product product1 = new Product("Banana","Alimento rico em ferro","picture",category1,1,"kg");
        Product product2 = new Product("Leite","Leite dos acores","picture",category2,2,"ml");
        Product product3 = new Product("Champo","Unisexo","picture",category1,5,"ml");
        Product product4 = new Product("Maca fuji","Maca doce e rija","picture",category1,1,"kg");
        Product product5 = new Product("Creme facial","Para peles rugosas","picture",category3,3,"ml");
        Product product6 = new Product("Queijo","50% de gordura","picture",category2,2,"kg");
        Product product7 = new Product("Pera rocha","Produto nacional","picture",category1,1,"kg");

        Address address1 = new Address("Bairro do aleixo","1","4563-322");
        Address address2 = new Address("Bairro da Amadora","6","4421-613");

        User user1 = new User("Pedro Vieira","pedrovieria@gmail.com","PedroVieira","pvieira123",address1);
        User user2 = new User("Filipe Faria","cfacfaria@gmail.com","CFACF","ff2011",address2);

        List<User> UserList = new ArrayList<>();
        UserList.add(user1);
        UserList.add(user2);

        List<Product> newProductList1 = new ArrayList<>();
        newProductList1.add(product1);
        newProductList1.add(product2);
        newProductList1.add(product3);
        newProductList1.add(product4);
        newProductList1.add(product5);
        newProductList1.add(product6);
        newProductList1.add(product7);

        List<Product> newProductList2 = new ArrayList<>();
        newProductList2.add(product2);
        newProductList2.add(product1);

        ShoppingList list1=new ShoppingList("lista de compras",user1,newProductList1,newProductList2,UserList);


        System.out.println("User's que partilham a lista");
        for (int i = 0;i<UserList.size();i++){
            System.out.println(UserList.get(i).getUsername());}
//Nome das pessoas com quem a lista está a ser partilhada separado por \n
        System.out.println("Produtos no carrinho");
        for(int i = 0;i<newProductList2.size();i++){
            System.out.println(newProductList2.get(i).getName());}
        System.out.println("Preco em euros dos produtos no carrinho: "+list1.GetTotalPriceOnCart());
//Nº de produtos + total de preço dos produtos que se encontram no carrinho
        System.out.println(("Produtos que estão ainda na lista:"));
        for (int i = 0;i<newProductList1.size();i++){
            System.out.println((newProductList1.get(i).getName())); }
        System.out.println("Preco em euros total dos itens que ainda estao na lista de compras: "+list1.GetTotalPrice());
//Nº de produtos + total do preço dos produdos que estão ainda na lista
        System.out.println("Percentagemde complete: ");
        System.out.println(list1.GetPercentageCompleted());
//Percentagem de complete
        System.out.println("Categorias Carrinho compras");
        for (int i = 0;i<newProductList2.size();i++){
            System.out.println((newProductList2.get(i).getCategoryName())); }
        System.out.println(("Nome dos produtos das categorias no carrinho"));
        for (int i = 0;i<newProductList2.size();i++){
            System.out.println((newProductList2.get(i).getName())); }
//Imprimir as categorias que existem no carrinho e por categoria imprimir o nome dos produtos
    }
}