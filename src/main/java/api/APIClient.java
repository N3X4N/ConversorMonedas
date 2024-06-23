package api;

import config.Config;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 * Clase APIClient para interactuar con la API de tipo de cambio.
 */
public class APIClient {
    // URL completa de la API, incluyendo la clave de API
    private static final String API_URL = Config.BASE_URL + Config.API_KEY + "/latest/";

    /**
     * Método para obtener las tasas de cambio desde la API.
     *
     * @param baseCurrency La moneda base para la cual obtener las tasas de cambio.
     * @return Un objeto JsonNode que contiene las tasas de cambio.
     */
    public JsonNode getExchangeRates(String baseCurrency) {
        // Mensaje de depuración para verificar la URL
        System.out.println("Solicitando URL: " + API_URL + baseCurrency);

        // Realiza una solicitud GET a la API
        HttpResponse<JsonNode> response = Unirest.get(API_URL + baseCurrency).asJson();

        // Verifica si la respuesta es exitosa (código 200)
        if (response.getStatus() == 200) {
            return response.getBody();
        } else {
            // Mensaje de depuración para verificar el estado de la respuesta
            System.out.println("Error: " + response.getStatusText());
            throw new RuntimeException("Failed to get exchange rates");
        }
    }
}
