package cat.paucasesnovescifp.practica01.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleUtil {
    public static final String DEFAULT_LOCALE_NAME = "ca-ES";
    public static final ResourceBundle DEFAULT_LOCALE
            = ResourceBundle.getBundle("Bundle", getLocaleFromString(DEFAULT_LOCALE_NAME));
    
    public static String getLocalizedString(String stringId) {
        return DEFAULT_LOCALE.getString(stringId);
    }
    
    private static Locale getLocaleFromString(String locale) {
        String[] splitLocale = locale.split("-");
        return Locale.of(splitLocale[0], splitLocale[1]);
    }
}
