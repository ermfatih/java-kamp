import InheritanceDemo.*;
import ReferanceDataTypes.ReferanceTypes;
import classes.CustomerManager;
import fieldsAndAttributes.Product;
import fieldsAndAttributes.ProductManager;
import inheritance.CostomerManager;
import inheritance.EmployeeManager;
import methods.Methods;
import recapDemo.DortIslem;
import methodOverloading.DortIslem2;

public class Main {
    public static void main(String[] args) {
        String mesaj="bugun hava cok güzel";
        String yeniMesaj=mesaj.substring(0,2);
        //System.out.println(yeniMesaj);
        //Methods.sayiBulmaca();
        //Methods.mesajVer("sayi mevcuttur");
        //System.out.println(Methods.topla(2,4));
        int toplamm=Methods.topla2(1,2,3,4,5,6,7);
        //System.out.println(toplamm);

        CustomerManager customerManager=new CustomerManager();
        //customerManager.add();
        //customerManager.remove();
        //customerManager.update();

        //ReferanceTypes.referanceDataTypes();


        DortIslem dortIslem =new DortIslem();
        int sonuc=dortIslem.topla(3,4);
        //System.out.println(sonuc);

        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product product1=new Product(1,"bardak","blabla",223,1);

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        System.out.println(product.getKod());

        DortIslem2 dortIslem1=new DortIslem2();
        System.out.println(dortIslem1.topla(1,2));

        CostomerManager costomerManager=new CostomerManager();
        EmployeeManager employeeManager=new EmployeeManager();


        BaseKrediManager baseKrediManager1=new TarimKrediManager();

        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }

}
