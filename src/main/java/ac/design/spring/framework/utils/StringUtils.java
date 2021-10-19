package ac.design.spring.framework.utils;

/**
 * @Author acemma
 * @Date 22:12
 * @Description
 */
public class StringUtils {

    private StringUtils() {

    }

    public static String getSetterMethodByFieldName(String filedName) {
        String methodName = "set" + filedName.substring(0, 1).toUpperCase() + filedName.substring(1);
        return methodName;
    }

}
