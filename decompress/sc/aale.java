import android.net.Uri;
import android.content.Context;
import j$.util.Optional;
import org.xml.sax.Attributes;
import java.util.Map;
import java.util.HashMap;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public class aale
{
    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";
    
    public static aujg A(final xvz xvz, final abjj abjj) {
        return new aujg(xvz, abjj);
    }
    
    public static aeea B() {
        final HashMap hashMap = new HashMap();
        hashMap.put("/transcript", new absi());
        hashMap.put("/transcript/text", new absh());
        hashMap.put("/timedtext", new absg());
        hashMap.put("/timedtext/window", new absf());
        hashMap.put("/timedtext/text", new absp());
        hashMap.put("/timedtext/head/pen", new abso());
        hashMap.put("/timedtext/head/ws", new absn());
        hashMap.put("/timedtext/head/wp", new absm());
        hashMap.put("/timedtext/body/w", new absl());
        hashMap.put("/timedtext/body/p", new absk());
        hashMap.put("/timedtext/body/p/s", new absj());
        return new aeea((Map)hashMap, (byte[])null, (byte[])null);
    }
    
    public static void c(final abbs abbs) {
        abbs.oE();
    }
    
    public static void d(final abbs abbs, final anew anew, final boolean b) {
        ajut ajut;
        if ((ajut = anew.c) == null) {
            ajut = ajut.a;
        }
        abbs.oG(acak.b(ajut).toString(), b);
    }
    
    public static void e(final abbs abbs, final long n, final long n2, final long n3, final long n4) {
        abbs.n(n, n2, n3, n4);
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                return 34;
            }
            case 8: {
                return 36;
            }
            case 6: {
                return 33;
            }
            case 5: {
                return 20;
            }
            case 4: {
                return 18;
            }
            case 3: {
                return 17;
            }
            case 2: {
                return 12;
            }
            case 1: {
                return 10;
            }
            case 0: {
                return 9;
            }
        }
    }
    
    public static int g(final Attributes attributes, final int n, final String... array) {
        for (int i = 0; i < array.length; ++i) {
            final String value = attributes.getValue(array[i]);
            if (value != null) {
                return tvb.b(value, n);
            }
        }
        return n;
    }
    
    public static int h(final float n) {
        return (int)(n * 1000.0f);
    }
    
    public static long i(final Attributes attributes, final long n, final String... array) {
        for (int i = 0; i <= 0; ++i) {
            final String value = attributes.getValue(array[i]);
            if (value != null) {
                return tvb.c(value, n);
            }
        }
        return n;
    }
    
    public static String j(final Attributes attributes, final String... array) {
        for (int i = 0; i < array.length; ++i) {
            final String value = attributes.getValue(array[i]);
            if (value != null) {
                return value;
            }
        }
        return null;
    }
    
    public static String k(final Attributes attributes, final String s, final String... array) {
        for (int i = 0; i <= 0; ++i) {
            final String value = attributes.getValue(array[i]);
            if (value != null) {
                return value;
            }
        }
        return s;
    }
    
    public static /* bridge */ boolean l(final Attributes attributes, final String[] array) {
        return g(attributes, 0, array) != 0;
    }
    
    public static abrc m(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final float n, final int n2, final String s9, final String s10, final Optional optional, final byte b) {
        if (s != null) {
            return new abrc(s, s2, s3, s4, s5, s6, s7, s8, n, n2, s9, s10, optional);
        }
        throw new IllegalStateException("Missing required properties:".concat(" startTimeString"));
    }
    
    public static Uri n(final Context context) {
        return tfg.k(context, "player", "backed_up_player_settings.pb");
    }
    
    public static ashi o(final ashi ashi, final aezf aezf) {
        return ashi.p().Y((asjr)new abqq(aezf, 1));
    }
    
    public static ashi p(final ashi ashi, final aezf aezf) {
        return ashi.p().Y((asjr)new abqq(aezf, 0));
    }
    
    public static ashm q(final int n) {
        return new abqr(n, 0);
    }
    
    public static void r(final Throwable t) {
        zlm.c(zll.b, zlk.j, "AdNotificationController failed unexpectedly while receiving an RX event.", t);
    }
    
    public static ashm s(final vaf vaf, final long n) {
        final anef a = abrj.A(vaf);
        long g;
        if (a != null) {
            g = a.g;
        }
        else {
            g = 0L;
        }
        Object m;
        if ((n & g) == 0x0L) {
            m = kxe.m;
        }
        else {
            final anef a2 = abrj.A(vaf);
            int h;
            if (a2 != null) {
                h = a2.h;
            }
            else {
                h = 0;
            }
            m = new abqr(h, 1);
        }
        return (ashm)m;
    }
    
    public static ashi t(final abpu abpu, final aezf aezf, final aezf aezf2) {
        return o((ashi)aezf.apply((Object)abpu), aezf2);
    }
    
    public static ablw u(final asid asid) {
        return new ablw(asid);
    }
    
    public static acxl v(final abpq abpq, final aboe aboe) {
        return new acxl(aboe, abpq);
    }
    
    public static abjj w(final ablw ablw, final aanx aanx) {
        return new abjj(ablw, aanx, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static afhd x(final aalh aalh) {
        aalh.getClass();
        return new afhd(aalh);
    }
    
    public static afaq y(final aglu aglu) {
        return (afaq)new yuk(aglu, 13, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static afhd z(final aglu aglu) {
        return new afhd(aglu, null, null, null, null);
    }
    
    public Uri a(final Uri uri) {
        return uri;
    }
    
    public boolean b(final Uri uri) {
        return false;
    }
}
