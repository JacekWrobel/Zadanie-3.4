import java.sql.SQLOutput;

public class SpecialOffer {
    Product product;
    String offer;
    String dateStart;
    String dateEnd;
    double discount;


    SpecialOffer (Product pr, String of, String dS, String dE, double di){
        product = pr;
        offer = of;
        dateStart = dS;
        dateEnd = dE;
        discount = di;

    }
    void SpecialPrint (){
        System.out.println(product.name +" " +product.category.nameCategory +" " +product.category.slogan +" " + offer +" w dniach od " + dateStart +" do " + dateEnd +" obniżka ceny o " + discount);
    }
}
