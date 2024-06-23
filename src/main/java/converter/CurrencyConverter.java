package converter;

import api.APIClient;
import kong.unirest.JsonNode;
import kong.unirest.json.JSONObject;

public class CurrencyConverter {

    private APIClient apiClient;

    /*instancia de API*/
    public CurrencyConverter(APIClient apiClient) {
        this.apiClient = apiClient;
    }

    /*converte de uma moeda para outra*/
    public double convert(String fromCurrency, String toCurrency, double amount) {
        /* tasas de cambio*/
        JsonNode exchangeRates = apiClient.getExchangeRates(fromCurrency);

        /*extrae tasas de cambio en json*/
        JSONObject rates = exchangeRates.getObject().getJSONObject("conversion_rates");

        /*tasa de cambion para la moneda de destino*/
        double rate = rates.getDouble(toCurrency);
        return amount * rate;
    }
}
