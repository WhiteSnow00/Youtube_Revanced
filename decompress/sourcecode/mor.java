import android.app.PendingIntent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class mor
{
    public static final int c;
    public static final mor d;
    
    static {
        final int c2 = mpd.c;
        c = 224400000;
        d = new mor();
    }
    
    public final int g(final Context context) {
        return this.h(context, mor.c);
    }
    
    public final int h(final Context context, int b) {
        b = mpd.b(context, b);
        if (mpd.f(context, b)) {
            return 18;
        }
        return b;
    }
    
    public final Intent i(final Context context, final int n, final String s) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return null;
            }
            return mtj.c();
        }
        else {
            if (context != null && meo.J(context)) {
                return mtj.a();
            }
            final StringBuilder sb = new StringBuilder("gcore_");
            sb.append(mor.c);
            sb.append("-");
            if (!TextUtils.isEmpty((CharSequence)s)) {
                sb.append(s);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            Label_0136: {
                if (context == null) {
                    break Label_0136;
                }
                try {
                    sb.append(muo.b(context).e(context.getPackageName(), 0).versionCode);
                    return mtj.b(sb.toString());
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    return mtj.b(sb.toString());
                }
            }
        }
    }
    
    public final PendingIntent j(final Context context, final int n, final String s) {
        final Intent i = this.i(context, n, s);
        if (i == null) {
            return null;
        }
        return nac.a(context, i, 201326592);
    }
}
