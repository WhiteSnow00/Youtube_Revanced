import java.security.AccessControlException;
import java.io.IOException;
import java.util.MissingResourceException;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.io.InputStream;
import java.util.Properties;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b
{
    private static final Properties a;
    
    static {
        final Properties properties = a = new Properties();
        try {
            InputStream resourceAsStream;
            if (System.getSecurityManager() != null) {
                resourceAsStream = AccessController.doPrivileged((PrivilegedAction<InputStream>)new aumx(c.class, 1));
            }
            else {
                resourceAsStream = c.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        }
        catch (final MissingResourceException | IOException ex) {}
    }
    
    public static String a() {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = AccessController.doPrivileged((PrivilegedAction<String>)new a());
            }
            catch (final AccessControlException ex) {
                property = null;
            }
        }
        else {
            property = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        String property2 = property;
        if (property == null) {
            property2 = b.a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL");
        }
        return property2;
    }
}
