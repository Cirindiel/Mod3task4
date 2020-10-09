public class SpecialOffer {
    Product product;
    String description;
    int time;
    double discount;
    SpecialOffer(Product p, String d, int t, double dis){
        product = p;
        description = d;
        //Nie widziałem jak zapisać czas od do, więc po prostu wstawiłem tutaj liczbę dni.
        time = t;
        discount = dis;
    }
}
