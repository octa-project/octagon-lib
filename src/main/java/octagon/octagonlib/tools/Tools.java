package octagon.octagonlib.tools;

import java.util.List;

public class Tools {

    public static String SUCCESS_MN = "Амжилттай";


    public static boolean isNullOrZero(Long value) {
        return value == null || value.equals(0L);
    }

    public static boolean isNullOrEmptyList(List<?> listAny) {
        return listAny == null || listAny.isEmpty();
    }

    public static boolean isNullOrEmpty(Object value) {
        return value == null || convertToStringLower(value) == "" || convertToStringLower(value).equals("null");
    }

    public static String convertToStringLower(Object value) {
        return convertToString(value).toLowerCase();
    }

    public static String convertToString(Object value) {
        return value == null ? "" : value.toString();
    }

}
