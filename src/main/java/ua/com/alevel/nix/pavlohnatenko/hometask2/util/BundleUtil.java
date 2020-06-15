package ua.com.alevel.nix.pavlohnatenko.hometask2.util;

import java.util.*;

public class BundleUtil {

    private static final ResourceBundle RESOURCE_INGREDIENTS_EN = ResourceBundle.getBundle("ingredients_en");
    private static final ResourceBundle RESOURCE_INGREDIENTS_RU = ResourceBundle.getBundle("ingredients_ru");

    public static Map<String, String> getBundleProperties(String lang) {
        return convertResourceBundleToMap(getBundle(lang));
    }

    private static Map<String, String> convertResourceBundleToMap(ResourceBundle resource) {
        Map<String, String> map = new HashMap<>();
        Enumeration<String> keys = resource.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            map.put(key, resource.getString(key));
        }
        return map;
    }

    private static ResourceBundle getBundle(String lang) {
        if (lang.isBlank() || lang.equals("en")) {
            return RESOURCE_INGREDIENTS_EN;
        } else {
            return RESOURCE_INGREDIENTS_RU;
        }
    }
}
