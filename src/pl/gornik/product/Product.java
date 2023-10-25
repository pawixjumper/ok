package pl.gornik.product;

public class Product {
    String name;
    private String category;
    private double price;
    private double sizePack;
    private String unit;


    public Product(String name, String category, double price, double sizePack, String unit) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sizePack = sizePack;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "pl.gornik.product.Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", sizePack=" + sizePack +
                ", unit='" + unit + '\'' +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSizePack() {
        return sizePack;
    }

    public String getUnit() {
        return unit;
    }

    public double ileZaIle(){
        double unitPrice;
        switch (unit){
            case"kg","l" ->{
                return price/sizePack;
            }
            case"g","ml" ->{

                return (price * 1000/sizePack);
            }
            default -> {
                return price/sizePack;
            }
        }
    }

    public String cenaJednostkowa(){
            String bigU;
            if(unit == "g"){
                bigU ="kg";
            } else if (unit == "ml") {
                bigU = "l";
            }else{
                bigU =unit;
            }
        String kod = "cena za "+ name + " "+ sizePack+unit+ " to " + price + " : wynosi " + ileZaIle() +" za " + bigU;
            return kod;
    }
}
