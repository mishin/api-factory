package ru.sbtqa.tag.apifactory;

import ru.sbtqa.tag.qautils.properties.Props;

/**
 *
 *
 */
public class ApiFactory {

    private static ApiFactoryCore instance;
    private static String apiRequestUrl = Props.get("api.baseurl");

    private ApiFactory() {
        throw new IllegalAccessError("Singleton class");
    }
    
    /**
     * Get api factory
     *
     * @return api factory
     */
    public static ApiFactoryCore getApiFactory() {
        if (null == instance) {
            instance = new ApiFactoryCore(Props.get("api.entries.package"));
        }
        return instance;
    }

    /**
     * Get api request url
     *
     * @return request url
     */
    public static String getApiRequestUrl() {
        return apiRequestUrl;
    }

    /**
     * Set api request url
     *
     * @param apiRequestUrl request url
     */
    public static void setApiRequestUrl(String apiRequestUrl) {
        ApiFactory.apiRequestUrl = apiRequestUrl;
    }
}
