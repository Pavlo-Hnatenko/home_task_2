package ua.com.alevel.nix.pavlohnatenko.hometask2.builder;

import ua.com.alevel.nix.pavlohnatenko.hometask2.util.BundleUtil;

import java.util.Map;

public interface AbstractBuilder {

    default Map<String, String> getKeyValueMapByBundleProperties(String lang) {
        return BundleUtil.getBundleProperties(lang);
    }

    void buildDataList();
}
