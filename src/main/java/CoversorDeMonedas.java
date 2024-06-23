import api.APIClient;
import converter.CurrencyConverter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoversorDeMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIClient apiClient = new APIClient();

        CurrencyConverter currencyConverter = new CurrencyConverter(apiClient);

        System.out.println("Introduce la moneda de origen (por ejemplo , COP): ");
        String fromCurrency = scanner.nextLine().toUpperCase();


        System.out.println("Introduce la moneda de destino (por ejemplo , USD): ");
        String toCurrency = scanner.nextLine().toUpperCase();


        System.out.println("Introduce la cantidad a convertir: ");
        double amount = scanner.nextDouble();

        //conversion
        double result = currencyConverter.convert(fromCurrency, toCurrency, amount);
        System.out.println(amount+ " "+ fromCurrency + " = "+result + " " +toCurrency);

    }
}
