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

public class aana
{
    @Backup
    public static final String QUICK_SEEK_PREFERENCE_STRING = "double_tap_skip_duration";
    
    public static adzx A(final agnl agnl) {
        return new adzx(agnl, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static aefs B() {
        final HashMap hashMap = new HashMap();
        hashMap.put("/transcript", new abtt());
        hashMap.put("/transcript/text", new abts());
        hashMap.put("/timedtext", new abtr());
        hashMap.put("/timedtext/window", new abtq());
        hashMap.put("/timedtext/text", new abua());
        hashMap.put("/timedtext/head/pen", new abtz());
        hashMap.put("/timedtext/head/ws", new abty());
        hashMap.put("/timedtext/head/wp", new abtx());
        hashMap.put("/timedtext/body/w", new abtw());
        hashMap.put("/timedtext/body/p", new abtv());
        hashMap.put("/timedtext/body/p/s", new abtu());
        return new aefs(hashMap, null);
    }
    
    public static void c(final abcy abcy) {
        abcy.oC();
    }
    
    public static void d(final abcy abcy, final anhd anhd, final boolean b) {
        ajws ajws;
        if ((ajws = anhd.c) == null) {
            ajws = ajws.a;
        }
        abcy.oE(acbu.b(ajws).toString(), b);
    }
    
    public static void e(final abcy abcy, final long n, final long n2, final long n3, final long n4) {
        abcy.n(n, n2, n3, n4);
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
                return twd.b(value, n);
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
                return twd.c(value, n);
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
    
    public static abso m(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final float n, final int n2, final String s9, final String s10, final Optional optional, final byte b) {
        if (s != null) {
            return new abso(s, s2, s3, s4, s5, s6, s7, s8, n, n2, s9, s10, optional);
        }
        throw new IllegalStateException("Missing required properties:".concat(" startTimeString"));
    }
    
    public static Uri n(final Context context) {
        return tgj.l(context, "player", "backed_up_player_settings.pb");
    }
    
    public static aske o(final aske aske, final afax afax) {
        return aske.p().Y(new absa(afax, 0));
    }
    
    public static aske p(final aske aske, final afax afax) {
        return aske.p().Y(new absa(afax, 2));
    }
    
    public static aski q(final int n) {
        return new absb(n, 0);
    }
    
    public static void r(final Throwable t) {
        znh.c(zng.b, znf.j, "AdNotificationController failed unexpectedly while receiving an RX event.", t);
    }
    
    public static aski s(final vbo vbo, final long n) {
        final angm a = absv.A(vbo);
        long g;
        if (a != null) {
            g = a.g;
        }
        else {
            g = 0L;
        }
        Object m;
        if ((n & g) == 0x0L) {
            m = kxn.m;
        }
        else {
            final angm a2 = absv.A(vbo);
            int h;
            if (a2 != null) {
                h = a2.h;
            }
            else {
                h = 0;
            }
            m = new absb(h, 1);
        }
        return (aski)m;
    }
    
    public static aske t(final abqz abqz, final afax afax, final afax afax2) {
        return o((aske)afax.apply(abqz), afax2);
    }
    
    public static abnd u(final askz askz) {
        return new abnd(askz);
    }
    
    public static aapu v(final xxy xxy, final abkq abkq) {
        return new aapu(xxy, abkq);
    }
    
    public static abkq w(final abnd abnd, final abwe abwe) {
        return new abkq(abnd, abwe, (byte[])null, (byte[])null);
    }
    
    public static acyy x(final abqv abqv, final abpl abpl) {
        return new acyy(abpl, abqv);
    }
    
    public static adzx y(final aand aand) {
        aand.getClass();
        return new adzx(aand);
    }
    
    public static afci z(final agnl agnl) {
        return (afci)new yyl(agnl, 12, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public Uri a(final Uri uri) {
        return uri;
    }
    
    public boolean b(final Uri uri) {
        return false;
    }
}
