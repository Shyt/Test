package MyEnum;

public class MyEnum {

    enum CoffeSize{ SMALL, MEDIUM, BIG}

    public static void main(String[] args){
        Cars car = Cars.FERRARI;
        System.out.println(car.name()); //FERRARI
        System.out.println(car.toString()); //Enum
        System.out.println(car.ordinal()); // индекс [0]

        Cars myMarka = Cars.valueOf("FERRARI");
        System.out.println(myMarka.getTranslation()); //Феррари

       /* switch (car){
            case FERRARI:
                System.out.println("Это ferrari");
                break;
            case TOYOTA:
                System.out.println("Это toyota");
                break;
            default:
                break;
        }
        */
    }
}

enum Cars{
    FERRARI("Феррари"), TOYOTA("Тоюта");

    private String translation;

    Cars(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Enum";
    }
}