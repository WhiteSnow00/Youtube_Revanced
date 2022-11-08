import java.math.BigInteger;
import android.os.Bundle;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjx
{
    private static final mnb a;
    private static final String b;
    private final String c;
    private final Map d;
    private final Map e;
    
    static {
        a = new mnb("ApplicationAnalyticsUtils");
        b = "21.2.1";
    }
    
    public mjx(final Bundle bundle, final String c) {
        this.c = c;
        this.d = mlc.n(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.e = mlc.n(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }
    
    public static void e(final afoy afoy, final boolean d) {
        final agza builder = ((agzi)afox.a).createBuilder((agzi)((afoz)afoy.instance).a());
        builder.copyOnWrite();
        final afox afox = (afox)builder.instance;
        afox.b |= 0x2;
        afox.d = d;
        afoy.copyOnWrite();
        afoz.f((afoz)afoy.instance, (afox)builder.build());
    }
    
    private static int f(final int n) {
        return n + 10000;
    }
    
    public final afoy a(final mjw mjw) {
        final afoy b = afoz.b();
        final long d = mjw.d;
        b.copyOnWrite();
        afoz.i((afoz)b.instance, d);
        final int n = mjw.e++;
        b.copyOnWrite();
        afoz.e((afoz)b.instance, n);
        final String c = mjw.c;
        if (c != null) {
            b.copyOnWrite();
            afoz.m((afoz)b.instance, c);
        }
        final String h = mjw.h;
        if (h != null) {
            b.copyOnWrite();
            afoz.j((afoz)b.instance, h);
        }
        final agza builder = ((agzi)afow.a).createBuilder();
        final String b2 = mjx.b;
        builder.copyOnWrite();
        final afow afow = (afow)builder.instance;
        b2.getClass();
        afow.b |= 0x2;
        afow.d = b2;
        final String c2 = this.c;
        builder.copyOnWrite();
        final afow afow2 = (afow)builder.instance;
        c2.getClass();
        afow2.b |= 0x1;
        afow2.c = c2;
        final afow afow3 = (afow)builder.build();
        b.copyOnWrite();
        afoz.g((afoz)b.instance, afow3);
        final agza builder2 = ((agzi)afox.a).createBuilder();
        if (mjw.b != null) {
            final agza builder3 = ((agzi)afpa.a).createBuilder();
            final String b3 = mjw.b;
            builder3.copyOnWrite();
            final afpa afpa = (afpa)builder3.instance;
            b3.getClass();
            afpa.b |= 0x1;
            afpa.c = b3;
            final afpa c3 = (afpa)builder3.build();
            builder2.copyOnWrite();
            final afox afox = (afox)builder2.instance;
            c3.getClass();
            afox.c = c3;
            afox.b |= 0x1;
        }
        builder2.copyOnWrite();
        final afox afox2 = (afox)builder2.instance;
        afox2.b |= 0x2;
        afox2.d = false;
        final String f = mjw.f;
        if (f != null) {
            long longValue;
            try {
                final String replace = f.replace("-", "");
                longValue = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            }
            catch (final NumberFormatException ex) {
                mjx.a.e(ex, "receiverSessionId %s is not valid for hash", f);
                longValue = 0L;
            }
            builder2.copyOnWrite();
            final afox afox3 = (afox)builder2.instance;
            afox3.b |= 0x4;
            afox3.e = longValue;
        }
        final int g = mjw.g;
        builder2.copyOnWrite();
        final afox afox4 = (afox)builder2.instance;
        afox4.b |= 0x400;
        afox4.h = g;
        final boolean i = mjw.i;
        builder2.copyOnWrite();
        final afox afox5 = (afox)builder2.instance;
        afox5.b |= 0x800;
        afox5.i = i;
        b.copyOnWrite();
        afoz.f((afoz)b.instance, (afox)builder2.build());
        return b;
    }
    
    public final afoz b(final mjw mjw) {
        return (afoz)this.a(mjw).build();
    }
    
    public final afoz c(final mjw mjw, int g) {
        final afoy a = this.a(mjw);
        final agza builder = ((agzi)afox.a).createBuilder((agzi)((afoz)a.instance).a());
        final Map e = this.e;
        int f = 0;
        Label_0095: {
            if (e != null) {
                final Integer value = g;
                if (e.containsKey(value)) {
                    final Integer n = this.e.get(value);
                    kgk.aL((Object)n);
                    f = n;
                    break Label_0095;
                }
            }
            f = f(g);
        }
        builder.copyOnWrite();
        final afox afox = (afox)builder.instance;
        afox.b |= 0x40;
        afox.f = f;
        final Map d = this.d;
        Label_0196: {
            if (d != null) {
                final Integer value2 = g;
                if (d.containsKey(value2)) {
                    final Integer n2 = this.d.get(value2);
                    kgk.aL((Object)n2);
                    g = n2;
                    break Label_0196;
                }
            }
            g = f(g);
        }
        builder.copyOnWrite();
        final afox afox2 = (afox)builder.instance;
        afox2.b |= 0x80;
        afox2.g = g;
        final afox afox3 = (afox)builder.build();
        a.copyOnWrite();
        afoz.f((afoz)a.instance, afox3);
        return (afoz)a.build();
    }
    
    public final afoz d(final mjw mjw, final int j) {
        final afoy a = this.a(mjw);
        final agza builder = ((agzi)afox.a).createBuilder((agzi)((afoz)a.instance).a());
        builder.copyOnWrite();
        final afox afox = (afox)builder.instance;
        afox.b |= 0x1000;
        afox.j = j;
        final afox afox2 = (afox)builder.build();
        a.copyOnWrite();
        afoz.f((afoz)a.instance, afox2);
        return (afoz)a.build();
    }
}
