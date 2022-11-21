import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.util.Locale;
import android.content.Context;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import android.webkit.WebSettings;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjm
{
    static void a(final View view, final int n, final int n2, final int n3, final int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }
    
    @Deprecated
    public static void b(final WebSettings webSettings, final int forceDark) {
        final cll b = clw.b;
        if (b.a()) {
            clq.d(webSettings, forceDark);
            return;
        }
        if (((cln)b).d()) {
            ((WebSettingsBoundaryInterface)auig.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)clx.a.a).convertSettings(webSettings))).setForceDark(forceDark);
            return;
        }
        throw clw.a();
    }
    
    public static final String c(final Context context, final int n, final Object... array) {
        return d(Locale.getDefault(), context.getResources().getString(n), array);
    }
    
    public static final String d(final Locale locale, final String s, final Object... array) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h.a(locale, s, array);
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    public static final dai e(final int a, final String b) {
        final dai dai = new dai();
        dai.a = a;
        dai.b = b;
        return dai;
    }
}
