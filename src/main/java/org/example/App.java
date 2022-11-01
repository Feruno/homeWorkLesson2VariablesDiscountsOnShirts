package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final int priceOneShirtWithoutDiscount = 100;
        System.out.println("Цена одной рубашки без скидки : " + priceOneShirtWithoutDiscount);

        final int numberSelectedShirts = 4;
        System.out.println("Количество уже выбранных рубашек : " + numberSelectedShirts);

        final int numberShirtsNeedBuyGetDiscount = 5;
        System.out.println("Количество рубашек, которые надо купить, чтобы получить скидку : " + numberShirtsNeedBuyGetDiscount);

        int numberShirtsNeedAddedPurchasedGetDiscount = numberShirtsNeedBuyGetDiscount - numberSelectedShirts;
        /*С моим вычислением в некоторых случиях получались отрицательные числа я решил исправить это так*/
        if (numberShirtsNeedAddedPurchasedGetDiscount == 0 || numberShirtsNeedAddedPurchasedGetDiscount < 0) {
            System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку : " + 0);
        }
        System.out.println("Количество рубашек, которые надо добавить к купленным, чтобы получить скидку : " + numberShirtsNeedAddedPurchasedGetDiscount);

        int totalPriceAlreadySelectedShirtsWithoutDiscount = priceOneShirtWithoutDiscount * numberSelectedShirts;
        System.out.println("Общая цена уже выбранных рубашек без скидки : " + totalPriceAlreadySelectedShirtsWithoutDiscount);

        int totalPriceShirtsWithoutDiscountNeedBuyGetDiscount = numberShirtsNeedAddedPurchasedGetDiscount * priceOneShirtWithoutDiscount;
        /*При укказании большего числа рубашек чем нужно для скидки получались отрицательные числа*/
        if (totalPriceShirtsWithoutDiscountNeedBuyGetDiscount == 0 || totalPriceShirtsWithoutDiscountNeedBuyGetDiscount < 0) {
            System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку : " + 0);
        }
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку : " + totalPriceShirtsWithoutDiscountNeedBuyGetDiscount);

        final double percentDiscount = 20;
        System.out.println("Процент скидки : " + percentDiscount + " %");

        double allShirtsDiscounted = totalPriceAlreadySelectedShirtsWithoutDiscount - (totalPriceAlreadySelectedShirtsWithoutDiscount * (percentDiscount / 100));
        System.out.println("Цена всех рубашек со скидкой : " + allShirtsDiscounted);

        double discountPriceOneShirt = priceOneShirtWithoutDiscount - (priceOneShirtWithoutDiscount * (percentDiscount / 100));
        System.out.println("Цена одной рубашки со скидкой : " + discountPriceOneShirt);

        double amountMoneySavedShirtsBoughtWithDiscount = totalPriceAlreadySelectedShirtsWithoutDiscount * (percentDiscount / 100);
        System.out.println("Количество сэкономленных денег, если рубашки куплены скидкой : " + amountMoneySavedShirtsBoughtWithDiscount);

        double numberShirtsReceivedFreebieBecauseDiscount = amountMoneySavedShirtsBoughtWithDiscount / priceOneShirtWithoutDiscount;
        System.out.println("Количество рубашек, которые из-за скидки считай получены на халяву : " + numberShirtsReceivedFreebieBecauseDiscount);


    }
}
