public class Test {
    public static void main(String[] args) {
        Category category1 = new Category("Czekolady", "Coś dla fanów tabliczek");
        Category category2 = new Category("Żelki", "Cukier w miśkach lub kulkach");
        //Szczerze mówiąc nie byłem pewny co do tego jak zapisać product w "żadnej" kategorii daltego po prsotu stowrzylem Kategorię bez kategorii
        Category category3 = new Category("Bez kategorii", "Tu znajdziesz wszystkie rzeczy nie pasujące do żadnej innej kategorii");
        Product product1 = new Product("Czekolada biała", 3.6,"Biała czekolada to tak naprawę nie czekolada", category1);
        Product product2 = new Product("Czekolada gorzka", 6.3,"Ratunek podczas sesji", category1);
        Product product3 = new Product("Żelki Haribo", 5.2,"Klasyczne i modne", category2);
        Product product4 = new Product("Kosiarka spalinowa", 599.99,"Idealna na działkę", category3);

        SpecialOffer specialOffer = new SpecialOffer(product1, "Rozgrzej się białą czekoladą na zimę", 15, 0.2);

        System.out.println(product1.name + " po " + product1.price + "zł");
        System.out.println(product1.description);
        System.out.println("Produkt pochodzi z kategorii: " + product1.category.name);
        System.out.println("Opis kategorii: " + product1.category.description);
        System.out.println();

        System.out.println(product2.name + " po " + product2.price + "zł");
        System.out.println(product2.description);
        System.out.println("Produkt pochodzi z kategorii: " + product2.category.name);
        System.out.println("Opis kategorii: " + product2.category.description);
        System.out.println();

        System.out.println(product3.name + " po " + product3.price + "zł");
        System.out.println(product3.description);
        System.out.println("Produkt pochodzi z kategorii: " + product3.category.name);
        System.out.println("Opis kategorii: " + product3.category.description);
        System.out.println();

        System.out.println(product4.name + " po " + product4.price + "zł");
        System.out.println(product4.description);
        System.out.println("Produkt pochodzi z kategorii: " + product4.category.name);
        System.out.println("Opis kategorii: " + product4.category.description);

    }
}
