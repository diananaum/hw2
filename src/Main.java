public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);;

        System.out.println();
        System.out.println(service.calculate(40));

        System.out.println();
        System.out.println(service.calculate(202_020));

    }
}