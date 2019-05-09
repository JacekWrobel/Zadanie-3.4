public class ShopTest {
    public static void main(String[] args) {
        Category category1 = new Category("słodycze", "coś słodkiego dla każdego");
        Category category2 = new Category("napoje", "pełne nawodnienie");
        Product product1 = new Product("Cukierki", 20.00, "opis?", category1);
        Product product2 = new Product("Wafelki", 24.50, "opis?", category1);
        Product product3 = new Product("Oranżada", 24.50, "opis?", category2);
        Product product4 = new Product("Kaszanka", 12.50, "opis?");
        SpecialOffer specOff20 =new SpecialOffer(product1, "Super promo", "10.05.2019", "15.05.2019", 0.2);

        System.out.println(product1.name +" " +product1.price +" " +product1.description +" " +product1.category.nameCategory
        +" " +product1.category.slogan);
        System.out.println(product3.name +" " +product3.price +" " +product3.description +" " +product3.category.nameCategory);

        System.out.println(specOff20.product.name);
        System.out.println();

        product1.productPrintCategory();
        product4.productPrintNoCategory();
        specOff20.SpecialPrint();


    }
}
