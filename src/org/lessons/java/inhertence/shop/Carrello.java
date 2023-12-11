package org.lessons.java.inhertence.shop;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Product> listProduct = new HashSet<>();
        System.out.println("A che prodotto sei interessato? (tv/smartphone/cuffie)");
        String risposta= scanner.nextLine();
        if (risposta.equalsIgnoreCase("tv")){
            System.out.println("dimmi nome del televisore");
            String modelloTv = scanner.nextLine();
            System.out.println("descrizione del prodotto");
            String descriptionTV = scanner.nextLine();
            System.out.println("dimmi il prezzo");
            BigDecimal priceTv = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("dammi l'iva");
            BigDecimal ivaTv = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("quanti pollici deve essere?");
            int dimensioniTv= scanner.nextInt();
            System.out.println("la tv è smart?(y/n)");
            String smartTv = scanner.nextLine();
            boolean smart;
            if (smartTv.equalsIgnoreCase("y")){
                smart=true;
            }
            else{
                smart=false;
            }
            Tv television = new Tv(modelloTv,descriptionTV,priceTv,ivaTv,smart,dimensioniTv);

        } else if (risposta.equalsIgnoreCase("smarthphone")) {
            System.out.println("dimmi nome dello smartphone");
            String modelloSmartphone = scanner.nextLine();
            System.out.println("descrizione del prodotto");
            String descriptionSmartphone = scanner.nextLine();
            System.out.println("dimmi il prezzo");
            BigDecimal priceSmartphone = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("dammi l'iva");
            BigDecimal ivaSmartphone = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("quanta memoria deve avere?");
            int memorySmartphone = scanner.nextInt();

            Smarphone smartPhone = new Smarphone(modelloSmartphone,descriptionSmartphone,priceSmartphone,ivaSmartphone,memorySmartphone)
        } else if (risposta.equalsIgnoreCase("cuffie")) {
            System.out.println("dimmi il nome delle cuffie");
            String modelloCuffie=scanner.nextLine()
            System.out.println("descrizione del prodotto");
            String descriptionSmartphone = scanner.nextLine();
            System.out.println("dimmi il prezzo");
            BigDecimal priceSmartphone = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("dammi l'iva");
            BigDecimal ivaSmartphone = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            System.out.println("che colore le vuoi?");
            String colorCuffie= scanner.nextLine();

            Cuffie cuffie = new Cuffie()
        }
    }
}
