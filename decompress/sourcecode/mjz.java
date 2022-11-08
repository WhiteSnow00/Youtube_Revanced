import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.i;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import android.os.Handler;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjz
{
    public static final String a;
    private static mjz j;
    public final mjs b;
    public final SharedPreferences c;
    public final String d;
    public final Runnable e;
    public final Handler f;
    public final Set g;
    public final Set h;
    public long i;
    
    static {
        new mnb("FeatureUsageAnalytics");
        a = "21.2.1";
    }
    
    private mjz(final SharedPreferences c, final mjs b, final String d) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.g = new HashSet();
        this.h = new HashSet();
        this.f = new aeke(Looper.getMainLooper(), (byte[])null);
        this.e = new i(this, 19);
    }
    
    public static mjz a(final SharedPreferences sharedPreferences, final mjs mjs, final String s) {
        synchronized (mjz.class) {
            if (mjz.j == null) {
                mjz.j = new mjz(sharedPreferences, mjs, s);
            }
            return mjz.j;
        }
    }
    
    public static afou b(final String s) {
        afou afou;
        try {
            afou = afou.a(Integer.parseInt(s));
        }
        catch (final NumberFormatException ex) {
            afou = afou.a;
        }
        return afou;
    }
    
    public static String c(final String s, final String s2) {
        return String.format("%s%s", s, s2);
    }
    
    public static void e(final afou afou) {
        final mjz j = mjz.j;
        if (j == null) {
            return;
        }
        j.c.edit().putLong(j.d(h(afou)), System.currentTimeMillis()).apply();
        j.g.add(afou);
        j.g();
    }
    
    public static final String h(final afou afou) {
        return Integer.toString(afou.ad);
    }
    
    public final String d(final String s) {
        final String c = c("feature_usage_timestamp_reported_feature_", s);
        if (this.c.contains(c)) {
            return c;
        }
        return c("feature_usage_timestamp_detected_feature_", s);
    }
    
    public final void f(final Set set) {
        if (set.isEmpty()) {
            return;
        }
        final SharedPreferences$Editor edit = this.c.edit();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            edit.remove((String)iterator.next());
        }
        edit.apply();
    }
    
    public final void g() {
        this.f.post(this.e);
    }
}
