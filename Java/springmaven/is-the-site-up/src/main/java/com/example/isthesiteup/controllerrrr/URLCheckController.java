package com.example.isthesiteup.controllerrrr;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLCheckController {
    private final String SITE_IS_UP = "Site is up!";
    private final String SITE_IS_DOWN = "Site is down!";
    private final String MAL_FORMEDURL = "URL is incorrect!";

    @GetMapping("/check2")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCodeCategory = connection.getResponseCode() / 100;
            Logger.getGlobal().info("response: " + connection.getResponseCode());
            if (responseCodeCategory != 2 && responseCodeCategory != 3) {
                returnMessage = SITE_IS_DOWN;
            } else {
                returnMessage = SITE_IS_UP;
            }
        } catch (MalformedURLException e) {
            returnMessage = MAL_FORMEDURL;
        } catch (IOException e) {
            returnMessage = SITE_IS_DOWN;
        }
        return returnMessage;
    }

    @GetMapping("/check")
    public String getUrlStatusMessage2(@RequestParam String url) {
        String returnMessage = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCodeCategory = connection.getResponseCode() / 100;
            Logger.getGlobal().info("response: " + connection.getResponseCode());
            if (responseCodeCategory != 2 && responseCodeCategory != 3) {
                returnMessage = SITE_IS_DOWN;
            } else {
                returnMessage = SITE_IS_UP;
            }
        } catch (MalformedURLException e) {
            returnMessage = MAL_FORMEDURL;
        } catch (IOException e) {
            returnMessage = SITE_IS_DOWN;
        }
        return returnMessage;
    }
}
