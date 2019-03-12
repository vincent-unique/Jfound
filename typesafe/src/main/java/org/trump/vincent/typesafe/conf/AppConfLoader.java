package org.trump.vincent.typesafe.conf;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.util.StringUtils;

/**
 * Description:
 * User: vincent
 * Date: 2018/12/20
 **/
public class AppConfLoader {

    public static Config loadAppConf(String confFileName) {
        if (StringUtils.isEmpty(confFileName)) {
            confFileName = "app.conf";
        }
        return ConfigFactory.load(confFileName);
    }


    public static void main(String[] args) {
        Config config = loadAppConf("app.conf");
        System.out.print(String.format("ibatis.owner: %s",config.getString("ibatis.owner")));
    }
}
