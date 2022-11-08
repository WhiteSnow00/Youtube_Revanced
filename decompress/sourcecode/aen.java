import android.os.Build$VERSION;
import java.util.Locale;
import android.content.IntentSender;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aen
{
    public static void a(final Activity activity) {
        activity.finishAffinity();
    }
    
    public static void b(final Activity activity, final Intent intent, final int n, final Bundle bundle) {
        activity.startActivityForResult(intent, n, bundle);
    }
    
    public static void c(final Activity activity, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static boolean d(final String s, final String s2) {
        return !"REL".equals(s2) && s2.toUpperCase(Locale.ROOT).compareTo(s.toUpperCase(Locale.ROOT)) >= 0;
    }
    
    @Deprecated
    public static boolean e() {
        return Build$VERSION.SDK_INT >= 30;
    }
    
    @Deprecated
    public static boolean f() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT < 31) {
            if (Build$VERSION.SDK_INT >= 30) {
                if (!d("S", Build$VERSION.CODENAME)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static boolean g() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT < 33) {
            if (Build$VERSION.SDK_INT >= 32) {
                if (!d("Tiramisu", Build$VERSION.CODENAME)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
