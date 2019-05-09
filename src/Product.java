public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product (String na, double pr, String de, Category ca){
        name = na;
        price = pr;
        description = de;
        category = ca;
    }

    Product (String na, double pr, String de) {
        name = na;
        price = pr;
        description = de;
    }

    void productPrintCategory (){
        System.out.println(name +" " +price +" zł " +description +" " +category.nameCategory +" " +category.slogan);
    }
    void productPrintNoCategory (){
        System.out.println(name +" " +price +" zł " +description);
    }
}
