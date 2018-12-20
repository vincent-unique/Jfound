package org.trump.vincent.typesafe.conf.merge;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.util.StringUtils;

/**
 * Description:
 * User: liwei
 * Date: 2018/12/20
 **/
public class TypeConfMergeLoader {
    public static final String TYPE_DEFAULT_CONF="merge/type_default.conf";
    public static final String TYPE_OVERRIDE_CONF="merge/type_override.conf";

    public static Config defaultConfig(String defualtConfPath) {
        if (StringUtils.isEmpty(defualtConfPath)) {
            defualtConfPath = TYPE_DEFAULT_CONF;
        }
        Config defaultConf = ConfigFactory.parseResources("defaults.conf");
        return defaultConf;
    }

    public static Config mergeConf(String defaultConfPath, String mergeConfPath) {
        if (StringUtils.isEmpty(defaultConfPath)) {
            defaultConfPath = TYPE_DEFAULT_CONF;
        }
        Config defaultConf = ConfigFactory.parseResources(defaultConfPath);
        if (StringUtils.isEmpty(mergeConfPath)) {
            mergeConfPath= TYPE_OVERRIDE_CONF;
        }
        Config config = ConfigFactory.parseResources(mergeConfPath)
                .withFallback(defaultConf);
        return config;
    }

    public static void main(String[] args) {
        Config config = mergeConf(TYPE_DEFAULT_CONF, TYPE_OVERRIDE_CONF);

        System.out.print(String.format("conf.name: %s", config.getString("conf.name")));
    }
}
