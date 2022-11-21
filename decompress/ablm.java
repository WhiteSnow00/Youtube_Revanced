import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablm extends abkt
{
    public static final aisc g(final String s, final String s2, final int n, final float n2) {
        return (aisc)((ahcr)n(s, s2, n, n2, null, null)).build();
    }
    
    public static final int m(final apuw apuw) {
        return aamr.h(apuw.f, apuw.e);
    }
    
    public static final ahct n(final String d, final String e, final int f, final float k, final String m, final String h) {
        final ahcr builder = apuw.a.createBuilder();
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final apuw apuw = (apuw)builder.instance;
            d.getClass();
            apuw.b |= 0x1;
            apuw.d = d;
        }
        if (!TextUtils.isEmpty((CharSequence)e)) {
            builder.copyOnWrite();
            final apuw apuw2 = (apuw)builder.instance;
            e.getClass();
            apuw2.b |= 0x2;
            apuw2.e = e;
        }
        if (!TextUtils.isEmpty((CharSequence)m)) {
            builder.copyOnWrite();
            final apuw apuw3 = (apuw)builder.instance;
            m.getClass();
            apuw3.b |= 0x800;
            apuw3.m = m;
        }
        if (!TextUtils.isEmpty((CharSequence)h)) {
            builder.copyOnWrite();
            final apuw apuw4 = (apuw)builder.instance;
            h.getClass();
            apuw4.b |= 0x20;
            apuw4.h = h;
        }
        builder.copyOnWrite();
        final apuw apuw5 = (apuw)builder.instance;
        apuw5.b |= 0x4;
        apuw5.f = f;
        builder.copyOnWrite();
        final apuw apuw6 = (apuw)builder.instance;
        apuw6.b |= 0x100;
        apuw6.k = k;
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)WatchEndpointOuterClass.watchEndpoint, (Object)builder.build());
        return ahct;
    }
    
    public final ahci a() {
        return WatchEndpointOuterClass.watchEndpoint;
    }
    
    public final String c(final Object o) {
        return ((apuw)o).e;
    }
    
    public final String d(final Object o) {
        return ((apuw)o).d;
    }
    
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final apuw apuw = (apuw)o;
        final apuw apuw2 = (apuw)o2;
        final boolean c = aexq.c(apuw, apuw2);
        boolean b = true;
        if (!c) {
            final String e = apuw.e;
            final int m = m(apuw);
            final String e2 = apuw2.e;
            final int i = m(apuw2);
            if (TextUtils.equals((CharSequence)e, (CharSequence)e2) && (TextUtils.equals((CharSequence)"", (CharSequence)e) || Math.abs(m - i) <= 1)) {
                return TextUtils.equals((CharSequence)apuw.d, (CharSequence)apuw2.d);
            }
            b = false;
        }
        return b;
    }
    
    public final /* bridge */ lrt q(final Object o) {
        final apuw apuw = (apuw)o;
        final ahcr builder = ((ahcz)lrt.a).createBuilder();
        final String d = apuw.d;
        builder.copyOnWrite();
        final lrt lrt = (lrt)builder.instance;
        d.getClass();
        final int b = lrt.b;
        int n = 1;
        lrt.b = (b | 0x1);
        lrt.d = d;
        final String e = apuw.e;
        builder.copyOnWrite();
        final lrt lrt2 = (lrt)builder.instance;
        e.getClass();
        lrt2.b |= 0x2;
        lrt2.f = e;
        final int m = m(apuw);
        builder.copyOnWrite();
        final lrt lrt3 = (lrt)builder.instance;
        lrt3.b |= 0x4;
        lrt3.g = m;
        final String g = apuw.g;
        builder.copyOnWrite();
        final lrt lrt4 = (lrt)builder.instance;
        g.getClass();
        lrt4.b |= 0x8;
        lrt4.h = g;
        final String h = apuw.h;
        builder.copyOnWrite();
        final lrt lrt5 = (lrt)builder.instance;
        h.getClass();
        lrt5.b |= 0x10;
        lrt5.i = h;
        final String i = apuw.m;
        builder.copyOnWrite();
        final lrt lrt6 = (lrt)builder.instance;
        i.getClass();
        lrt6.b |= 0x400;
        lrt6.o = i;
        final boolean j = apuw.i;
        builder.copyOnWrite();
        final lrt lrt7 = (lrt)builder.instance;
        lrt7.b |= 0x80;
        lrt7.l = j;
        final boolean k = apuw.j;
        builder.copyOnWrite();
        final lrt lrt8 = (lrt)builder.instance;
        lrt8.b |= 0x100;
        lrt8.m = k;
        builder.copyOnWrite();
        final lrt lrt9 = (lrt)builder.instance;
        lrt9.b |= 0x40;
        lrt9.k = false;
        final long millis = TimeUnit.SECONDS.toMillis((long)apuw.k);
        builder.copyOnWrite();
        final lrt lrt10 = (lrt)builder.instance;
        lrt10.b |= 0x200;
        lrt10.n = millis;
        if ((apuw.b & 0x80000) != 0x0) {
            amzw amzw;
            if ((amzw = apuw.q) == null) {
                amzw = amzw.a;
            }
            if ((amzw.b & 0x2) != 0x0) {
                amzw amzw2;
                if ((amzw2 = apuw.q) == null) {
                    amzw2 = amzw.a;
                }
                amzu u;
                if ((u = amzw2.d) == null) {
                    u = amzu.a;
                }
                builder.copyOnWrite();
                final lrt lrt11 = (lrt)builder.instance;
                u.getClass();
                lrt11.u = u;
                lrt11.b |= 0x80000;
            }
            final amzw q = apuw.q;
            amzw a;
            if (q == null) {
                a = amzw.a;
            }
            else {
                a = q;
            }
            if ((a.b & 0x1) != 0x0) {
                amzw a2;
                if ((a2 = q) == null) {
                    a2 = amzw.a;
                }
                amzt t;
                if ((t = a2.c) == null) {
                    t = amzt.a;
                }
                builder.copyOnWrite();
                final lrt lrt12 = (lrt)builder.instance;
                t.getClass();
                lrt12.t = t;
                lrt12.b |= 0x20000;
            }
        }
        for (final Map.Entry<String, V> entry : Collections.unmodifiableMap((Map<?, ?>)apuw.t).entrySet()) {
            final String s = entry.getKey();
            final String s2 = (String)entry.getValue();
            s.getClass();
            s2.getClass();
            builder.copyOnWrite();
            final lrt lrt13 = (lrt)builder.instance;
            final ahej z = lrt13.z;
            if (!z.b) {
                lrt13.z = z.a();
            }
            ((Map<String, String>)lrt13.z).put(s, s2);
        }
        final int b2 = apuw.b;
        if ((Integer.MIN_VALUE & b2) != 0x0) {
            final int ck = aqvq.cK(apuw.w);
            if (ck != 0) {
                n = ck;
            }
            builder.copyOnWrite();
            final lrt lrt14 = (lrt)builder.instance;
            lrt14.A = n - 1;
            lrt14.b |= 0x8000000;
        }
        else if ((b2 & 0x20000000) != 0x0 && apuw.u) {
            builder.copyOnWrite();
            final lrt lrt15 = (lrt)builder.instance;
            lrt15.A = 2;
            lrt15.b |= 0x8000000;
        }
        if ((apuw.c & 0x4) != 0x0) {
            apuq c;
            if ((c = apuw.y) == null) {
                c = apuq.a;
            }
            builder.copyOnWrite();
            final lrt lrt16 = (lrt)builder.instance;
            c.getClass();
            lrt16.C = c;
            lrt16.b |= 0x20000000;
        }
        if ((apuw.c & 0x10) != 0x0) {
            final ahbt z2 = apuw.z;
            builder.copyOnWrite();
            final lrt lrt17 = (lrt)builder.instance;
            z2.getClass();
            lrt17.b |= 0x40000000;
            lrt17.D = z2;
        }
        if ((apuw.c & 0x80) != 0x0) {
            final String b3 = apuw.B;
            builder.copyOnWrite();
            final lrt lrt18 = (lrt)builder.instance;
            b3.getClass();
            lrt18.c |= 0x2;
            lrt18.G = b3;
        }
        return (lrt)builder.build();
    }
}
